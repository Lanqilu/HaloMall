package com.halo.mall.order.dao;

import com.halo.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 *
 * @author Halo
 * @email 885240677@qq.com
 * @date 2021-03-18 19:52:38
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {

}
