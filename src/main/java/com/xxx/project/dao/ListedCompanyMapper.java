package com.xxx.project.dao;

import com.alibaba.fastjson2.JSONArray;
import com.xxx.project.entity.response.ListedCompanyResponse;
import com.xxx.project.entity.response.request.ListedCompanyRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ListedCompanyMapper {


    List<ListedCompanyResponse> getCompanyList(ListedCompanyRequest request);

    int addCompany(ListedCompanyRequest request);
}
