package com.bright.star.controller.tmp;

import com.bright.star.service.tmp.SyainMainService;
import com.bright.star.infrastructure.persistence.entity.SyainMain;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bright.star.infrastructure.common.PageResult;
import com.bright.star.infrastructure.common.result.R;
import com.bright.star.service.dto.SyainMainDTO;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.hutool.core.bean.BeanUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @since 2023-02-02
 */

@Slf4j
@Api(tags = "worker manage")
@RestController
@RequiredArgsConstructor
@RequestMapping("syainMainController")
public class SyainMainController {

    private final SyainMainService syainMainService;


    @ApiOperation(value = "新增")
    @PostMapping("")
    public R save(@RequestBody SyainMainDTO syainMainDTO) {
        var syainMain = BeanUtil.copyProperties(syainMainDTO, SyainMain.class);
        syainMainService.save(syainMain);
        return R.success();
    }

    @ApiOperation(value = "根据id删除")
    @DeleteMapping("/{id}")
    public R delete(@PathVariable("id") String id) {
        syainMainService.removeById(id);
        return R.success();
    }

    @ApiOperation(value = "根据id修改")
    @PutMapping("/{id}")
    public R update(@PathVariable("id") String id, @RequestBody SyainMainDTO syainMainDTO) {
        var syainMain = BeanUtil.copyProperties(syainMainDTO, SyainMain.class);
        syainMainService.updateById(syainMain);
        return R.success();
    }


    @ApiOperation(value = "条件查询")
    @PostMapping("/pageQuery")
    public R list(@RequestBody SyainMain syainMain) {
        List<SyainMain> syainMainList = syainMainService.list(new QueryWrapper<>(syainMain));
        return R.success(syainMainList);
    }

    @ApiOperation(value = "查询所有")
    @GetMapping("")
    public R list() {
        var syainMainList = syainMainService.list(new QueryWrapper<>());
        var syainMainDTOList = BeanUtil.copyToList(syainMainList, SyainMainDTO.class);
        return R.success(syainMainDTOList);
    }

    @ApiOperation(value = "列表（分页）")
    @GetMapping("/list")
    public R list(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize) {
        var page = syainMainService.page(new Page<>(pageNum, pageSize), null);
        return R.success(new PageResult<>(page.getTotal(), page.getRecords()));
    }

    @ApiOperation(value = "详情")
    @GetMapping("/{id}")
    public R get(@PathVariable("id") String id) {
        var syainMain = syainMainService.getById(id);
        if (syainMain != null) {
            var syainMainDTO = BeanUtil.copyProperties(syainMain, SyainMainDTO.class);
            return R.success(syainMainDTO);
        }
        return R.fail(404, "找不到实体,id:" + id);
    }
}
