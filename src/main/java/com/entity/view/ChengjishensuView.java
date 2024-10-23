package com.entity.view;

import com.entity.ChengjishensuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 成绩申诉
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-30 16:23:55
 */
@TableName("chengjishensu")
public class ChengjishensuView  extends ChengjishensuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChengjishensuView(){
	}
 
 	public ChengjishensuView(ChengjishensuEntity chengjishensuEntity){
 	try {
			BeanUtils.copyProperties(this, chengjishensuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
