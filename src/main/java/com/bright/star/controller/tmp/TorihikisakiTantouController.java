package com.bright.star.controller.tmp;

import com.bright.star.service.tmp.TorihikisakiTantouService;
import com.bright.star.infrastructure.persistence.entity.TorihikisakiTantou;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bright.star.infrastructure.common.PageResult;
import com.bright.star.infrastructure.common.result.R;
import com.bright.star.service.dto.TorihikisakiTantouDTO;
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
*  前端控制器
* </p>
* @since 2023-02-02
*/

@Slf4j
@Api(tags = "")
@RestController
@RequestMapping("/torihikisakiTantou")
        public class TorihikisakiTantouController {

        @Autowired
        private TorihikisakiTantouService torihikisakiTantouService;


        @ApiOperation(value = "新增")
        @PostMapping("")
        public R save(@RequestBody TorihikisakiTantouDTO torihikisakiTantouDTO){
        var torihikisakiTantou = BeanUtil.copyProperties(torihikisakiTantouDTO, TorihikisakiTantou.class);
        torihikisakiTantouService.save(torihikisakiTantou);
        return R.success();
        }

        @ApiOperation(value = "根据id删除")
        @DeleteMapping("/{id}")
        public R delete(@PathVariable("id") String id){
        torihikisakiTantouService.removeById(id);
        return R.success();
        }

        @ApiOperation(value = "根据id修改")
        @PutMapping("/{id}")
        public R update(@PathVariable("id") String id, @RequestBody TorihikisakiTantouDTO torihikisakiTantouDTO){
        var torihikisakiTantou = BeanUtil.copyProperties(torihikisakiTantouDTO, TorihikisakiTantou.class);
        torihikisakiTantouService.updateById(torihikisakiTantou);
        return R.success();
        }


        @ApiOperation(value = "条件查询")
        @PostMapping("/pageQuery")
        public R list(@RequestBody TorihikisakiTantou torihikisakiTantou){
        List<TorihikisakiTantou> torihikisakiTantouList = torihikisakiTantouService.list(new QueryWrapper<>(torihikisakiTantou));
        return R.success(torihikisakiTantouList);
        }

        @ApiOperation(value = "查询所有")
        @GetMapping("")
        public R list() {
        var torihikisakiTantouList = torihikisakiTantouService.list(new QueryWrapper<>());
        var torihikisakiTantouDTOList = BeanUtil.copyToList(torihikisakiTantouList, TorihikisakiTantouDTO.class);
        return R.success(torihikisakiTantouDTOList);
        }

        @ApiOperation(value = "列表（分页）")
        @GetMapping("/list")
        public R list(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize){
        var page = torihikisakiTantouService.page(new Page<>(pageNum, pageSize), null);
        return R.success(new PageResult<>(page.getTotal(),page.getRecords()));
        }

        @ApiOperation(value = "详情")
        @GetMapping("/{id}")
        public R get(@PathVariable("id") String id){
        var torihikisakiTantou= torihikisakiTantouService.getById(id);
        if ( torihikisakiTantou  != null) {
        var torihikisakiTantouDTO = BeanUtil.copyProperties(torihikisakiTantou, TorihikisakiTantouDTO.class);
        return R.success(torihikisakiTantouDTO);
        }
        return R.fail(404,"找不到实体,id:"+ id);
        }
    }
