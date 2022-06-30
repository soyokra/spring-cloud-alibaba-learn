package com.soyokra.learn.product.rpc.provider;

import com.soyokra.learn.product.rpc.provider.contract.ProductRpcContract;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class ProductRpcProvider implements ProductRpcContract {
    @Override
    public String info(String tags) {
        return "product tags: " + tags;
    }
}
