package com.bright.star.infrastructure.persistence.dao;

import com.bright.star.infrastructure.persistence.entity.UserAccessLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
* <p>
    *  Mapper 接口
    * </p>
*
* @since 2023-02-02
*/
@Repository
public interface UserAccessLogDao extends BaseMapper<UserAccessLog> {

}
