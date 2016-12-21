/**
 * Project:antifraud-service
 * File:ServletInitializer.java
 * Copyright © 2003-2016 unisk.cn All rights reserved.
 */

package cn.unisk.antifraud;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author zhangyq
 * @date 2016年12月21日
 */

public class ServletInitializer extends SpringBootServletInitializer {
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Application.class);  
	}
}
