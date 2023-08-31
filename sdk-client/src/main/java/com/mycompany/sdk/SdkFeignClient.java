package com.mycompany.sdk;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.cloud.openfeign.FeignClient(
        name="${com.mycompany.sdk.name}",
        url = "${com.mycompany.sdk.url}",
        path="${com.mycompany.sdk.path}"
)
public interface SdkFeignClient {

    @GetMapping
    public String getPosts();
}
