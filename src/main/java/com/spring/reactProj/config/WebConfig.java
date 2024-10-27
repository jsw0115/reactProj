package com.spring.reactProj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mobile.device.DeviceResolverHandlerInterceptor;
import org.springframework.mobile.device.switcher.SiteSwitcherHandlerInterceptor;
import org.springframework.mobile.device.view.LiteDeviceDelegatingViewResolver;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/** Mobile InterCeptor 추가
 *  @author jsw01
 *  @since 2024.10.13
*/
@Configuration
public class WebConfig implements WebMvcConfigurer {

    /** 버전을 업데이트 하거나 라이브러리 사용할때 호환성 뿐만 아니라 Deprecated 영향이 있는지도 확인해보자!
     *
     * @since 2024.10.13
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(deviceResolverHandlerInterceptor());
        registry.addInterceptor(siteSwitcherHandlerInterceptor());
    }

    @Bean
    public DeviceResolverHandlerInterceptor deviceResolverHandlerInterceptor() {

        return new DeviceResolverHandlerInterceptor();
    }

    @Bean
    public SiteSwitcherHandlerInterceptor siteSwitcherHandlerInterceptor() {

        return SiteSwitcherHandlerInterceptor.urlPath("/m", "/m", "/");
    }

    @Bean
    public LiteDeviceDelegatingViewResolver liteDeviceAwareViewResolver() {

        InternalResourceViewResolver delegate = new InternalResourceViewResolver();
        delegate.setPrefix("/WEB-INF/jsp/");
        delegate.setSuffix(".jsp");

        LiteDeviceDelegatingViewResolver resolver = new LiteDeviceDelegatingViewResolver(delegate);
        resolver.setMobilePrefix("mobile/");
        resolver.setTabletPrefix("mobile/");
        resolver.setNormalPrefix("pc/");

        return resolver;
    }
}
