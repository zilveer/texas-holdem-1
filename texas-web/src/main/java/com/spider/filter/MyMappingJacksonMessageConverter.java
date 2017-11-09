package com.spider.filter;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;

/**
 *@author lxx
 */
public class MyMappingJacksonMessageConverter extends MappingJackson2HttpMessageConverter {
    private List<String> excludeUrl;
    private Logger log  = LoggerFactory.getLogger(MyMappingJacksonMessageConverter.class);
    @Override
    protected void writePrefix(JsonGenerator generator, Object object) throws IOException {
        super.writePrefix(generator, object);
    }

    @Override
    protected void writeSuffix(JsonGenerator generator, Object object) throws IOException {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String  cmd = request.getServletPath();
        if(!contiansUrl(cmd)){
            Object startTimeValueTemp =request.getAttribute("startTimeValue");
            long time = 0;
            if(startTimeValueTemp != null){
                long startTimeValue = (long) startTimeValueTemp;
                long endTimeValue = System.currentTimeMillis();
                time = endTimeValue-startTimeValue;
            }
            log.info("[<--返回][url={}][totalTime={}ms][[data={}]",request.getServletPath(),time, JSON.toJSONString(object));
        }
        super.writeSuffix(generator, object);
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
}
