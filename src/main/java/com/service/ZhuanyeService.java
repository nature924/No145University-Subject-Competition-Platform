package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuanyeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuanyeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuanyeView;


/**
 * 专业
 *
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
public interface ZhuanyeService extends IService<ZhuanyeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuanyeVO> selectListVO(Wrapper<ZhuanyeEntity> wrapper);
   	
   	ZhuanyeVO selectVO(@Param("ew") Wrapper<ZhuanyeEntity> wrapper);
   	
   	List<ZhuanyeView> selectListView(Wrapper<ZhuanyeEntity> wrapper);
   	
   	ZhuanyeView selectView(@Param("ew") Wrapper<ZhuanyeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuanyeEntity> wrapper);
   	
}

