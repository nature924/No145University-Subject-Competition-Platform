package com.entity.model;

import com.entity.WangnianchengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 往年成绩
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-30 16:23:55
 */
public class WangnianchengjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 竞赛类型
	 */
	
	private String jingsaileixing;
		
	/**
	 * 日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date riqi;
		
	/**
	 * 成绩
	 */
	
	private Integer chengji;
		
	/**
	 * 队名
	 */
	
	private String duiming;
		
	/**
	 * 参赛成员
	 */
	
	private String cansaichengyuan;
		
	/**
	 * 领队教师
	 */
	
	private String lingduijiaoshi;
				
	
	/**
	 * 设置：竞赛类型
	 */
	 
	public void setJingsaileixing(String jingsaileixing) {
		this.jingsaileixing = jingsaileixing;
	}
	
	/**
	 * 获取：竞赛类型
	 */
	public String getJingsaileixing() {
		return jingsaileixing;
	}
				
	
	/**
	 * 设置：日期
	 */
	 
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
				
	
	/**
	 * 设置：成绩
	 */
	 
	public void setChengji(Integer chengji) {
		this.chengji = chengji;
	}
	
	/**
	 * 获取：成绩
	 */
	public Integer getChengji() {
		return chengji;
	}
				
	
	/**
	 * 设置：队名
	 */
	 
	public void setDuiming(String duiming) {
		this.duiming = duiming;
	}
	
	/**
	 * 获取：队名
	 */
	public String getDuiming() {
		return duiming;
	}
				
	
	/**
	 * 设置：参赛成员
	 */
	 
	public void setCansaichengyuan(String cansaichengyuan) {
		this.cansaichengyuan = cansaichengyuan;
	}
	
	/**
	 * 获取：参赛成员
	 */
	public String getCansaichengyuan() {
		return cansaichengyuan;
	}
				
	
	/**
	 * 设置：领队教师
	 */
	 
	public void setLingduijiaoshi(String lingduijiaoshi) {
		this.lingduijiaoshi = lingduijiaoshi;
	}
	
	/**
	 * 获取：领队教师
	 */
	public String getLingduijiaoshi() {
		return lingduijiaoshi;
	}
			
}
