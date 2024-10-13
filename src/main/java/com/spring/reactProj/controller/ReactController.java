package com.spring.reactProj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * 리액트 컨트롤러 생성
 * @since 2024.10.09
 * @author jsw01
 * */
@RestController
public class ReactController {

    @GetMapping("/api/demo-web")
    public List<String> Hello() {

        return Arrays.asList("React & Spring", "연결 성공");
    }

}
