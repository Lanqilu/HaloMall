package com.halo.mall.order.dao;

import com.halo.mall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 *
 * @author Halo
 * @email 885240677@qq.com
 * @date 2021-03-18 19:52:38
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {

}
