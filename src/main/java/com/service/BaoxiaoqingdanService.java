package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaoxiaoqingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaoxiaoqingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaoxiaoqingdanView;


/**
 * 报销清单
 *
 * @author 
 * @email 
 * @date 2021-04-30 16:23:55
 */
public interface BaoxiaoqingdanService extends IService<BaoxiaoqingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaoxiaoqingdanVO> selectListVO(Wrapper<BaoxiaoqingdanEntity> wrapper);
   	
   	BaoxiaoqingdanVO selectVO(@Param("ew") Wrapper<BaoxiaoqingdanEntity> wrapper);
   	
   	List<BaoxiaoqingdanView> selectListView(Wrapper<BaoxiaoqingdanEntity> wrapper);
   	
   	BaoxiaoqingdanView selectView(@Param("ew") Wrapper<BaoxiaoqingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaoxiaoqingdanEntity> wrapper);
   	
}

