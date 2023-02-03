package com.bright.star.domain.worker;

import com.bright.star.infrastructure.persistence.dao.*;
import com.bright.star.service.SyainKeihiService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/3
 * @description TODO
 **/
@Slf4j
@Service
@RequiredArgsConstructor
public class WorkerService {

    private final SyainKeihiService syainKeihiService;
    private final SyainKeirekiDao syainKeirekiDao;
    private final SyainKyuyoDao syainKyuyoDao;
    private final SyainMainDao syainMainDao;
    private final SyainRirekiDao syainRirekiDao;
    private final SyainKoutsuhiDao syainKoutsuhiDao;
    private final WorkerFactory workerFactory;

    public void save(Worker worker){
        syainKeihiService.saveBatch(workerFactory.createSyainKeihi(worker));
    }
}
