package com.xxx.project.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xxx.project.dao.ListedCompanyMapper;
import com.xxx.project.dao.SysUserCompanyMapper;
import com.xxx.project.entity.SysUser;
import com.xxx.project.entity.response.ListedCompanyResponse;
import com.xxx.project.entity.response.SysUserResponse;
import com.xxx.project.entity.response.request.SysUserRequest;
import com.xxx.project.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserCompanyMapper mapper;

    @Override
    public PageInfo getList(SysUserRequest request) {
        PageHelper.startPage(request.getPageNum(),request.getPageSize());//开启设置分页
        List<SysUserResponse> ls = mapper.getList(request);
        PageInfo pageInfo = new PageInfo(ls);
        return pageInfo;
    }

    @Override
    public int add(SysUser sysUser) {
        return mapper.add(sysUser);
    }
}
