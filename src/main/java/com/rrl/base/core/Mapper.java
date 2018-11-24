package com.rrl.base.core;

import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

/**
 * 自定义mapper
 * @author ml
 * @date 2018年11月6日 下午2:35:11
 *
 * @param <T>
 */
public interface Mapper<T>
        extends
        BaseMapper<T>,
        ConditionMapper<T>,
        IdsMapper<T>,
        InsertListMapper<T> {
}
