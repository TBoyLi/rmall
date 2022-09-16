package com.redli.rmall.service;

import com.redli.rmall.model.UmsResourceCategory;

import java.util.List;

/**
 * 后台资源分类管理Service
 *
 * @author redli
 * @date 2022/9/9
 */
public interface UmsResourceCategoryService {

    /**
     * 获取所有资源分类
     */
    List<UmsResourceCategory> listAll();

    /**
     * 创建资源分类
     */
    int create(UmsResourceCategory umsResourceCategory);

    /**
     * 修改资源分类
     */
    int update(Long id, UmsResourceCategory umsResourceCategory);

    /**
     * 删除资源分类
     */
    int delete(Long id);
}
