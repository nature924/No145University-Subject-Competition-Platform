package com.dao;

import com.entity.CansaimingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CansaimingdanVO;
import com.entity.view.CansaimingdanView;


/**
 * 参赛名单
 * 
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
public interface CansaimingdanDao extends BaseMapper<CansaimingdanEntity> {
	
	List<CansaimingdanVO> selectListVO(@Param("ew") Wrapper<CansaimingdanEntity> wrapper);
	
	CansaimingdanVO selectVO(@Param("ew") Wrapper<CansaimingdanEntity> wrapper);
	
	List<CansaimingdanView> selectListView(@Param("ew") Wrapper<CansaimingdanEntity> wrapper);

	List<CansaimingdanView> selectListView(Pagination page,@Param("ew") Wrapper<CansaimingdanEntity> wrapper);
	
	CansaimingdanView selectView(@Param("ew") Wrapper<CansaimingdanEntity> wrapper);
	
}
