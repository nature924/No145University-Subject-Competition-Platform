package com.entity.view;

import com.entity.BaoxiaoqingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 报销清单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-30 16:23:55
 */
@TableName("baoxiaoqingdan")
public class BaoxiaoqingdanView  extends BaoxiaoqingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaoxiaoqingdanView(){
	}
 
 	public BaoxiaoqingdanView(BaoxiaoqingdanEntity baoxiaoqingdanEntity){
 	try {
			BeanUtils.copyProperties(this, baoxiaoqingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
