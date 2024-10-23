package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 获奖情况
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-30 16:23:55
 */
@TableName("huojiangqingkuang")
public class HuojiangqingkuangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuojiangqingkuangEntity() {
		
	}
	
	public HuojiangqingkuangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 队名
	 */
					
	private String duiming;
	
	/**
	 * 参赛成员
	 */
					
	private String cansaichengyuan;
	
	/**
	 * 人数
	 */
					
	private String renshu;
	
	/**
	 * 获奖金额
	 */
					
	private Integer huojiangjine;
	
	/**
	 * 获奖明细
	 */
					
	private String huojiangmingxi;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	 * 设置：人数
	 */
	public void setRenshu(String renshu) {
		this.renshu = renshu;
	}
	/**
	 * 获取：人数
	 */
	public String getRenshu() {
		return renshu;
	}
	/**
	 * 设置：获奖金额
	 */
	public void setHuojiangjine(Integer huojiangjine) {
		this.huojiangjine = huojiangjine;
	}
	/**
	 * 获取：获奖金额
	 */
	public Integer getHuojiangjine() {
		return huojiangjine;
	}
	/**
	 * 设置：获奖明细
	 */
	public void setHuojiangmingxi(String huojiangmingxi) {
		this.huojiangmingxi = huojiangmingxi;
	}
	/**
	 * 获取：获奖明细
	 */
	public String getHuojiangmingxi() {
		return huojiangmingxi;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}

}
