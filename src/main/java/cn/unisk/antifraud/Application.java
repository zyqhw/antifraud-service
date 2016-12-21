/**
 * Project:antifraud-api
 * File:Application.java
 * Copyright © 2003-2016 unisk.cn All rights reserved.
 */

package cn.unisk.antifraud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author zhangyq
 * @date 2016年12月20日
 */
@SpringBootApplication(scanBasePackages = "cn.unisk.antifraud")
@MapperScan("cn.unisk.antifraud.mapper")
@EnableCaching
@ServletComponentScan
public class Application {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}
