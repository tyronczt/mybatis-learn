package com.tyron.mybatislearn.mapper;

import com.tyron.mybatislearn.po.User;

/**
 * @description:
 * @author: Chenzt
 * @create: 2023-01-12
 */
public interface IUserMapper {

    User queryUserInfoById(Long id);
}
