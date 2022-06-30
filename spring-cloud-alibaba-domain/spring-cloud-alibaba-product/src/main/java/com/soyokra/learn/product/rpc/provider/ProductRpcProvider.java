package com.soyokra.learn.product.rpc.provider;

import com.soyokra.learn.kernel.support.rpc.ProductRpcContract;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class ProductRpcProvider implements ProductRpcContract {
    @Override
    public String info(String tags) {
        return "order tags: " + tags;
    }

    @Override
    public String getProductId() {
        return "this tis order id";
    }
}
