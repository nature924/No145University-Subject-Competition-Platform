package com.entity.view;

import com.entity.CansaishenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 参赛申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
@TableName("cansaishenqing")
public class CansaishenqingView  extends CansaishenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CansaishenqingView(){
	}
 
 	public CansaishenqingView(CansaishenqingEntity cansaishenqingEntity){
 	try {
			BeanUtils.copyProperties(this, cansaishenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
