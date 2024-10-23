package com.entity.view;

import com.entity.HuojiangqingkuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 获奖情况
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-30 16:23:55
 */
@TableName("huojiangqingkuang")
public class HuojiangqingkuangView  extends HuojiangqingkuangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuojiangqingkuangView(){
	}
 
 	public HuojiangqingkuangView(HuojiangqingkuangEntity huojiangqingkuangEntity){
 	try {
			BeanUtils.copyProperties(this, huojiangqingkuangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
