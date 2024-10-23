package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TimuleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TimuleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TimuleixingView;


/**
 * 题目类型
 *
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
public interface TimuleixingService extends IService<TimuleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TimuleixingVO> selectListVO(Wrapper<TimuleixingEntity> wrapper);
   	
   	TimuleixingVO selectVO(@Param("ew") Wrapper<TimuleixingEntity> wrapper);
   	
   	List<TimuleixingView> selectListView(Wrapper<TimuleixingEntity> wrapper);
   	
   	TimuleixingView selectView(@Param("ew") Wrapper<TimuleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TimuleixingEntity> wrapper);
   	
}

