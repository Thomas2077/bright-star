package com.bright.star.controller;

import com.bright.star.service.SyainKeirekiService;
import com.bright.star.entity.SyainKeireki;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bright.star.common.config.PageResult;
import com.bright.star.common.config.result.R;
import com.bright.star.model.dto.SyainKeirekiDTO;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.hutool.core.bean.BeanUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import cn.hutool.core.collection.CollectionUtil;
import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RestController;

/**
* <p>
* 社員マスタ_経歴 前端控制器
* </p>
* @since 2023-02-02
*/

@Slf4j
@Api(tags = "社員マスタ_経歴")
@RestController
@RequestMapping("/syainKeireki")
        public class SyainKeirekiController {

        @Autowired
        private SyainKeirekiService syainKeirekiService;


        @ApiOperation(value = "新增")
        @PostMapping("")
        public R save(@RequestBody SyainKeirekiDTO syainKeirekiDTO){
        var syainKeireki = BeanUtil.copyProperties(syainKeirekiDTO, SyainKeireki.class);
        syainKeirekiService.save(syainKeireki);
        return R.success();
        }

        @ApiOperation(value = "根据id删除")
        @DeleteMapping("/{id}")
        public R delete(@PathVariable("id") String id){
        syainKeirekiService.removeById(id);
        return R.success();
        }

        @ApiOperation(value = "根据id修改")
        @PutMapping("/{id}")
        public R update(@PathVariable("id") String id, @RequestBody SyainKeirekiDTO syainKeirekiDTO){
        var syainKeireki = BeanUtil.copyProperties(syainKeirekiDTO, SyainKeireki.class);
        syainKeirekiService.updateById(syainKeireki);
        return R.success();
        }


        @ApiOperation(value = "条件查询")
        @PostMapping("/pageQuery")
        public R list(@RequestBody SyainKeireki syainKeireki){
        List<SyainKeireki> syainKeirekiList = syainKeirekiService.list(new QueryWrapper<>(syainKeireki));
        return R.success(syainKeirekiList);
        }

        @ApiOperation(value = "查询所有")
        @GetMapping("")
        public R list() {
        var syainKeirekiList = syainKeirekiService.list(new QueryWrapper<>());
        var syainKeirekiDTOList = BeanUtil.copyToList(syainKeirekiList, SyainKeirekiDTO.class);
        return R.success(syainKeirekiDTOList);
        }

        @ApiOperation(value = "列表（分页）")
        @GetMapping("/list")
        public R list(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize){
        var page = syainKeirekiService.page(new Page<>(pageNum, pageSize), null);
        return R.success(new PageResult<>(page.getTotal(),page.getRecords()));
        }

        @ApiOperation(value = "详情")
        @GetMapping("/{id}")
        public R get(@PathVariable("id") String id){
        var syainKeireki= syainKeirekiService.getById(id);
        if ( syainKeireki  != null) {
        var syainKeirekiDTO = BeanUtil.copyProperties(syainKeireki, SyainKeirekiDTO.class);
        return R.success(syainKeirekiDTO);
        }
        return R.fail(404,"找不到实体,id:"+ id);
        }
    }
