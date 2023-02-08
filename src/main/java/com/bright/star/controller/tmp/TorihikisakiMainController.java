package com.bright.star.controller.tmp;

import com.bright.star.service.tmp.TorihikisakiMainService;
import com.bright.star.infrastructure.persistence.entity.TorihikisakiMain;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bright.star.infrastructure.common.PageResult;
import com.bright.star.infrastructure.common.result.R;
import com.bright.star.service.dto.TorihikisakiMainDTO;
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
@RequestMapping("/torihikisakiMain")
        public class TorihikisakiMainController {

        @Autowired
        private TorihikisakiMainService torihikisakiMainService;


        @ApiOperation(value = "新增")
        @PostMapping("")
        public R save(@RequestBody TorihikisakiMainDTO torihikisakiMainDTO){
        var torihikisakiMain = BeanUtil.copyProperties(torihikisakiMainDTO, TorihikisakiMain.class);
        torihikisakiMainService.save(torihikisakiMain);
        return R.success();
        }

        @ApiOperation(value = "根据id删除")
        @DeleteMapping("/{id}")
        public R delete(@PathVariable("id") String id){
        torihikisakiMainService.removeById(id);
        return R.success();
        }

        @ApiOperation(value = "根据id修改")
        @PutMapping("/{id}")
        public R update(@PathVariable("id") String id, @RequestBody TorihikisakiMainDTO torihikisakiMainDTO){
        var torihikisakiMain = BeanUtil.copyProperties(torihikisakiMainDTO, TorihikisakiMain.class);
        torihikisakiMainService.updateById(torihikisakiMain);
        return R.success();
        }


        @ApiOperation(value = "条件查询")
        @PostMapping("/pageQuery")
        public R list(@RequestBody TorihikisakiMain torihikisakiMain){
        List<TorihikisakiMain> torihikisakiMainList = torihikisakiMainService.list(new QueryWrapper<>(torihikisakiMain));
        return R.success(torihikisakiMainList);
        }

        @ApiOperation(value = "查询所有")
        @GetMapping("")
        public R list() {
        var torihikisakiMainList = torihikisakiMainService.list(new QueryWrapper<>());
        var torihikisakiMainDTOList = BeanUtil.copyToList(torihikisakiMainList, TorihikisakiMainDTO.class);
        return R.success(torihikisakiMainDTOList);
        }

        @ApiOperation(value = "列表（分页）")
        @GetMapping("/list")
        public R list(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize){
        var page = torihikisakiMainService.page(new Page<>(pageNum, pageSize), null);
        return R.success(new PageResult<>(page.getTotal(),page.getRecords()));
        }

        @ApiOperation(value = "详情")
        @GetMapping("/{id}")
        public R get(@PathVariable("id") String id){
        var torihikisakiMain= torihikisakiMainService.getById(id);
        if ( torihikisakiMain  != null) {
        var torihikisakiMainDTO = BeanUtil.copyProperties(torihikisakiMain, TorihikisakiMainDTO.class);
        return R.success(torihikisakiMainDTO);
        }
        return R.fail(404,"找不到实体,id:"+ id);
        }
    }
