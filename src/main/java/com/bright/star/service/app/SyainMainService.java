package com.bright.star.service.app;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bright.star.controller.command.EmployeeQueryCommand;
import com.bright.star.infrastructure.common.BeanTools;
import com.bright.star.service.dto.SyainMainDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import com.bright.star.infrastructure.persistence.entity.SyainMain;
import com.bright.star.infrastructure.persistence.dao.SyainMainDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
*
* @since 2023-02-02
*/
@Service
public class SyainMainService extends  ServiceImpl<SyainMainDao, SyainMain> {

    public List<SyainMainDTO> queryPreview(EmployeeQueryCommand command){


        QueryWrapper<SyainMain> previewQuery = new QueryWrapper<>();
        if(command.companyId() != null){
            previewQuery.eq("SYOZOKU_KAISYA", command.companyId());
        }
        if(StrUtil.isNotEmpty(command.workerName())){
            previewQuery.eq("CONCAT(FIRST_NAME_KANJI, LAST_NAME_KANJI)", command.workerName());
        }
        if(command.jobCategoryId() != null){
            previewQuery.eq("SYOKUGYO_KIND", command.jobCategoryId());
        }
        previewQuery = command.onDuty()?
                previewQuery.isNotNull("TAISYA_DATE") : previewQuery.isNull("TAISYA_DATE");
        List<SyainMainDTO> syainMainDTOList = BeanUtil.copyToList(this.list(previewQuery), SyainMainDTO.class);
        return syainMainDTOList;
    }
}
