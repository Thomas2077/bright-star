package com.bright.star.service;

import org.springframework.stereotype.Service;
import com.bright.star.entity.UserAuth;
import com.bright.star.dao.UserAuthDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
* <p>
    *  服务类
    * </p>
*
* @since 2023-02-02
*/
@Service
public class UserAuthService extends  ServiceImpl<UserAuthDao, UserAuth> {

}
