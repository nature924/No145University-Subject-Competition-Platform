package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingsaitikuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingsaitikuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingsaitikuView;


/**
 * 竞赛题库
 *
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
public interface JingsaitikuService extends IService<JingsaitikuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingsaitikuVO> selectListVO(Wrapper<JingsaitikuEntity> wrapper);
   	
   	JingsaitikuVO selectVO(@Param("ew") Wrapper<JingsaitikuEntity> wrapper);
   	
   	List<JingsaitikuView> selectListView(Wrapper<JingsaitikuEntity> wrapper);
   	
   	JingsaitikuView selectView(@Param("ew") Wrapper<JingsaitikuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingsaitikuEntity> wrapper);
   	
}

