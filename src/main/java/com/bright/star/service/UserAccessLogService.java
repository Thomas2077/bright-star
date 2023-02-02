package com.bright.star.service;

import org.springframework.stereotype.Service;
import com.bright.star.infrastructure.persistence.entity.UserAccessLog;
import com.bright.star.infrastructure.persistence.dao.UserAccessLogDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
* <p>
    *  服务类
    * </p>
*
* @since 2023-02-02
*/
@Service
public class UserAccessLogService extends  ServiceImpl<UserAccessLogDao, UserAccessLog> {

}
