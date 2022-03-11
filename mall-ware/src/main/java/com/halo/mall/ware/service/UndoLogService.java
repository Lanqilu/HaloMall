package com.halo.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.halo.common.utils.PageUtils;
import com.halo.mall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * @author Halo
 * @email 885240677@qq.com
 * @date 2021-03-18 19:58:35
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

