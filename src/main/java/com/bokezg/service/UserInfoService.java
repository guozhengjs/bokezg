package com.bokezg.service;

import com.bokezg.entity.UserInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zguo
 * @since 2023-11-30
 */
public interface UserInfoService extends IService<UserInfo> {

    UserInfo getUserList();
}
