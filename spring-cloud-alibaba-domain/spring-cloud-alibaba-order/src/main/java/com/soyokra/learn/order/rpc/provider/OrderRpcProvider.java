package com.soyokra.learn.order.rpc.provider;

import com.soyokra.learn.call.rpc.OrderRpcContract;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class OrderRpcProvider implements OrderRpcContract {
    @Override
    public String info(String tags) {
        return "order tags: " + tags;
    }
}
