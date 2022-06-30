package com.soyokra.learn.product.api.controller;


import com.soyokra.learn.kernel.support.utils.ResponseUtils;
import com.soyokra.learn.product.api.controller.response.home.InfoResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(value = "/api")
@RestController
public class HomeController {

    @GetMapping(value = "info")
    public @ResponseBody
    ResponseUtils<InfoResponse> info() {
        InfoResponse infoResponse = new InfoResponse();
        return ResponseUtils.success(infoResponse);
    }

}
