package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChengjishensuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChengjishensuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChengjishensuView;


/**
 * 成绩申诉
 *
 * @author 
 * @email 
 * @date 2021-04-30 16:23:55
 */
public interface ChengjishensuService extends IService<ChengjishensuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChengjishensuVO> selectListVO(Wrapper<ChengjishensuEntity> wrapper);
   	
   	ChengjishensuVO selectVO(@Param("ew") Wrapper<ChengjishensuEntity> wrapper);
   	
   	List<ChengjishensuView> selectListView(Wrapper<ChengjishensuEntity> wrapper);
   	
   	ChengjishensuView selectView(@Param("ew") Wrapper<ChengjishensuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChengjishensuEntity> wrapper);
   	
}

