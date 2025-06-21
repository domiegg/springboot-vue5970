package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussxuexijiqiaoDao;
import com.entity.DiscussxuexijiqiaoEntity;
import com.service.DiscussxuexijiqiaoService;
import com.entity.vo.DiscussxuexijiqiaoVO;
import com.entity.view.DiscussxuexijiqiaoView;

@Service("discussxuexijiqiaoService")
public class DiscussxuexijiqiaoServiceImpl extends ServiceImpl<DiscussxuexijiqiaoDao, DiscussxuexijiqiaoEntity> implements DiscussxuexijiqiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxuexijiqiaoEntity> page = this.selectPage(
                new Query<DiscussxuexijiqiaoEntity>(params).getPage(),
                new EntityWrapper<DiscussxuexijiqiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxuexijiqiaoEntity> wrapper) {
		  Page<DiscussxuexijiqiaoView> page =new Query<DiscussxuexijiqiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxuexijiqiaoVO> selectListVO(Wrapper<DiscussxuexijiqiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxuexijiqiaoVO selectVO(Wrapper<DiscussxuexijiqiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxuexijiqiaoView> selectListView(Wrapper<DiscussxuexijiqiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxuexijiqiaoView selectView(Wrapper<DiscussxuexijiqiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
