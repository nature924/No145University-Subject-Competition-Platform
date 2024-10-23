package com.entity.model;

import com.entity.JingsaixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 竞赛信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
public class JingsaixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 竞赛类型
	 */
	
	private String jingsaileixing;
		
	/**
	 * 竞赛目的
	 */
	
	private String jingsaimude;
		
	/**
	 * 竞赛内容
	 */
	
	private String jingsaineirong;
		
	/**
	 * 竞赛时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jingsaishijian;
		
	/**
	 * 地点
	 */
	
	private String didian;
		
	/**
	 * 级别
	 */
	
	private String jibie;
		
	/**
	 * 举办单位
	 */
	
	private String jubandanwei;
		
	/**
	 * 承办单位
	 */
	
	private String chengbandanwei;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
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
	 * 设置：竞赛目的
	 */
	 
	public void setJingsaimude(String jingsaimude) {
		this.jingsaimude = jingsaimude;
	}
	
	/**
	 * 获取：竞赛目的
	 */
	public String getJingsaimude() {
		return jingsaimude;
	}
				
	
	/**
	 * 设置：竞赛内容
	 */
	 
	public void setJingsaineirong(String jingsaineirong) {
		this.jingsaineirong = jingsaineirong;
	}
	
	/**
	 * 获取：竞赛内容
	 */
	public String getJingsaineirong() {
		return jingsaineirong;
	}
				
	
	/**
	 * 设置：竞赛时间
	 */
	 
	public void setJingsaishijian(Date jingsaishijian) {
		this.jingsaishijian = jingsaishijian;
	}
	
	/**
	 * 获取：竞赛时间
	 */
	public Date getJingsaishijian() {
		return jingsaishijian;
	}
				
	
	/**
	 * 设置：地点
	 */
	 
	public void setDidian(String didian) {
		this.didian = didian;
	}
	
	/**
	 * 获取：地点
	 */
	public String getDidian() {
		return didian;
	}
				
	
	/**
	 * 设置：级别
	 */
	 
	public void setJibie(String jibie) {
		this.jibie = jibie;
	}
	
	/**
	 * 获取：级别
	 */
	public String getJibie() {
		return jibie;
	}
				
	
	/**
	 * 设置：举办单位
	 */
	 
	public void setJubandanwei(String jubandanwei) {
		this.jubandanwei = jubandanwei;
	}
	
	/**
	 * 获取：举办单位
	 */
	public String getJubandanwei() {
		return jubandanwei;
	}
				
	
	/**
	 * 设置：承办单位
	 */
	 
	public void setChengbandanwei(String chengbandanwei) {
		this.chengbandanwei = chengbandanwei;
	}
	
	/**
	 * 获取：承办单位
	 */
	public String getChengbandanwei() {
		return chengbandanwei;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
			
}
