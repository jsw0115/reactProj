package com.spring.reactProj.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.mobile.device.DeviceResolverHandlerInterceptor;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/** Mobile InterCeptor 추가
 *  @author jsw01
 *  @since 2024.10.13
*/
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor((HandlerInterceptor) new DeviceResolverHandlerInterceptor());
    }
}
