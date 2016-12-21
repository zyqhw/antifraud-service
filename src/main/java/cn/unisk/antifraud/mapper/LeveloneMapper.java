/**
 * Project:antifraud-service
 * File:LeveloneMapper.java
 * Copyright © 2003-2016 unisk.cn All rights reserved.
 */

package cn.unisk.antifraud.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import cn.unisk.antifraud.domain.Levelonelist;

/**
 * @author zhangyq
 * @date 2016年12月20日
 */
@Mapper
@CacheConfig(cacheNames = "leveloneCache")
public interface LeveloneMapper {
	
	@Select("select * from v_levelonelist where evil_number = #{tel}")
	@Results({
		@Result(property="evilNumber",column="evil_number"),
		@Result(property="statDate",column="stat_date"),
		@Result(property="cheatedType",column="cheated_type")
		})
	@Cacheable
	Levelonelist selectByTel(String tel);
	
}
