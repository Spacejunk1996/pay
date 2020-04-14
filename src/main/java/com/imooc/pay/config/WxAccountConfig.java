package com.imooc.pay.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Zixu Jiang
 * @date 4/10/20 1:02 PM
 */
@Component
@ConfigurationProperties(prefix = "wx")
@Data
public class WxAccountConfig {

    private String appId;

    private String mchiId;

    private String mchKey;

    private String notifyUrl;

    private String returnUrl;
}
