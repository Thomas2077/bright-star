package com.bright.star.service.tmp;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.collection.ListUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.bright.star.infrastructure.exception.BusinessException;
import com.bright.star.service.dto.TgSettingDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.bright.star.infrastructure.persistence.entity.TgSetting;
import com.bright.star.infrastructure.persistence.dao.TgSettingDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
* <p>
    *  服务类
    * </p>
*
* @since 2023-02-02
*/
@Slf4j
@Service
public class TgSettingService extends  ServiceImpl<TgSettingDao, TgSetting> {

    private static final int ONE = 0;

    public List<TgSettingDTO> listByTypes(Integer cateA, Integer cateB, Integer cateC ){
        List<TgSetting> tgSettingList = querySetting(cateA, cateB, cateC);
        return BeanUtil.copyToList(tgSettingList, TgSettingDTO.class);
    }

    public TgSettingDTO findByTypes(Integer cateA, @NotNull Integer cateB, @NotNull Integer cateC ){
        List<TgSetting> tgSettingList = querySetting(cateA, cateB, cateC);
        if(CollectionUtil.isEmpty(tgSettingList)){
            log.error("{}, {}, {} setting is not exist", cateA, cateB, cateC);
            throw new BusinessException(" setting record null exception");
        }
        return BeanUtil.copyProperties(tgSettingList.get(ONE), TgSettingDTO.class);
    }

    private List<TgSetting> querySetting(Integer cateA, Integer cateB, Integer cateC ){
        LambdaQueryWrapper<TgSetting> condition = new LambdaQueryWrapper<>();
        condition.eq(TgSetting::getCategory1, cateA);
        if(cateB != null){
            condition.eq(TgSetting::getCategory2, cateB);
        }
        if(cateC != null){
            condition.eq(TgSetting::getCategory3, cateC);
        }
        List<TgSetting> result = this.list(condition);
        return result;
    }

}
