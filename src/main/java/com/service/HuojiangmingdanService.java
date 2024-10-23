package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuojiangmingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuojiangmingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuojiangmingdanView;


/**
 * 获奖名单
 *
 * @author 
 * @email 
 * @date 2021-04-30 16:23:55
 */
public interface HuojiangmingdanService extends IService<HuojiangmingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuojiangmingdanVO> selectListVO(Wrapper<HuojiangmingdanEntity> wrapper);
   	
   	HuojiangmingdanVO selectVO(@Param("ew") Wrapper<HuojiangmingdanEntity> wrapper);
   	
   	List<HuojiangmingdanView> selectListView(Wrapper<HuojiangmingdanEntity> wrapper);
   	
   	HuojiangmingdanView selectView(@Param("ew") Wrapper<HuojiangmingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuojiangmingdanEntity> wrapper);
   	
}

