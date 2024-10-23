package com.dao;

import com.entity.JingsaizongjieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingsaizongjieVO;
import com.entity.view.JingsaizongjieView;


/**
 * 竞赛总结
 * 
 * @author 
 * @email 
 * @date 2021-04-30 16:23:55
 */
public interface JingsaizongjieDao extends BaseMapper<JingsaizongjieEntity> {
	
	List<JingsaizongjieVO> selectListVO(@Param("ew") Wrapper<JingsaizongjieEntity> wrapper);
	
	JingsaizongjieVO selectVO(@Param("ew") Wrapper<JingsaizongjieEntity> wrapper);
	
	List<JingsaizongjieView> selectListView(@Param("ew") Wrapper<JingsaizongjieEntity> wrapper);

	List<JingsaizongjieView> selectListView(Pagination page,@Param("ew") Wrapper<JingsaizongjieEntity> wrapper);
	
	JingsaizongjieView selectView(@Param("ew") Wrapper<JingsaizongjieEntity> wrapper);
	
}
