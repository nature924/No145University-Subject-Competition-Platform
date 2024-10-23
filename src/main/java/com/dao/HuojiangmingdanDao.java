package com.dao;

import com.entity.HuojiangmingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuojiangmingdanVO;
import com.entity.view.HuojiangmingdanView;


/**
 * 获奖名单
 * 
 * @author 
 * @email 
 * @date 2021-04-30 16:23:55
 */
public interface HuojiangmingdanDao extends BaseMapper<HuojiangmingdanEntity> {
	
	List<HuojiangmingdanVO> selectListVO(@Param("ew") Wrapper<HuojiangmingdanEntity> wrapper);
	
	HuojiangmingdanVO selectVO(@Param("ew") Wrapper<HuojiangmingdanEntity> wrapper);
	
	List<HuojiangmingdanView> selectListView(@Param("ew") Wrapper<HuojiangmingdanEntity> wrapper);

	List<HuojiangmingdanView> selectListView(Pagination page,@Param("ew") Wrapper<HuojiangmingdanEntity> wrapper);
	
	HuojiangmingdanView selectView(@Param("ew") Wrapper<HuojiangmingdanEntity> wrapper);
	
}
