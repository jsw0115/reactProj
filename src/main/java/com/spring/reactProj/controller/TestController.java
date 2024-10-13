package com.spring.reactProj.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
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

    private static final Logger log = Logger.getLogger(TestController.class);

    @RequestMapping("")
    public String test (HttpServletRequest request) {

        Device device = DeviceUtils.getCurrentDevice(request);

        if (device.isNormal()) {

//            log.info("Desktop");
            return "desktop/test";
        } else if (device.isMobile()) {

//            log.info("mobile");
            return "mobile/test";
        } else if (device.isTablet()) {

//            log.info("tablet");
            return "tablet/test";
        } else {

//            log.info("else");
            return "test";
        }
    }
}
