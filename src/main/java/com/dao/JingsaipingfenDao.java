package com.dao;

import com.entity.JingsaipingfenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingsaipingfenVO;
import com.entity.view.JingsaipingfenView;


/**
 * 竞赛评分
 * 
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
public interface JingsaipingfenDao extends BaseMapper<JingsaipingfenEntity> {
	
	List<JingsaipingfenVO> selectListVO(@Param("ew") Wrapper<JingsaipingfenEntity> wrapper);
	
	JingsaipingfenVO selectVO(@Param("ew") Wrapper<JingsaipingfenEntity> wrapper);
	
	List<JingsaipingfenView> selectListView(@Param("ew") Wrapper<JingsaipingfenEntity> wrapper);

	List<JingsaipingfenView> selectListView(Pagination page,@Param("ew") Wrapper<JingsaipingfenEntity> wrapper);
	
	JingsaipingfenView selectView(@Param("ew") Wrapper<JingsaipingfenEntity> wrapper);
	
}
