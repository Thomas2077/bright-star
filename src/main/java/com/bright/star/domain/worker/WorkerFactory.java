package com.bright.star.domain.worker;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.ListUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.bright.star.infrastructure.persistence.dao.*;
import com.bright.star.service.dto.SyainKeihiDTO;
import com.bright.star.infrastructure.persistence.entity.SyainKeihi;
import com.bright.star.infrastructure.persistence.entity.SyainKeireki;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Component
@RequiredArgsConstructor
public class WorkerFactory {

    private final SyainKeihiDao syainKeihiDao;
    private final SyainKeirekiDao syainKeirekiDao;
    private final SyainKyuyoDao syainKyuyoDao;
    private final SyainMainDao syainMainDao;
    private final SyainRirekiDao syainRirekiDao;
    private final SyainKoutsuhiDao syainKoutsuhiDao;

    public List<SyainKeihi> createSyainKeihi(Worker worker){
        return worker.getSyainKeihiDTOList().stream()
                .map(syainKeihiDTO -> BeanUtil.copyProperties(syainKeihiDTO, SyainKeihi.class))
                .collect(Collectors.toList());
    }

    public List<SyainKeireki> createSyainKeireki(Worker worker){
        return worker.getSyainKeirekiDTOList() == null ?
                ListUtil.empty() : BeanUtil.copyToList(worker.getSyainKeirekiDTOList(), SyainKeireki.class);
    }


    public List<SyainKeihiDTO> createSyainKeihiDto(Integer workerId){
        List<SyainKeihi> syainKeihiList = syainKeihiDao.selectList(new LambdaQueryWrapper<SyainKeihi>().eq(SyainKeihi::getSyainId, workerId));
        return BeanUtil.copyToList(syainKeihiList, SyainKeihiDTO.class);
    }


}
