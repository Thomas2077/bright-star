package com.bright.star.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 27/03/2023
 * @description
 **/
public class DemoTest {
    @Mock
    private ConsumerAppService consumerAppService;

    @DisplayName("Single test successful")
    @Test
    void testSingleSuccessTest() {
    }

    @Test
    @Disabled("Not implemented yet")
    void testShowSomething() {
//        consumerAppService.saveCustomer();
    }
}
