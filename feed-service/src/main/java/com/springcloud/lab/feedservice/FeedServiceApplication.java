package com.springcloud.lab.feedservice;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.didispace.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableCaching
@EnableScheduling
@EnableSwagger2Doc
public class FeedServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(FeedServiceApplication.class, args);
	}

    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverter(){
        FastJsonHttpMessageConverter fastJsonConverter = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(
                SerializerFeature.PrettyFormat
        );
        fastJsonConverter.setFastJsonConfig(fastJsonConfig);

        HttpMessageConverter<?> converter = fastJsonConverter;
        return new HttpMessageConverters(fastJsonConverter);
    }
}
