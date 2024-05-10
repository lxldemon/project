package com.xxx.project.service;

import com.github.pagehelper.PageInfo;
import com.xxx.project.entity.SysUser;
import com.xxx.project.entity.response.request.SysUserRequest;

public interface SysUserService {
    PageInfo getList(SysUserRequest request);

    int add(SysUser sysUser);
}
