package com.imooc.pay.service.impl;

import com.imooc.pay.PayApplicationTests;
import com.imooc.pay.service.IPayService;
import com.lly835.bestpay.enums.BestPayTypeEnum;
import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

/**
 * @author Zixu Jiang
 * @date 2/16/20 12:43 AM
 */


public class PayServiceImplTest extends PayApplicationTests {

    @Autowired
    private IPayService payService;

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void create() {
        payService.create("1996080990", BigDecimal.valueOf(0.01), BestPayTypeEnum.WXPAY_NATIVE);
    }
}