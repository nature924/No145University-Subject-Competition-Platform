package com.dao;

import com.entity.CansaixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CansaixinxiVO;
import com.entity.view.CansaixinxiView;


/**
 * 参赛信息
 * 
 * @author 
 * @email 
 * @date 2021-04-30 16:23:55
 */
public interface CansaixinxiDao extends BaseMapper<CansaixinxiEntity> {
	
	List<CansaixinxiVO> selectListVO(@Param("ew") Wrapper<CansaixinxiEntity> wrapper);
	
	CansaixinxiVO selectVO(@Param("ew") Wrapper<CansaixinxiEntity> wrapper);
	
	List<CansaixinxiView> selectListView(@Param("ew") Wrapper<CansaixinxiEntity> wrapper);

	List<CansaixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<CansaixinxiEntity> wrapper);
	
	CansaixinxiView selectView(@Param("ew") Wrapper<CansaixinxiEntity> wrapper);
	
}
