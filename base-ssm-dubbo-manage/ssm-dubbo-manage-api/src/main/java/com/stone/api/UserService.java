package com.stone.api;

import com.stone.pojo.TUser;

public interface UserService {

    /**
     * 根据id查询用户信息
     * @param Id 用户id
     * @return 用户实体信息
     */
    TUser findUserById(Integer Id);
}
