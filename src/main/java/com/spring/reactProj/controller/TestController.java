package com.spring.reactProj.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.mobile.device.Device;
import org.springframework.mobile.device.DeviceUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestAttributes;

/***    Test 컨트롤러 생성
 * @author jsw01
 * @since 2024.10.13
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/")
    public String test (HttpServletRequest request) {

        Device device = DeviceUtils.getCurrentDevice((RequestAttributes) request);

        if(device.isNormal()) {
            return "pc/test";
        } else if(device.isMobile()) {
            return "mobile/test";
        } else if(device.isTablet()) {
            return "tablet/test";
        } else {
            return "test";
        }
    }
}
