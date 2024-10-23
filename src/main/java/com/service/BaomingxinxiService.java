package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaomingxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaomingxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaomingxinxiView;


/**
 * 报名信息
 *
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
public interface BaomingxinxiService extends IService<BaomingxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaomingxinxiVO> selectListVO(Wrapper<BaomingxinxiEntity> wrapper);
   	
   	BaomingxinxiVO selectVO(@Param("ew") Wrapper<BaomingxinxiEntity> wrapper);
   	
   	List<BaomingxinxiView> selectListView(Wrapper<BaomingxinxiEntity> wrapper);
   	
   	BaomingxinxiView selectView(@Param("ew") Wrapper<BaomingxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaomingxinxiEntity> wrapper);
   	
}

