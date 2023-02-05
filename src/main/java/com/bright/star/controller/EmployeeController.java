package com.bright.star.controller;

import com.bright.star.controller.command.EmployeeQueryCommand;
import com.bright.star.controller.vo.EmployeePreviewInfoVO;
import com.bright.star.service.EmployeeApplicationService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/4
 * @description
 **/
@Slf4j
@Api(tags = "社员")
@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/employee-manage")
public class EmployeeController {

    public final EmployeeApplicationService workerApplicationService;

    /**
     * 社員管理画面検索 command
     * @param command preview
     * @return
     */
    @GetMapping("/previewEmployees")
    public List<EmployeePreviewInfoVO> previewEmployees(EmployeeQueryCommand command){
        val employeePreviewInfoDtoList = workerApplicationService.previewEmployees(command);
        return employeePreviewInfoDtoList.stream().map(EmployeePreviewInfoVO::build).collect(Collectors.toList());
    }

    /**
     * 個人事業主選択/社員選択
     * @param command preview
     * @return
     */
    @GetMapping("/selectEmployees")
    public List<EmployeePreviewInfoVO> selectEmployees(EmployeeQueryCommand command){
        val employeePreviewInfoDtoList = workerApplicationService.previewEmployees(command);
        return employeePreviewInfoDtoList.stream().map(EmployeePreviewInfoVO::build).collect(Collectors.toList());
    }
}
