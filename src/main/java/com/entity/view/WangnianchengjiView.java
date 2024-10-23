package com.entity.view;

import com.entity.WangnianchengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 往年成绩
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-30 16:23:55
 */
@TableName("wangnianchengji")
public class WangnianchengjiView  extends WangnianchengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WangnianchengjiView(){
	}
 
 	public WangnianchengjiView(WangnianchengjiEntity wangnianchengjiEntity){
 	try {
			BeanUtils.copyProperties(this, wangnianchengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
