package com.mycompany.sdk;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@AutoConfiguration
@PropertySource("classpath:sdk.properties")
@EnableFeignClients
public class SdkConfig {

    @Bean
    @ConditionalOnMissingBean
    public SdkClient sdkClient(SdkFeignClient feignClient) {
        return new SdkClient(feignClient);
    }
}
