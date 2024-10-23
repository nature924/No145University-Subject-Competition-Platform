package com.dao;

import com.entity.CansaishenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CansaishenqingVO;
import com.entity.view.CansaishenqingView;


/**
 * 参赛申请
 * 
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
public interface CansaishenqingDao extends BaseMapper<CansaishenqingEntity> {
	
	List<CansaishenqingVO> selectListVO(@Param("ew") Wrapper<CansaishenqingEntity> wrapper);
	
	CansaishenqingVO selectVO(@Param("ew") Wrapper<CansaishenqingEntity> wrapper);
	
	List<CansaishenqingView> selectListView(@Param("ew") Wrapper<CansaishenqingEntity> wrapper);

	List<CansaishenqingView> selectListView(Pagination page,@Param("ew") Wrapper<CansaishenqingEntity> wrapper);
	
	CansaishenqingView selectView(@Param("ew") Wrapper<CansaishenqingEntity> wrapper);
	
}
