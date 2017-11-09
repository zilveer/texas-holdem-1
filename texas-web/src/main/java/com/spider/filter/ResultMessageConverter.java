package com.spider.filter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import com.spider.core.Result;

/**
 * @author lxx
 * @param <T>
 */
public class ResultMessageConverter<T> extends AbstractHttpMessageConverter<T> {
    private List<String> excludeUrl;
    private Logger log  = LoggerFactory.getLogger(ResultMessageConverter.class);
    @Override
    protected boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    protected T readInternal(Class<? extends T> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        return null;
    }


    @Override
    protected void writeInternal(T t, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String  cmd = request.getServletPath();
        if(!contiansUrl(cmd)){
            Object startTimeValueTemp =request.getAttribute("startTimeValue");
            long time = 0;
            if(startTimeValueTemp != null){
                long startTimeValue = (long) startTimeValueTemp;
                long endTimeValue = System.currentTimeMillis();
                time = endTimeValue-startTimeValue;
                if(t instanceof Result){
                    Result result = (Result) t;
                    log.info("[<--返回][url={}][totalTime={}ms][status={}][msg={}][data={}]",request.getServletPath(),time,result.getStatus(),result.getMessage(),toJSONString(result.getData()));
                }else if (t instanceof Map){
                    Map map = (Map) t;
                    log.info("[<--返回][url={}][totalTime={}ms][status={}][msg={}][data={}]",request.getServletPath(),time,map.get("status"),map.get("message"),toJSONString(map));
                }else{
                    log.info("[<--返回][url={}][totalTime={}ms][[data={}]",request.getServletPath(),time,toJSONString(t));
                }
            }

        }
    }

    private boolean contiansUrl(String cmd) {
        if(excludeUrl == null){
            return false;
        }
        for (String url:excludeUrl){
            Pattern pattern = Pattern.compile(url);
            boolean flag = pattern.matcher(cmd).find();
            if(flag){
                return true;
            }
        }
        return false;
    }

    public List<String> getExcludeUrl() {
        return excludeUrl;
    }

    public void setExcludeUrl(List<String> excludeUrl) {
        this.excludeUrl = excludeUrl;
    }

    private String toJSONString(Object result) {
        return JSON.toJSONString(result, SerializerFeature.DisableCircularReferenceDetect);
    }
}
