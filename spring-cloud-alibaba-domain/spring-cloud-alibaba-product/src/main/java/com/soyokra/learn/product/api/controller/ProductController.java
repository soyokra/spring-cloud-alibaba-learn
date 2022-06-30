package com.soyokra.learn.product.api.controller;

import com.soyokra.learn.kernel.support.rpc.OrderRpcContract;
import com.soyokra.learn.kernel.support.utils.ResponseUtils;
import com.soyokra.learn.product.api.controller.response.product.OrderResponse;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/api")
@RestController
public class ProductController {

    @DubboReference
    OrderRpcContract orderRpcContract;

    @GetMapping(value = "select-order")
    public @ResponseBody
    ResponseUtils<OrderResponse> selectOrder() {
        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setOrderId(orderRpcContract.getOrderId());
        return ResponseUtils.success(orderResponse);
    }
}
