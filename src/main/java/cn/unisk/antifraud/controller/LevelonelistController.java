/**
 * Project:antifraud-api
 * File:LevelonelistController.java
 * Copyright © 2003-2016 unisk.cn All rights reserved.
 */

package cn.unisk.antifraud.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.unisk.antifraud.domain.Levelonelist;
import cn.unisk.antifraud.mapper.LeveloneMapper;
import cn.unisk.antifraud.response.ResponseResult;
import cn.unisk.antifraud.response.ResultCode;
import cn.unisk.antifraud.util.Base64Utils;

/**
 * @author zhangyq
 * @date 2016年12月20日
 */
@RestController
@RequestMapping(value="/levelone")
public class LevelonelistController {
	@Autowired
	LeveloneMapper leveloneMapper;
	
	@RequestMapping(value="/{tel}", method=RequestMethod.GET) 
    public Object getLevelone(@PathVariable String tel) {
		if (StringUtils.isEmpty(tel)) {
			return new ResponseResult(ResultCode.VALIDATE_ERROR, "tel can not be null");
		}
		
		try {
			tel = Base64Utils.decodeFromString(tel);
		} catch (UnsupportedEncodingException e) {
			return new ResponseResult(ResultCode.FAULT, "base64 decode error");
		} catch (Exception e) {
			return new ResponseResult(ResultCode.FAULT, "base64 decode error");
		}
		
		Levelonelist tLevelonelist = leveloneMapper.selectByTel(tel);
		if (tLevelonelist == null) {
			return new ResponseResult(ResultCode.DATA_NO_FOUND);
		}
		
        return new ResponseResult(ResultCode.OK, tLevelonelist); 
    }
	
	@RequestMapping(value="/", method=RequestMethod.POST) 
    public Object postLevelone(String tel) {
		if (StringUtils.isEmpty(tel)) {
			return new ResponseResult(ResultCode.VALIDATE_ERROR, "tel can not be null");
		}
		
		try {
			tel = Base64Utils.decodeFromString(tel);
		} catch (UnsupportedEncodingException e) {
			return new ResponseResult(ResultCode.FAULT, "base64 decode error");
		} catch (Exception e) {
			return new ResponseResult(ResultCode.FAULT, "base64 decode error");
		}
		
		Levelonelist tLevelonelist = leveloneMapper.selectByTel(tel);
		if (tLevelonelist == null) {
			return new ResponseResult(ResultCode.DATA_NO_FOUND);
		}
		
        return new ResponseResult(ResultCode.OK, tLevelonelist); 
    }
}
