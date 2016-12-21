/**
 * Project:antifraud-api
 * File:TLevelonelist.java
 * Copyright © 2003-2016 unisk.cn All rights reserved.
 */

package cn.unisk.antifraud.domain;

import java.io.Serializable;

/**
 * @author zhangyq
 * @date 2016年12月20日
 */

public class Levelonelist implements Serializable {
	
	private static final long serialVersionUID = -7921396908196061318L;

	private String evilNumber;
	
	private String statDate;
	
	private String cheatedType;

	public String getEvilNumber() {
		return evilNumber;
	}

	public void setEvilNumber(String evilNumber) {
		this.evilNumber = evilNumber;
	}

	public String getStatDate() {
		return statDate;
	}

	public void setStatDate(String statDate) {
		this.statDate = statDate;
	}

	public String getCheatedType() {
		return cheatedType;
	}

	public void setCheatedType(String cheatedType) {
		this.cheatedType = cheatedType;
	}

}
