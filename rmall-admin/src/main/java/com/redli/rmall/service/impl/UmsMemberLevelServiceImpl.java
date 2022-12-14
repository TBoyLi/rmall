package com.redli.rmall.service.impl;

import com.redli.rmall.mapper.UmsMemberLevelMapper;
import com.redli.rmall.model.UmsMemberLevel;
import com.redli.rmall.model.UmsMemberLevelExample;
import com.redli.rmall.service.UmsMemberLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 会员等级管理Service实现类
 *
 * @author redli
 * @date 2022/9/9
 */
@Service
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService {
    @Autowired
    private UmsMemberLevelMapper memberLevelMapper;
    @Override
    public List<UmsMemberLevel> list(Integer defaultStatus) {
        UmsMemberLevelExample example = new UmsMemberLevelExample();
        example.createCriteria().andDefaultStatusEqualTo(defaultStatus);
        return memberLevelMapper.selectByExample(example);
    }
}
