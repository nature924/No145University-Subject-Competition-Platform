package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuojiangqingkuangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuojiangqingkuangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuojiangqingkuangView;


/**
 * 获奖情况
 *
 * @author 
 * @email 
 * @date 2021-04-30 16:23:55
 */
public interface HuojiangqingkuangService extends IService<HuojiangqingkuangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuojiangqingkuangVO> selectListVO(Wrapper<HuojiangqingkuangEntity> wrapper);
   	
   	HuojiangqingkuangVO selectVO(@Param("ew") Wrapper<HuojiangqingkuangEntity> wrapper);
   	
   	List<HuojiangqingkuangView> selectListView(Wrapper<HuojiangqingkuangEntity> wrapper);
   	
   	HuojiangqingkuangView selectView(@Param("ew") Wrapper<HuojiangqingkuangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuojiangqingkuangEntity> wrapper);
   	
}

