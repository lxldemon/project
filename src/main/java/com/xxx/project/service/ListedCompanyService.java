package com.xxx.project.service;

import com.alibaba.fastjson2.JSONArray;
import com.github.pagehelper.PageInfo;
import com.xxx.project.entity.response.ListedCompanyResponse;
import com.xxx.project.entity.response.request.ListedCompanyRequest;

import java.util.List;

public interface ListedCompanyService {

    PageInfo getCompanyList(ListedCompanyRequest request);

    int addCompany(ListedCompanyRequest request);
}
