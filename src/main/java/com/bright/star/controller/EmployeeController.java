package com.bright.star.controller;

import com.bright.star.controller.command.EmployeeQueryCommand;
import com.bright.star.controller.command.EmployeeSaveCommand;
import com.bright.star.controller.command.EmployeeUpdateCommand;
import com.bright.star.controller.vo.EmployeePreviewInfoVO;
import com.bright.star.service.EmployeeAppService;
import com.bright.star.service.dto.EmployeeDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
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
@Tag(name = "社员")
@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/employee-manage")
public class EmployeeController {

    public final EmployeeAppService workerApplicationService;

    /**
     * 社員管理画面検索 command
     * @param command preview
     * @return
     */
    @GetMapping("/preview")
    @Operation(summary = "preview employee", description = "社員をプレビューする" )
    public List<EmployeePreviewInfoVO> preview(@Valid @Validated EmployeeQueryCommand command) {
        val employeePreviewInfoDtoList = workerApplicationService.previewEmployees(command);
        return employeePreviewInfoDtoList.stream().map(EmployeePreviewInfoVO::build).collect(Collectors.toList());
    }

    /**
     * update employee
     * @param command
     * @return
     */
    @PutMapping("/update")
    @Operation(summary = "update employee", description = "社員を更新する" )
    public ResponseEntity update(@RequestBody EmployeeUpdateCommand command) {
        workerApplicationService.update(command);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    /**
     * sava employee
     * @param command
     * @return
     */
    @PostMapping("/save")
    @Operation(summary = "save employee", description = "社員を保存する" )
    public ResponseEntity save(@RequestBody EmployeeSaveCommand command) {
        workerApplicationService.save(command);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    /**
     * 個人事業主選択/社員選択
     * @param command query parameter
     * @return
     */
    @GetMapping("/selectBy")
    @Operation(summary = "selectBy", description = "個人事業主選択/社員選択")
    public ResponseEntity<List<EmployeePreviewInfoVO>> selectEmployees(EmployeeQueryCommand command) {
        val employeePreviewInfoDtoList = workerApplicationService.previewEmployees(command);
        List<EmployeePreviewInfoVO> result = employeePreviewInfoDtoList.stream().map(EmployeePreviewInfoVO::build).collect(Collectors.toList());
        return ResponseEntity.ok(result);
    }

    /**
     * IDで社員を検索
     * @param id
     * @return
     */
    @GetMapping("/select/{id}")
    @Operation(summary = "selectById", description = "IDで社員を検索")
    public ResponseEntity<EmployeeDto> selectById(@PathVariable Integer id) {
        return ResponseEntity.ok(workerApplicationService.query(id));
    }
}
