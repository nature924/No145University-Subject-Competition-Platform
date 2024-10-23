package com.dao;

import com.entity.JingsaixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingsaixinxiVO;
import com.entity.view.JingsaixinxiView;


/**
 * 竞赛信息
 * 
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
public interface JingsaixinxiDao extends BaseMapper<JingsaixinxiEntity> {
	
	List<JingsaixinxiVO> selectListVO(@Param("ew") Wrapper<JingsaixinxiEntity> wrapper);
	
	JingsaixinxiVO selectVO(@Param("ew") Wrapper<JingsaixinxiEntity> wrapper);
	
	List<JingsaixinxiView> selectListView(@Param("ew") Wrapper<JingsaixinxiEntity> wrapper);

	List<JingsaixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JingsaixinxiEntity> wrapper);
	
	JingsaixinxiView selectView(@Param("ew") Wrapper<JingsaixinxiEntity> wrapper);
	
}
