package com.bright.star.infrastructure.common;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(description = "分页数据")
public
class PageResult<T> {

    @Schema(description = "总数")
    private long total;

    @Schema(description = "当前页数据")
    private List<T> rows;

    @Schema(description = "当page")
    private long currentPage;

    @Schema(description = "总页数")
    private long totalPage;

    public PageResult(long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }
}