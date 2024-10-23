package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CansaishenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CansaishenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CansaishenqingView;


/**
 * 参赛申请
 *
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
public interface CansaishenqingService extends IService<CansaishenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CansaishenqingVO> selectListVO(Wrapper<CansaishenqingEntity> wrapper);
   	
   	CansaishenqingVO selectVO(@Param("ew") Wrapper<CansaishenqingEntity> wrapper);
   	
   	List<CansaishenqingView> selectListView(Wrapper<CansaishenqingEntity> wrapper);
   	
   	CansaishenqingView selectView(@Param("ew") Wrapper<CansaishenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CansaishenqingEntity> wrapper);
   	
}

