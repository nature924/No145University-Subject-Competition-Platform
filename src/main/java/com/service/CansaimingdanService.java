package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CansaimingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CansaimingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CansaimingdanView;


/**
 * 参赛名单
 *
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
public interface CansaimingdanService extends IService<CansaimingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CansaimingdanVO> selectListVO(Wrapper<CansaimingdanEntity> wrapper);
   	
   	CansaimingdanVO selectVO(@Param("ew") Wrapper<CansaimingdanEntity> wrapper);
   	
   	List<CansaimingdanView> selectListView(Wrapper<CansaimingdanEntity> wrapper);
   	
   	CansaimingdanView selectView(@Param("ew") Wrapper<CansaimingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CansaimingdanEntity> wrapper);
   	
}

