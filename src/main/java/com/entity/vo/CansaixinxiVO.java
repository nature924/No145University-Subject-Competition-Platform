package com.entity.vo;

import com.entity.CansaixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 参赛信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-30 16:23:55
 */
public class CansaixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 竞赛名称
	 */
	
	private String jingsaimingcheng;
		
	/**
	 * 竞赛类型
	 */
	
	private String jingsaileixing;
		
	/**
	 * 学校
	 */
	
	private String xuexiao;
		
	/**
	 * 作品
	 */
	
	private String zuopin;
		
	/**
	 * 作品特色
	 */
	
	private String zuopintese;
				
	
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
				
	
	/**
	 * 设置：竞赛名称
	 */
	 
	public void setJingsaimingcheng(String jingsaimingcheng) {
		this.jingsaimingcheng = jingsaimingcheng;
	}
	
	/**
	 * 获取：竞赛名称
	 */
	public String getJingsaimingcheng() {
		return jingsaimingcheng;
	}
				
	
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
	 * 设置：学校
	 */
	 
	public void setXuexiao(String xuexiao) {
		this.xuexiao = xuexiao;
	}
	
	/**
	 * 获取：学校
	 */
	public String getXuexiao() {
		return xuexiao;
	}
				
	
	/**
	 * 设置：作品
	 */
	 
	public void setZuopin(String zuopin) {
		this.zuopin = zuopin;
	}
	
	/**
	 * 获取：作品
	 */
	public String getZuopin() {
		return zuopin;
	}
				
	
	/**
	 * 设置：作品特色
	 */
	 
	public void setZuopintese(String zuopintese) {
		this.zuopintese = zuopintese;
	}
	
	/**
	 * 获取：作品特色
	 */
	public String getZuopintese() {
		return zuopintese;
	}
			
}
