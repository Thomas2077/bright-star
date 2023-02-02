package com.bright.star.controller;

import com.bright.star.service.SyainKeihiService;
import com.bright.star.infrastructure.persistence.entity.SyainKeihi;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bright.star.infrastructure.common.PageResult;
import com.bright.star.infrastructure.common.result.R;
import com.bright.star.infrastructure.persistence.dto.SyainKeihiDTO;
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
@RequestMapping("/syainKeihi")
        public class SyainKeihiController {

        @Autowired
        private SyainKeihiService syainKeihiService;


        @ApiOperation(value = "新增")
        @PostMapping("")
        public R save(@RequestBody SyainKeihiDTO syainKeihiDTO){
        var syainKeihi = BeanUtil.copyProperties(syainKeihiDTO, SyainKeihi.class);
        syainKeihiService.save(syainKeihi);
        return R.success();
        }

        @ApiOperation(value = "根据id删除")
        @DeleteMapping("/{id}")
        public R delete(@PathVariable("id") String id){
        syainKeihiService.removeById(id);
        return R.success();
        }

        @ApiOperation(value = "根据id修改")
        @PutMapping("/{id}")
        public R update(@PathVariable("id") String id, @RequestBody SyainKeihiDTO syainKeihiDTO){
        var syainKeihi = BeanUtil.copyProperties(syainKeihiDTO, SyainKeihi.class);
        syainKeihiService.updateById(syainKeihi);
        return R.success();
        }


        @ApiOperation(value = "条件查询")
        @PostMapping("/pageQuery")
        public R list(@RequestBody SyainKeihi syainKeihi){
        List<SyainKeihi> syainKeihiList = syainKeihiService.list(new QueryWrapper<>(syainKeihi));
        return R.success(syainKeihiList);
        }

        @ApiOperation(value = "查询所有")
        @GetMapping("")
        public R list() {
        var syainKeihiList = syainKeihiService.list(new QueryWrapper<>());
        var syainKeihiDTOList = BeanUtil.copyToList(syainKeihiList, SyainKeihiDTO.class);
        return R.success(syainKeihiDTOList);
        }

        @ApiOperation(value = "列表（分页）")
        @GetMapping("/list")
        public R list(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize){
        var page = syainKeihiService.page(new Page<>(pageNum, pageSize), null);
        return R.success(new PageResult<>(page.getTotal(),page.getRecords()));
        }

        @ApiOperation(value = "详情")
        @GetMapping("/{id}")
        public R get(@PathVariable("id") String id){
        var syainKeihi= syainKeihiService.getById(id);
        if ( syainKeihi  != null) {
        var syainKeihiDTO = BeanUtil.copyProperties(syainKeihi, SyainKeihiDTO.class);
        return R.success(syainKeihiDTO);
        }
        return R.fail(404,"找不到实体,id:"+ id);
        }
    }
