package com.xxx.project.controller;

import com.xxx.project.entity.SysUser;
import com.xxx.project.entity.response.request.SysUserRequest;
import com.xxx.project.service.SysUserService;
import com.xxx.project.util.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/sysuser")
public class SysUserController {

    @Resource
    private SysUserService sysUserServicel;

    @GetMapping("/list")
    public R<?> list(SysUserRequest request){
        return R.ok(sysUserServicel.getList(request));
    }

    @PostMapping("/add")
    public R<?> add(SysUser sysUser){
        return R.ok(sysUserServicel.add(sysUser));
    }
    @PostMapping("/add1")
    public R<?> add1(@RequestBody SysUser sysUser){
        return R.ok(sysUserServicel.add(sysUser));
    }

    @PostMapping("/delete")
    public R<?> delete(@RequestBody SysUser sysUser){
        //sysUserServicel.delete(sysUser)
        return R.ok(1);
    }
}
