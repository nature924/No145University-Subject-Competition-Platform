package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CansaixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CansaixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CansaixinxiView;


/**
 * 参赛信息
 *
 * @author 
 * @email 
 * @date 2021-04-30 16:23:55
 */
public interface CansaixinxiService extends IService<CansaixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CansaixinxiVO> selectListVO(Wrapper<CansaixinxiEntity> wrapper);
   	
   	CansaixinxiVO selectVO(@Param("ew") Wrapper<CansaixinxiEntity> wrapper);
   	
   	List<CansaixinxiView> selectListView(Wrapper<CansaixinxiEntity> wrapper);
   	
   	CansaixinxiView selectView(@Param("ew") Wrapper<CansaixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CansaixinxiEntity> wrapper);
   	
}

