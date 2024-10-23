package com.dao;

import com.entity.JingsaitikuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingsaitikuVO;
import com.entity.view.JingsaitikuView;


/**
 * 竞赛题库
 * 
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
public interface JingsaitikuDao extends BaseMapper<JingsaitikuEntity> {
	
	List<JingsaitikuVO> selectListVO(@Param("ew") Wrapper<JingsaitikuEntity> wrapper);
	
	JingsaitikuVO selectVO(@Param("ew") Wrapper<JingsaitikuEntity> wrapper);
	
	List<JingsaitikuView> selectListView(@Param("ew") Wrapper<JingsaitikuEntity> wrapper);

	List<JingsaitikuView> selectListView(Pagination page,@Param("ew") Wrapper<JingsaitikuEntity> wrapper);
	
	JingsaitikuView selectView(@Param("ew") Wrapper<JingsaitikuEntity> wrapper);
	
}
