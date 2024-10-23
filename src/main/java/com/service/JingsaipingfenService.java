package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingsaipingfenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingsaipingfenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingsaipingfenView;


/**
 * 竞赛评分
 *
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
public interface JingsaipingfenService extends IService<JingsaipingfenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingsaipingfenVO> selectListVO(Wrapper<JingsaipingfenEntity> wrapper);
   	
   	JingsaipingfenVO selectVO(@Param("ew") Wrapper<JingsaipingfenEntity> wrapper);
   	
   	List<JingsaipingfenView> selectListView(Wrapper<JingsaipingfenEntity> wrapper);
   	
   	JingsaipingfenView selectView(@Param("ew") Wrapper<JingsaipingfenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingsaipingfenEntity> wrapper);
   	
}

