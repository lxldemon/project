package com.xxx.project.dao;

import com.xxx.project.entity.SysUser;
import com.xxx.project.entity.response.SysUserResponse;
import com.xxx.project.entity.response.request.SysUserRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysUserCompanyMapper {

    List<SysUserResponse> getList(SysUserRequest request);

    int add(SysUser sysUser);
}
