package com.bright.star.controller;

import com.bright.star.service.UserAccessLogService;
import com.bright.star.infrastructure.persistence.entity.UserAccessLog;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bright.star.infrastructure.common.PageResult;
import com.bright.star.infrastructure.common.result.R;
import com.bright.star.infrastructure.persistence.dto.UserAccessLogDTO;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.hutool.core.bean.BeanUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

/**
* <p>
*  前端控制器
* </p>
* @since 2023-02-02
*/

@Slf4j
@Api(tags = "")
@RestController
@RequestMapping("/userAccessLog")
        public class UserAccessLogController {

        @Autowired
        private UserAccessLogService userAccessLogService;


        @ApiOperation(value = "新增")
        @PostMapping("")
        public R save(@RequestBody UserAccessLogDTO userAccessLogDTO){
        var userAccessLog = BeanUtil.copyProperties(userAccessLogDTO, UserAccessLog.class);
        userAccessLogService.save(userAccessLog);
        return R.success();
        }

        @ApiOperation(value = "根据id删除")
        @DeleteMapping("/{id}")
        public R delete(@PathVariable("id") String id){
        userAccessLogService.removeById(id);
        return R.success();
        }

        @ApiOperation(value = "根据id修改")
        @PutMapping("/{id}")
        public R update(@PathVariable("id") String id, @RequestBody UserAccessLogDTO userAccessLogDTO){
        var userAccessLog = BeanUtil.copyProperties(userAccessLogDTO, UserAccessLog.class);
        userAccessLogService.updateById(userAccessLog);
        return R.success();
        }


        @ApiOperation(value = "条件查询")
        @PostMapping("/pageQuery")
        public R list(@RequestBody UserAccessLog userAccessLog){
        List<UserAccessLog> userAccessLogList = userAccessLogService.list(new QueryWrapper<>(userAccessLog));
        return R.success(userAccessLogList);
        }

        @ApiOperation(value = "查询所有")
        @GetMapping("")
        public R list() {
        var userAccessLogList = userAccessLogService.list(new QueryWrapper<>());
        var userAccessLogDTOList = BeanUtil.copyToList(userAccessLogList, UserAccessLogDTO.class);
        return R.success(userAccessLogDTOList);
        }

        @ApiOperation(value = "列表（分页）")
        @GetMapping("/list")
        public R list(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize){
        var page = userAccessLogService.page(new Page<>(pageNum, pageSize), null);
        return R.success(new PageResult<>(page.getTotal(),page.getRecords()));
        }

        @ApiOperation(value = "详情")
        @GetMapping("/{id}")
        public R get(@PathVariable("id") String id){
        var userAccessLog= userAccessLogService.getById(id);
        if ( userAccessLog  != null) {
        var userAccessLogDTO = BeanUtil.copyProperties(userAccessLog, UserAccessLogDTO.class);
        return R.success(userAccessLogDTO);
        }
        return R.fail(404,"找不到实体,id:"+ id);
        }
    }
