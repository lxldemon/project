package com.xxx.project.controller;

import com.xxx.project.entity.response.request.ListedCompanyRequest;
import com.xxx.project.util.R;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AController {

    @PostMapping("/list")
    public R<?> list(ListedCompanyRequest request){
        return R.ok("222");
    }



}
