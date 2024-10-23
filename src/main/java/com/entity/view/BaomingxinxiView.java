package com.entity.view;

import com.entity.BaomingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 报名信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
@TableName("baomingxinxi")
public class BaomingxinxiView  extends BaomingxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaomingxinxiView(){
	}
 
 	public BaomingxinxiView(BaomingxinxiEntity baomingxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, baomingxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
