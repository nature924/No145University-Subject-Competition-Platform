package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingsaileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingsaileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingsaileixingView;


/**
 * 竞赛类型
 *
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
public interface JingsaileixingService extends IService<JingsaileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingsaileixingVO> selectListVO(Wrapper<JingsaileixingEntity> wrapper);
   	
   	JingsaileixingVO selectVO(@Param("ew") Wrapper<JingsaileixingEntity> wrapper);
   	
   	List<JingsaileixingView> selectListView(Wrapper<JingsaileixingEntity> wrapper);
   	
   	JingsaileixingView selectView(@Param("ew") Wrapper<JingsaileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingsaileixingEntity> wrapper);
   	
}

