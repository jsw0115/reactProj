package com.spring.reactProj.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/***    Config 생성
 * @author jsw01
 * @since 2024.10.12
 */

@Configuration
@MapperScan (basePackages={"com.example.mybatismixjpa.mapper"},
        sqlSessionFactoryRef="sqlSessionFactory",
        sqlSessionTemplateRef = "sqlSessionTemplate")
public class MyBatisConfig {
}
