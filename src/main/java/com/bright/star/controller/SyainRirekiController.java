package com.bright.star.controller;

import com.bright.star.service.SyainRirekiService;
import com.bright.star.infrastructure.persistence.entity.SyainRireki;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bright.star.infrastructure.common.PageResult;
import com.bright.star.infrastructure.common.result.R;
import com.bright.star.infrastructure.persistence.dto.SyainRirekiDTO;
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
* 社員_経費 前端控制器
* </p>
* @since 2023-02-02
*/

@Slf4j
@Api(tags = "社員_経費")
@RestController
@RequestMapping("/syainRireki")
        public class SyainRirekiController {

        @Autowired
        private SyainRirekiService syainRirekiService;


        @ApiOperation(value = "新增")
        @PostMapping("")
        public R save(@RequestBody SyainRirekiDTO syainRirekiDTO){
        var syainRireki = BeanUtil.copyProperties(syainRirekiDTO, SyainRireki.class);
        syainRirekiService.save(syainRireki);
        return R.success();
        }

        @ApiOperation(value = "根据id删除")
        @DeleteMapping("/{id}")
        public R delete(@PathVariable("id") String id){
        syainRirekiService.removeById(id);
        return R.success();
        }

        @ApiOperation(value = "根据id修改")
        @PutMapping("/{id}")
        public R update(@PathVariable("id") String id, @RequestBody SyainRirekiDTO syainRirekiDTO){
        var syainRireki = BeanUtil.copyProperties(syainRirekiDTO, SyainRireki.class);
        syainRirekiService.updateById(syainRireki);
        return R.success();
        }


        @ApiOperation(value = "条件查询")
        @PostMapping("/pageQuery")
        public R list(@RequestBody SyainRireki syainRireki){
        List<SyainRireki> syainRirekiList = syainRirekiService.list(new QueryWrapper<>(syainRireki));
        return R.success(syainRirekiList);
        }

        @ApiOperation(value = "查询所有")
        @GetMapping("")
        public R list() {
        var syainRirekiList = syainRirekiService.list(new QueryWrapper<>());
        var syainRirekiDTOList = BeanUtil.copyToList(syainRirekiList, SyainRirekiDTO.class);
        return R.success(syainRirekiDTOList);
        }

        @ApiOperation(value = "列表（分页）")
        @GetMapping("/list")
        public R list(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize){
        var page = syainRirekiService.page(new Page<>(pageNum, pageSize), null);
        return R.success(new PageResult<>(page.getTotal(),page.getRecords()));
        }

        @ApiOperation(value = "详情")
        @GetMapping("/{id}")
        public R get(@PathVariable("id") String id){
        var syainRireki= syainRirekiService.getById(id);
        if ( syainRireki  != null) {
        var syainRirekiDTO = BeanUtil.copyProperties(syainRireki, SyainRirekiDTO.class);
        return R.success(syainRirekiDTO);
        }
        return R.fail(404,"找不到实体,id:"+ id);
        }
    }
