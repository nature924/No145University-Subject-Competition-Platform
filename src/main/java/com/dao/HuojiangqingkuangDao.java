package com.dao;

import com.entity.HuojiangqingkuangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuojiangqingkuangVO;
import com.entity.view.HuojiangqingkuangView;


/**
 * 获奖情况
 * 
 * @author 
 * @email 
 * @date 2021-04-30 16:23:55
 */
public interface HuojiangqingkuangDao extends BaseMapper<HuojiangqingkuangEntity> {
	
	List<HuojiangqingkuangVO> selectListVO(@Param("ew") Wrapper<HuojiangqingkuangEntity> wrapper);
	
	HuojiangqingkuangVO selectVO(@Param("ew") Wrapper<HuojiangqingkuangEntity> wrapper);
	
	List<HuojiangqingkuangView> selectListView(@Param("ew") Wrapper<HuojiangqingkuangEntity> wrapper);

	List<HuojiangqingkuangView> selectListView(Pagination page,@Param("ew") Wrapper<HuojiangqingkuangEntity> wrapper);
	
	HuojiangqingkuangView selectView(@Param("ew") Wrapper<HuojiangqingkuangEntity> wrapper);
	
}
