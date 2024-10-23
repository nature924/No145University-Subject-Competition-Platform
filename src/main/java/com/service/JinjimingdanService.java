package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JinjimingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JinjimingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JinjimingdanView;


/**
 * 晋级名单
 *
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
public interface JinjimingdanService extends IService<JinjimingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JinjimingdanVO> selectListVO(Wrapper<JinjimingdanEntity> wrapper);
   	
   	JinjimingdanVO selectVO(@Param("ew") Wrapper<JinjimingdanEntity> wrapper);
   	
   	List<JinjimingdanView> selectListView(Wrapper<JinjimingdanEntity> wrapper);
   	
   	JinjimingdanView selectView(@Param("ew") Wrapper<JinjimingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JinjimingdanEntity> wrapper);
   	
}

