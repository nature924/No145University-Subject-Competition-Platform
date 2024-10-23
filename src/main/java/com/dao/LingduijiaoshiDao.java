package com.dao;

import com.entity.LingduijiaoshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LingduijiaoshiVO;
import com.entity.view.LingduijiaoshiView;


/**
 * 领队教师
 * 
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
public interface LingduijiaoshiDao extends BaseMapper<LingduijiaoshiEntity> {
	
	List<LingduijiaoshiVO> selectListVO(@Param("ew") Wrapper<LingduijiaoshiEntity> wrapper);
	
	LingduijiaoshiVO selectVO(@Param("ew") Wrapper<LingduijiaoshiEntity> wrapper);
	
	List<LingduijiaoshiView> selectListView(@Param("ew") Wrapper<LingduijiaoshiEntity> wrapper);

	List<LingduijiaoshiView> selectListView(Pagination page,@Param("ew") Wrapper<LingduijiaoshiEntity> wrapper);
	
	LingduijiaoshiView selectView(@Param("ew") Wrapper<LingduijiaoshiEntity> wrapper);
	
}
