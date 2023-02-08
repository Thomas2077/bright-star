package com.bright.star.controller.tmp;

import com.bright.star.service.tmp.SyainKyuyoService;
import com.bright.star.infrastructure.persistence.entity.SyainKyuyo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bright.star.infrastructure.common.PageResult;
import com.bright.star.infrastructure.common.result.R;
import com.bright.star.service.dto.SyainKyuyoDTO;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.hutool.core.bean.BeanUtil;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

/**
* <p>
* 社員_給与 前端控制器
* </p>
* @since 2023-02-02
*/

@Slf4j
@Api(tags = "社員_給与")
@RestController
@RequestMapping("/syainKyuyo")
        public class SyainKyuyoController {

        @Autowired
        private SyainKyuyoService syainKyuyoService;


        @ApiOperation(value = "新增")
        @PostMapping("")
        public R save(@RequestBody SyainKyuyoDTO syainKyuyoDTO){
        var syainKyuyo = BeanUtil.copyProperties(syainKyuyoDTO, SyainKyuyo.class);
        syainKyuyoService.save(syainKyuyo);
        return R.success();
        }

        @ApiOperation(value = "根据id删除")
        @DeleteMapping("/{id}")
        public R delete(@PathVariable("id") String id){
        syainKyuyoService.removeById(id);
        return R.success();
        }

        @ApiOperation(value = "根据id修改")
        @PutMapping("/{id}")
        public R update(@PathVariable("id") String id, @RequestBody SyainKyuyoDTO syainKyuyoDTO){
        var syainKyuyo = BeanUtil.copyProperties(syainKyuyoDTO, SyainKyuyo.class);
        syainKyuyoService.updateById(syainKyuyo);
        return R.success();
        }


        @ApiOperation(value = "条件查询")
        @PostMapping("/pageQuery")
        public R list(@RequestBody SyainKyuyo syainKyuyo){
        List<SyainKyuyo> syainKyuyoList = syainKyuyoService.list(new QueryWrapper<>(syainKyuyo));
        return R.success(syainKyuyoList);
        }

        @ApiOperation(value = "查询所有")
        @GetMapping("")
        public R list() {
        var syainKyuyoList = syainKyuyoService.list(new QueryWrapper<>());
        var syainKyuyoDTOList = BeanUtil.copyToList(syainKyuyoList, SyainKyuyoDTO.class);
        return R.success(syainKyuyoDTOList);
        }

        @ApiOperation(value = "列表（分页）")
        @GetMapping("/list")
        public R list(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize){
        var page = syainKyuyoService.page(new Page<>(pageNum, pageSize), null);
        return R.success(new PageResult<>(page.getTotal(),page.getRecords()));
        }

        @ApiOperation(value = "详情")
        @GetMapping("/{id}")
        public R get(@PathVariable("id") String id){
        var syainKyuyo= syainKyuyoService.getById(id);
        if ( syainKyuyo  != null) {
        var syainKyuyoDTO = BeanUtil.copyProperties(syainKyuyo, SyainKyuyoDTO.class);
        return R.success(syainKyuyoDTO);
        }
        return R.fail(404,"找不到实体,id:"+ id);
        }
    }
