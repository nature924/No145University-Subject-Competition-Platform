package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LingduijiaoshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LingduijiaoshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LingduijiaoshiView;


/**
 * 领队教师
 *
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
public interface LingduijiaoshiService extends IService<LingduijiaoshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LingduijiaoshiVO> selectListVO(Wrapper<LingduijiaoshiEntity> wrapper);
   	
   	LingduijiaoshiVO selectVO(@Param("ew") Wrapper<LingduijiaoshiEntity> wrapper);
   	
   	List<LingduijiaoshiView> selectListView(Wrapper<LingduijiaoshiEntity> wrapper);
   	
   	LingduijiaoshiView selectView(@Param("ew") Wrapper<LingduijiaoshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LingduijiaoshiEntity> wrapper);
   	
}

