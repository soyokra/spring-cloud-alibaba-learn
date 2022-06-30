package com.soyokra.learn.order.api.controller;

import com.soyokra.learn.kernel.support.rpc.ProductRpcContract;
import com.soyokra.learn.kernel.support.utils.ResponseUtils;
import com.soyokra.learn.order.api.controller.response.product.ProductResponse;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/api")
@RestController
public class OrderController {
    @DubboReference
    ProductRpcContract productRpcContract;

    @GetMapping(value = "select-product")
    public @ResponseBody
    ResponseUtils<ProductResponse> selectProduct() {
        ProductResponse productResponse = new ProductResponse();
        productResponse.setProductId(productRpcContract.getProductId());
        return ResponseUtils.success(productResponse);
    }
}
