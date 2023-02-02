package com.bright.star.controller;

import com.bright.star.service.SyainKoutsuhiService;
import com.bright.star.infrastructure.persistence.entity.SyainKoutsuhi;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bright.star.infrastructure.common.PageResult;
import com.bright.star.infrastructure.common.result.R;
import com.bright.star.infrastructure.persistence.dto.SyainKoutsuhiDTO;
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
* 社員_交通費 前端控制器
* </p>
* @since 2023-02-02
*/

@Slf4j
@Api(tags = "社員_交通費")
@RestController
@RequestMapping("/syainKoutsuhi")
        public class SyainKoutsuhiController {

        @Autowired
        private SyainKoutsuhiService syainKoutsuhiService;


        @ApiOperation(value = "新增")
        @PostMapping("")
        public R save(@RequestBody SyainKoutsuhiDTO syainKoutsuhiDTO){
        var syainKoutsuhi = BeanUtil.copyProperties(syainKoutsuhiDTO, SyainKoutsuhi.class);
        syainKoutsuhiService.save(syainKoutsuhi);
        return R.success();
        }

        @ApiOperation(value = "根据id删除")
        @DeleteMapping("/{id}")
        public R delete(@PathVariable("id") String id){
        syainKoutsuhiService.removeById(id);
        return R.success();
        }

        @ApiOperation(value = "根据id修改")
        @PutMapping("/{id}")
        public R update(@PathVariable("id") String id, @RequestBody SyainKoutsuhiDTO syainKoutsuhiDTO){
        var syainKoutsuhi = BeanUtil.copyProperties(syainKoutsuhiDTO, SyainKoutsuhi.class);
        syainKoutsuhiService.updateById(syainKoutsuhi);
        return R.success();
        }


        @ApiOperation(value = "条件查询")
        @PostMapping("/pageQuery")
        public R list(@RequestBody SyainKoutsuhi syainKoutsuhi){
        List<SyainKoutsuhi> syainKoutsuhiList = syainKoutsuhiService.list(new QueryWrapper<>(syainKoutsuhi));
        return R.success(syainKoutsuhiList);
        }

        @ApiOperation(value = "查询所有")
        @GetMapping("")
        public R list() {
        var syainKoutsuhiList = syainKoutsuhiService.list(new QueryWrapper<>());
        var syainKoutsuhiDTOList = BeanUtil.copyToList(syainKoutsuhiList, SyainKoutsuhiDTO.class);
        return R.success(syainKoutsuhiDTOList);
        }

        @ApiOperation(value = "列表（分页）")
        @GetMapping("/list")
        public R list(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize){
        var page = syainKoutsuhiService.page(new Page<>(pageNum, pageSize), null);
        return R.success(new PageResult<>(page.getTotal(),page.getRecords()));
        }

        @ApiOperation(value = "详情")
        @GetMapping("/{id}")
        public R get(@PathVariable("id") String id){
        var syainKoutsuhi= syainKoutsuhiService.getById(id);
        if ( syainKoutsuhi  != null) {
        var syainKoutsuhiDTO = BeanUtil.copyProperties(syainKoutsuhi, SyainKoutsuhiDTO.class);
        return R.success(syainKoutsuhiDTO);
        }
        return R.fail(404,"找不到实体,id:"+ id);
        }
    }
