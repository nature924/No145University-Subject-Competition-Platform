package com.entity.vo;

import com.entity.JingsaipingfenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 竞赛评分
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
public class JingsaipingfenVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 竞赛类型
	 */
	
	private String jingsaileixing;
		
	/**
	 * 竞赛内容
	 */
	
	private String jingsaineirong;
		
	/**
	 * 队名
	 */
	
	private String duiming;
		
	/**
	 * 参赛成员
	 */
	
	private String cansaichengyuan;
		
	/**
	 * 作品评分
	 */
	
	private String zuopinpingfen;
		
	/**
	 * 评价内容
	 */
	
	private String pingjianeirong;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 学生账号
	 */
	
	private String xueshengzhanghao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
				
	
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
	 * 设置：作品评分
	 */
	 
	public void setZuopinpingfen(String zuopinpingfen) {
		this.zuopinpingfen = zuopinpingfen;
	}
	
	/**
	 * 获取：作品评分
	 */
	public String getZuopinpingfen() {
		return zuopinpingfen;
	}
				
	
	/**
	 * 设置：评价内容
	 */
	 
	public void setPingjianeirong(String pingjianeirong) {
		this.pingjianeirong = pingjianeirong;
	}
	
	/**
	 * 获取：评价内容
	 */
	public String getPingjianeirong() {
		return pingjianeirong;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：学生账号
	 */
	 
	public void setXueshengzhanghao(String xueshengzhanghao) {
		this.xueshengzhanghao = xueshengzhanghao;
	}
	
	/**
	 * 获取：学生账号
	 */
	public String getXueshengzhanghao() {
		return xueshengzhanghao;
	}
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
			
}
