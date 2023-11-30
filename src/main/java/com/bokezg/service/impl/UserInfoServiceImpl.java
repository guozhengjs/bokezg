package com.bokezg.service.impl;

import com.bokezg.entity.UserInfo;
import com.bokezg.mapper.UserInfoMapper;
import com.bokezg.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zguo
 * @since 2023-11-30
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUserList() {
        return userInfoMapper.selectById("2023113001");
    }
}
