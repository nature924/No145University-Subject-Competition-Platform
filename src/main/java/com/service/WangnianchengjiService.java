package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WangnianchengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WangnianchengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WangnianchengjiView;


/**
 * 往年成绩
 *
 * @author 
 * @email 
 * @date 2021-04-30 16:23:55
 */
public interface WangnianchengjiService extends IService<WangnianchengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WangnianchengjiVO> selectListVO(Wrapper<WangnianchengjiEntity> wrapper);
   	
   	WangnianchengjiVO selectVO(@Param("ew") Wrapper<WangnianchengjiEntity> wrapper);
   	
   	List<WangnianchengjiView> selectListView(Wrapper<WangnianchengjiEntity> wrapper);
   	
   	WangnianchengjiView selectView(@Param("ew") Wrapper<WangnianchengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WangnianchengjiEntity> wrapper);
   	
}

