package com.thinkgem.jeesite.modules.memp.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "PayController", tags = "xxx")
@RestController
@RequestMapping(value = "/pay/")
public class PayController {

    @ApiOperation("wx/get")
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String get(@RequestParam String name) {
        return "my name is " + name;
    }
}
