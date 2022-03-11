package com.halo.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.halo.common.utils.PageUtils;
import com.halo.mall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author Halo
 * @email 885240677@qq.com
 * @date 2021-03-18 19:43:49
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

