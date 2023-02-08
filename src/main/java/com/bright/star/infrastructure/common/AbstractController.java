package com.bright.star.infrastructure.common;

import com.bright.star.service.dto.UserAuthDTO;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/4
 * @description
 **/
public abstract class AbstractController {

    protected UserAuthDTO getUser(){
        return null;
    }
}
