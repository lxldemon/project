package com.xxx.project.service.impl;

import com.alibaba.fastjson2.JSONArray;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xxx.project.dao.ListedCompanyMapper;
import com.xxx.project.entity.response.ListedCompanyResponse;
import com.xxx.project.entity.response.request.ListedCompanyRequest;
import com.xxx.project.service.ListedCompanyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ListedCompanyServiceImpl implements ListedCompanyService {
    @Resource
    private ListedCompanyMapper mapper;
    @Override
    public PageInfo getCompanyList(ListedCompanyRequest request) {
        PageHelper.startPage(request.getPageNum(),request.getPageSize());//开启设置分页
        List<ListedCompanyResponse> ls = mapper.getCompanyList(request);
        PageInfo pageInfo = new PageInfo(ls);
        return pageInfo;
    }

    @Override
    public int addCompany(ListedCompanyRequest request) {
        return mapper.addCompany(request);
    }
}
