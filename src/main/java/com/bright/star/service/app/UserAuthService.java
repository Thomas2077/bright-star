package com.bright.star.service.app;

import org.springframework.stereotype.Service;
import com.bright.star.infrastructure.persistence.entity.UserAuth;
import com.bright.star.infrastructure.persistence.dao.UserAuthDao;
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
