package com.halo.mall.member.dao;

import com.halo.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 *
 * @author Halo
 * @email 885240677@qq.com
 * @date 2021-03-18 19:43:49
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {

}
