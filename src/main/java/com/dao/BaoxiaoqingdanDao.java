package com.dao;

import com.entity.BaoxiaoqingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaoxiaoqingdanVO;
import com.entity.view.BaoxiaoqingdanView;


/**
 * 报销清单
 * 
 * @author 
 * @email 
 * @date 2021-04-30 16:23:55
 */
public interface BaoxiaoqingdanDao extends BaseMapper<BaoxiaoqingdanEntity> {
	
	List<BaoxiaoqingdanVO> selectListVO(@Param("ew") Wrapper<BaoxiaoqingdanEntity> wrapper);
	
	BaoxiaoqingdanVO selectVO(@Param("ew") Wrapper<BaoxiaoqingdanEntity> wrapper);
	
	List<BaoxiaoqingdanView> selectListView(@Param("ew") Wrapper<BaoxiaoqingdanEntity> wrapper);

	List<BaoxiaoqingdanView> selectListView(Pagination page,@Param("ew") Wrapper<BaoxiaoqingdanEntity> wrapper);
	
	BaoxiaoqingdanView selectView(@Param("ew") Wrapper<BaoxiaoqingdanEntity> wrapper);
	
}
