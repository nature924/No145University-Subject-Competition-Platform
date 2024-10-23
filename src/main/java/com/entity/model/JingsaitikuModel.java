package com.entity.model;

import com.entity.JingsaitikuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 竞赛题库
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
public class JingsaitikuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 题目
	 */
	
	private String timu;
		
	/**
	 * 题目类型
	 */
	
	private String timuleixing;
		
	/**
	 * 文件
	 */
	
	private String wenjian;
				
	
	/**
	 * 设置：题目
	 */
	 
	public void setTimu(String timu) {
		this.timu = timu;
	}
	
	/**
	 * 获取：题目
	 */
	public String getTimu() {
		return timu;
	}
				
	
	/**
	 * 设置：题目类型
	 */
	 
	public void setTimuleixing(String timuleixing) {
		this.timuleixing = timuleixing;
	}
	
	/**
	 * 获取：题目类型
	 */
	public String getTimuleixing() {
		return timuleixing;
	}
				
	
	/**
	 * 设置：文件
	 */
	 
	public void setWenjian(String wenjian) {
		this.wenjian = wenjian;
	}
	
	/**
	 * 获取：文件
	 */
	public String getWenjian() {
		return wenjian;
	}
			
}
