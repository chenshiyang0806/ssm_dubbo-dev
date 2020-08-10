package com.stone.api;

import com.alibaba.dubbo.config.annotation.Service;
import com.stone.dao.TUserMapper;
import com.stone.pojo.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: ccssyy
 * @time: 2020/7/23 10:50
 */
@Service(interfaceClass = UserService.class)
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    TUserMapper tUserMapper;

    /**
     * 根据id查询用户信息
     * @param Id 用户id
     * @return 用户实体信息
     */
    @Override
    public TUser findUserById(Integer Id) {
        TUser tUser = tUserMapper.selectByPrimaryKey( Id );
        return tUser;
    }
}
