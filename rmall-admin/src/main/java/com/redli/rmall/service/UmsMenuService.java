package com.redli.rmall.service;

import com.redli.rmall.dto.UmsMenuNode;
import com.redli.rmall.model.UmsMenu;

import java.util.List;

/**
 * 后台菜单管理Service
 *
 * @author redli
 * @date 2022/9/9
 */
public interface UmsMenuService {
    /**
     * 创建后台菜单
     */
    int create(UmsMenu umsMenu);

    /**
     * 修改后台菜单
     */
    int update(Long id, UmsMenu umsMenu);

    /**
     * 根据ID获取菜单详情
     */
    UmsMenu getItem(Long id);

    /**
     * 根据ID删除菜单
     */
    int delete(Long id);

    /**
     * 分页查询后台菜单
     */
    List<UmsMenu> list(Long parentId, Integer pageSize, Integer pageNum);

    /**
     * 树形结构返回所有菜单列表
     */
    List<UmsMenuNode> treeList();

    /**
     * 修改菜单显示状态
     */
    int updateHidden(Long id, Integer hidden);
}
