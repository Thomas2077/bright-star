package com.bright.star.controller.tmp;

import com.bright.star.service.tmp.TgSettingService;
import com.bright.star.infrastructure.persistence.entity.TgSetting;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bright.star.infrastructure.common.PageResult;
import com.bright.star.infrastructure.common.result.R;
import com.bright.star.service.dto.TgSettingDTO;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.hutool.core.bean.BeanUtil;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
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
@Api(tags = "")
@RestController
@RequestMapping("/tgSetting")
public class TgSettingController {

    private final TgSettingService tgSettingService;

    public TgSettingController(TgSettingService tgSettingService) {
        this.tgSettingService = tgSettingService;
    }


    @ApiOperation(value = "新增")
    @PostMapping("")
    public R save(@RequestBody TgSettingDTO tgSettingDTO) {
        var tgSetting = BeanUtil.copyProperties(tgSettingDTO, TgSetting.class);
        tgSettingService.save(tgSetting);
        return R.success();
    }

    @ApiOperation(value = "根据id删除")
    @DeleteMapping("/{id}")
    public R delete(@PathVariable("id") String id) {
        tgSettingService.removeById(id);
        return R.success();
    }

    @ApiOperation(value = "根据id修改")
    @PutMapping("/{id}")
    public R update(@PathVariable("id") String id, @RequestBody TgSettingDTO tgSettingDTO) {
        var tgSetting = BeanUtil.copyProperties(tgSettingDTO, TgSetting.class);
        tgSettingService.updateById(tgSetting);
        return R.success();
    }


    @ApiOperation(value = "条件查询")
    @PostMapping("/pageQuery")
    public R list(@RequestBody TgSetting tgSetting) {
        List<TgSetting> tgSettingList = tgSettingService.list(new QueryWrapper<>(tgSetting));
        return R.success(tgSettingList);
    }

    @ApiOperation(value = "查询所有")
    @GetMapping("")
    public R list() {
        var tgSettingList = tgSettingService.list(new QueryWrapper<>());
        var tgSettingDTOList = BeanUtil.copyToList(tgSettingList, TgSettingDTO.class);
        return R.success(tgSettingDTOList);
    }

    @ApiOperation(value = "列表（分页）")
    @GetMapping("/list")
    public R list(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize) {
        var page = tgSettingService.page(new Page<>(pageNum, pageSize), null);
        return R.success(new PageResult<>(page.getTotal(), page.getRecords()));
    }

    @ApiOperation(value = "详情")
    @GetMapping("/{id}")
    public R get(@PathVariable("id") String id) {
        var tgSetting = tgSettingService.getById(id);
        if (tgSetting != null) {
            var tgSettingDTO = BeanUtil.copyProperties(tgSetting, TgSettingDTO.class);
            return R.success(tgSettingDTO);
        }
        return R.fail(404, "找不到实体,id:" + id);
    }
}
