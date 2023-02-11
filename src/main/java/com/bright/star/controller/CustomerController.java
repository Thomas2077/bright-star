package com.bright.star.controller;

import com.bright.star.controller.command.CustomerQueryCommand;
import com.bright.star.controller.command.CustomerSaveCommand;
import com.bright.star.controller.command.CustomerUpdateCommand;
import com.bright.star.service.CustomerAppService;
import com.bright.star.service.dto.TorihikisakiMainDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/11
 * @description
 **/
@Slf4j
@Tag(name = "取引先")
@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/customer-manage")
public class CustomerController {

    public final CustomerAppService customerService;

    /**
     * 取引先情報を検索する
     * @param command
     * @return
     */
    @GetMapping("/")
    @Operation(summary = "queryByCondition", description = "取引先を検索する" )
    public List<TorihikisakiMainDTO> queryByCondition(@Validated CustomerQueryCommand command) {
       return customerService.queryByCondition(command);
    }

    /**
     * 取引先情報を保存する
     * @param command
     * @return
     */
    @PostMapping("/")
    @Operation(summary = "saveCustomer", description = "取引先を保存する" )
    public void saveCustomer(CustomerSaveCommand command) {
        customerService.saveCustomer(command);
    }

    /**
     * 取引先情報を更新する
     * @param command
     * @return
     */
    @PutMapping()
    @Operation(summary = "updateCustomer", description = "取引先を更新する" )
    public void updateCustomer(CustomerUpdateCommand command) {
        customerService.updateCustomer(command);
    }
}