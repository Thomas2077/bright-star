package com.bright.star.domain.worker;

import com.bright.star.infrastructure.domain.EntityObject;
import com.bright.star.service.dto.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
public class Employee implements EntityObject<Employee> {

    @Override
    public boolean sameValueAs(Employee other) {
        return false;
    }

    private SyainKeihiDTO syainKeihiDTO;

    private List<SyainKeirekiDTO> syainKeirekiDTOList;

    private List<SyainKoutsuhiDTO> syainKoutsuhiDtoList;

    private List<SyainKyuyoDTO> syainKyuyoDTOList;

    private List<SyainKeihiDTO> syainKeihiDTOList;

    private List<SyainRirekiDTO> syainRirekiDTOList;


}