package com.dao;

import com.entity.JingsaileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingsaileixingVO;
import com.entity.view.JingsaileixingView;


/**
 * 竞赛类型
 * 
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
public interface JingsaileixingDao extends BaseMapper<JingsaileixingEntity> {
	
	List<JingsaileixingVO> selectListVO(@Param("ew") Wrapper<JingsaileixingEntity> wrapper);
	
	JingsaileixingVO selectVO(@Param("ew") Wrapper<JingsaileixingEntity> wrapper);
	
	List<JingsaileixingView> selectListView(@Param("ew") Wrapper<JingsaileixingEntity> wrapper);

	List<JingsaileixingView> selectListView(Pagination page,@Param("ew") Wrapper<JingsaileixingEntity> wrapper);
	
	JingsaileixingView selectView(@Param("ew") Wrapper<JingsaileixingEntity> wrapper);
	
}
