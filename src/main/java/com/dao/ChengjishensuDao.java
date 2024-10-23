package com.dao;

import com.entity.ChengjishensuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChengjishensuVO;
import com.entity.view.ChengjishensuView;


/**
 * 成绩申诉
 * 
 * @author 
 * @email 
 * @date 2021-04-30 16:23:55
 */
public interface ChengjishensuDao extends BaseMapper<ChengjishensuEntity> {
	
	List<ChengjishensuVO> selectListVO(@Param("ew") Wrapper<ChengjishensuEntity> wrapper);
	
	ChengjishensuVO selectVO(@Param("ew") Wrapper<ChengjishensuEntity> wrapper);
	
	List<ChengjishensuView> selectListView(@Param("ew") Wrapper<ChengjishensuEntity> wrapper);

	List<ChengjishensuView> selectListView(Pagination page,@Param("ew") Wrapper<ChengjishensuEntity> wrapper);
	
	ChengjishensuView selectView(@Param("ew") Wrapper<ChengjishensuEntity> wrapper);
	
}
