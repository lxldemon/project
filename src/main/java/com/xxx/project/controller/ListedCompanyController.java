package com.xxx.project.controller;

import com.alibaba.fastjson2.JSONArray;
import com.xxx.project.entity.response.request.ListedCompanyRequest;
import com.xxx.project.service.ListedCompanyService;
import com.xxx.project.util.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/listed_company")
public class ListedCompanyController {

    @Resource
    private ListedCompanyService listedCompanyService;

    @GetMapping("/list")
    public R<?> list(ListedCompanyRequest request){
        return R.ok(listedCompanyService.getCompanyList(request));
    }

    @GetMapping("/add")
    public R<?> add(ListedCompanyRequest request){
        listedCompanyService.addCompany(request);
        return R.success();
    }

}
