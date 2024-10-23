package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingsaizongjieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingsaizongjieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingsaizongjieView;


/**
 * 竞赛总结
 *
 * @author 
 * @email 
 * @date 2021-04-30 16:23:55
 */
public interface JingsaizongjieService extends IService<JingsaizongjieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingsaizongjieVO> selectListVO(Wrapper<JingsaizongjieEntity> wrapper);
   	
   	JingsaizongjieVO selectVO(@Param("ew") Wrapper<JingsaizongjieEntity> wrapper);
   	
   	List<JingsaizongjieView> selectListView(Wrapper<JingsaizongjieEntity> wrapper);
   	
   	JingsaizongjieView selectView(@Param("ew") Wrapper<JingsaizongjieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingsaizongjieEntity> wrapper);
   	
}

