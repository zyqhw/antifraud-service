/**
 * Project:antifraud-service
 * File:Base64UtilsTest.java
 * Copyright © 2003-2016 unisk.cn All rights reserved.
 */

package cn.unisk.antifraud.utils;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import cn.unisk.antifraud.util.Base64Utils;
import junit.framework.TestCase;

/**
 * @author zhangyq
 * @date 2016年12月21日
 */

public class Base64UtilsTest extends TestCase {
	@Test
	public void testEncode() throws UnsupportedEncodingException {
		String orgStr = "95599";
		String encStr = Base64Utils.encodeToString(orgStr);
		String decStr = Base64Utils.decodeFromString(encStr);
		
		System.out.println("orgStr:" + orgStr);
		System.out.println("encStr:" + encStr);
		System.out.println("decStr:" + decStr);
		
		assertEquals(orgStr, decStr);
	}
}
