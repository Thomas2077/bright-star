package com.bright.star.controller;

import com.bright.star.controller.command.EmployeeQueryCommand;
import com.bright.star.controller.command.EmployeeUpdateCommand;
import com.bright.star.controller.vo.EmployeePreviewInfoVO;
import com.bright.star.service.EmployeeApplicationService;
import com.bright.star.service.dto.EmployeeDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/4
 * @description
 **/
@Slf4j
//@Api(tags = "社员")
@Tag(name = "社员 contoller")
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

    @Operation(summary = "update employee")
    @PostMapping("update")
    public ResponseEntity updateEmployee(@RequestBody EmployeeUpdateCommand command){
        workerApplicationService.update(command);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    /**
     * 個人事業主選択/社員選択
     * @param command query parameter
     * @return
     */
    @GetMapping("/selectEmployees")
    public ResponseEntity<List<EmployeePreviewInfoVO>> selectEmployees(EmployeeQueryCommand command){
        val employeePreviewInfoDtoList = workerApplicationService.previewEmployees(command);
        List<EmployeePreviewInfoVO> result = employeePreviewInfoDtoList.stream().map(EmployeePreviewInfoVO::build).collect(Collectors.toList());
        return ResponseEntity.ok(result);
    }

    /**
     * ID拆、で社員検索
     * @param id
     * @return
     */
    @GetMapping("/select/{id}")
    @ApiOperation(value = "selectById")
    public ResponseEntity<EmployeeDto> selectById(@PathVariable Integer id){
        return ResponseEntity.ok(workerApplicationService.query(id));
    }
}
