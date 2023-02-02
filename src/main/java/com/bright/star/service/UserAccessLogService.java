package com.bright.star.service;

import org.springframework.stereotype.Service;
import com.bright.star.entity.UserAccessLog;
import com.bright.star.dao.UserAccessLogDao;
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
