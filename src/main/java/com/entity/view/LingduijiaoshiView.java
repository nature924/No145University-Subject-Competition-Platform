package com.entity.view;

import com.entity.LingduijiaoshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 领队教师
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
@TableName("lingduijiaoshi")
public class LingduijiaoshiView  extends LingduijiaoshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LingduijiaoshiView(){
	}
 
 	public LingduijiaoshiView(LingduijiaoshiEntity lingduijiaoshiEntity){
 	try {
			BeanUtils.copyProperties(this, lingduijiaoshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
