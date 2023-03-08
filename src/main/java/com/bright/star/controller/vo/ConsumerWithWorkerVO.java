package com.bright.star.controller.vo;

import com.bright.star.service.dto.TorihikisakiMainDTO;
import com.bright.star.service.dto.TorihikisakiTantouDTO;
import lombok.Data;

import java.util.List;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/3/5
 * @description
 **/
@Data
public class ConsumerWithWorkerVO {

    private TorihikisakiMainDTO consumer;

    private List<TorihikisakiTantouDTO> consumerTantouList;

    public ConsumerWithWorkerVO(TorihikisakiMainDTO torihikisakiMainDTO, List<TorihikisakiTantouDTO> torihikisakiTantouDTOList) {
        consumer = torihikisakiMainDTO;
        consumerTantouList = torihikisakiTantouDTOList;
    }
}
