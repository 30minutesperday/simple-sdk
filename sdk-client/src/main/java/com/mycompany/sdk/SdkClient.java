package com.mycompany.sdk;

public class SdkClient {

    private final SdkFeignClient sdkFeignClient;

    public SdkClient(SdkFeignClient feignClient) {
        this.sdkFeignClient = feignClient;
    }

    public String getPosts() {
        return sdkFeignClient.getPosts();
    }

}
