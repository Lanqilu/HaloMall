package com.halo.mall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.halo.common.utils.PageUtils;
import com.halo.common.utils.Query;

import com.halo.mall.product.dao.CategoryDao;
import com.halo.mall.product.entity.CategoryEntity;
import com.halo.mall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        // 1、查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);

        // 2. 组装父子的树形结构
        // 2.1 找到所有的一级分类
        return entities.stream()
                .filter((categoryEntity) -> categoryEntity.getParentCid() == 0)
                .peek((menu) -> menu.setChildren(getChild(menu, entities)))
                .sorted(Comparator.comparingInt(menu -> (menu.getSort() == null ? 0 : menu.getSort())))
                .collect(Collectors.toList());
    }

    /**
     * 递归查找所有菜单的子菜单
     *
     * @param root
     * @param all
     * @return
     */
    private List<CategoryEntity> getChild(CategoryEntity root, List<CategoryEntity> all) {

        return all.stream().filter(categoryEntity -> categoryEntity.getParentCid()
                .equals(root.getCatId()))
                .peek(categoryEntity -> {
                    // 找到子菜单
                    categoryEntity.setChildren(getChild(categoryEntity, all));
                    // 菜单的排序
                }).sorted(Comparator.comparingInt(menu -> (menu.getSort() == null ? 0 : menu.getSort())))
                .collect(Collectors.toList());
    }

}