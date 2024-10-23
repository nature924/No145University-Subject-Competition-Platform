package com.entity.view;

import com.entity.JingsaitikuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 竞赛题库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
@TableName("jingsaitiku")
public class JingsaitikuView  extends JingsaitikuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JingsaitikuView(){
	}
 
 	public JingsaitikuView(JingsaitikuEntity jingsaitikuEntity){
 	try {
			BeanUtils.copyProperties(this, jingsaitikuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
