package com.entity.view;

import com.entity.JingsaipingfenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 竞赛评分
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
@TableName("jingsaipingfen")
public class JingsaipingfenView  extends JingsaipingfenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JingsaipingfenView(){
	}
 
 	public JingsaipingfenView(JingsaipingfenEntity jingsaipingfenEntity){
 	try {
			BeanUtils.copyProperties(this, jingsaipingfenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
