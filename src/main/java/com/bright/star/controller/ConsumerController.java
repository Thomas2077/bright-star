package com.bright.star.controller;

import com.bright.star.controller.command.ConsumerQueryCommand;
import com.bright.star.controller.command.CustomerSaveCommand;
import com.bright.star.controller.command.CustomerUpdateCommand;
import com.bright.star.controller.vo.ConsumerWithWorkerVO;
import com.bright.star.infrastructure.access.AccessLog;
import com.bright.star.service.ConsumerAppService;
import com.bright.star.service.dto.TorihikisakiTantouDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("/v1/consumer-manage")
public class ConsumerController {

    public final ConsumerAppService customerService;

    /**
     * 取引先情報を検索する
     * @param command
     * @return
     */
    @GetMapping
    @AccessLog
    @Operation(summary = "queryByCondition", description = "取引先を検索する" )
    public ResponseEntity<List<ConsumerWithWorkerVO>> queryByCondition(ConsumerQueryCommand command) {
       return ResponseEntity.ok(customerService.queryByCondition(command));
    }

    /**
     * 取引先情報を保存する
     * @param command
     * @return
     */
    @PostMapping
    @Operation(summary = "saveCustomer", description = "取引先を保存する" )
    public void saveCustomer(@RequestBody CustomerSaveCommand command) {
        customerService.saveCustomer(command);
    }

    /**
     * 取引先情報を更新する
     * @param command
     * @return
     */
    @PutMapping
    @Operation(summary = "updateCustomer", description = "取引先を更新する" )
    public void updateCustomer(@RequestBody CustomerUpdateCommand command) {
        customerService.updateCustomer(command);
    }

    @GetMapping("/tantou/{id}")
    @Operation(summary = "queryTantouByConsumerId", description = "担当を検索する")
    public ResponseEntity<List<TorihikisakiTantouDTO>> queryByTantouId(@PathVariable("id") Integer id){
        return ResponseEntity.ok(customerService.getTantouByConsumerId(id));
    }
}