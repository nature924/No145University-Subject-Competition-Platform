package com.entity.view;

import com.entity.JingsaizongjieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 竞赛总结
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-30 16:23:55
 */
@TableName("jingsaizongjie")
public class JingsaizongjieView  extends JingsaizongjieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JingsaizongjieView(){
	}
 
 	public JingsaizongjieView(JingsaizongjieEntity jingsaizongjieEntity){
 	try {
			BeanUtils.copyProperties(this, jingsaizongjieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
