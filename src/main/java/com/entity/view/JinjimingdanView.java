package com.entity.view;

import com.entity.JinjimingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 晋级名单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
@TableName("jinjimingdan")
public class JinjimingdanView  extends JinjimingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JinjimingdanView(){
	}
 
 	public JinjimingdanView(JinjimingdanEntity jinjimingdanEntity){
 	try {
			BeanUtils.copyProperties(this, jinjimingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
