package com.dao;

import com.entity.TimuleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TimuleixingVO;
import com.entity.view.TimuleixingView;


/**
 * 题目类型
 * 
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
public interface TimuleixingDao extends BaseMapper<TimuleixingEntity> {
	
	List<TimuleixingVO> selectListVO(@Param("ew") Wrapper<TimuleixingEntity> wrapper);
	
	TimuleixingVO selectVO(@Param("ew") Wrapper<TimuleixingEntity> wrapper);
	
	List<TimuleixingView> selectListView(@Param("ew") Wrapper<TimuleixingEntity> wrapper);

	List<TimuleixingView> selectListView(Pagination page,@Param("ew") Wrapper<TimuleixingEntity> wrapper);
	
	TimuleixingView selectView(@Param("ew") Wrapper<TimuleixingEntity> wrapper);
	
}
