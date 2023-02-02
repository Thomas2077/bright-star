package com.bright.star.common.config;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @description:
 * @author: zyj
 * @time: 20210601
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ApiModel("分页数据")
public class PageResult<T>{

    @ApiModelProperty("总数")
    private long total;

    @ApiModelProperty("当前页数据")
    private List<T> rows;

    @ApiModelProperty("当page")
    private long currentPage;

    @ApiModelProperty("总页数")
    private long totalPage;

    public PageResult (long total, List<T> rows ){
        this.total = total;
        this.rows = rows;
    }
}