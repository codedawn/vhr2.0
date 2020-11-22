package com.codedawn.webservice.controller;


import com.codedawn.webservice.entity.Hr;
import com.codedawn.webservice.service.HrService;
import com.codedawn.webservice.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author codedawn
 * @since 2020-11-22
 */
@Api
@RestController
@RequestMapping("/webservice")
public class HrController {

    @Autowired
    private HrService hrService;


    @ApiOperation("获取所有hr")
    @ResponseBody
    @GetMapping("/hr")
    public R getHr(){
        List<Hr> hrs = hrService.list(null);
        return R.ok().data("list",hrs);
    }

}

