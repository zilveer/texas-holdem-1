package com.spider.app;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author lxx
 * @Date 2017/11/8.19:07
 */
@EnableAutoConfiguration
@SpringBootApplication
@ServletComponentScan
@EnableCaching
@EnableAsync(proxyTargetClass = true)
@EnableAspectJAutoProxy(proxyTargetClass = true)
@MapperScan("com.spider.dao")
public class TexasHoldemApplication extends SpringBootServletInitializer {
    private static Logger logger = LoggerFactory.getLogger(TexasHoldemApplication.class);
    public static void main(String[] args) {
        try {
            SpringApplication.run(TexasHoldemApplication.class, args);
        }catch (Exception e){
            logger.error("启动出错",e);
        }
        logger.debug("启动成功");
        //cache the runner

    }


}
