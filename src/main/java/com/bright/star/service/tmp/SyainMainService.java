package com.bright.star.service.tmp;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bright.star.controller.command.EmployeeQueryCommand;
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

    public List<SyainMain> queryPreview(EmployeeQueryCommand command){


        QueryWrapper<SyainMain> previewQuery = new QueryWrapper<>();
        if(command.getCompanyId() != null){
            previewQuery.eq("SYOZOKU_KAISYA", command.getCompanyId());
        }
        if(StrUtil.isNotEmpty(command.getWorkerName())){
            previewQuery.eq("CONCAT(FIRST_NAME_KANJI, LAST_NAME_KANJI)", command.getWorkerName());
        }
        if(command.getJobCategoryId() != null){
            previewQuery.eq("SYOKUGYO_KIND", command.getJobCategoryId());
        }
        previewQuery = command.isOnDuty() ?
                previewQuery.isNotNull("TAISYA_DATE") : previewQuery.isNull("TAISYA_DATE");
        return this.list(previewQuery);
    }
}
