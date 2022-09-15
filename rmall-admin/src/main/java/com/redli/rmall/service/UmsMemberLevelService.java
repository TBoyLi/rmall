package com.redli.rmall.service;

import com.redli.rmall.model.UmsMemberLevel;

import java.util.List;

/**
 * 会员等级管理Service
 *
 * @author redli
 * @date 2018/4/26
 */
public interface UmsMemberLevelService {
    /**
     * 获取所有会员等级
     * @param defaultStatus 是否为默认会员
     */
    List<UmsMemberLevel> list(Integer defaultStatus);
}
