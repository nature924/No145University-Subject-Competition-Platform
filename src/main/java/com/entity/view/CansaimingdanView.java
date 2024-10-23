package com.entity.view;

import com.entity.CansaimingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 参赛名单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
@TableName("cansaimingdan")
public class CansaimingdanView  extends CansaimingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CansaimingdanView(){
	}
 
 	public CansaimingdanView(CansaimingdanEntity cansaimingdanEntity){
 	try {
			BeanUtils.copyProperties(this, cansaimingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
