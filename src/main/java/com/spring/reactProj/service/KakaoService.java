package com.spring.reactProj.service;

import org.springframework.stereotype.Service;

@Service
public interface KakaoService {

    public String getToken (String code) throws Exception;
}
