package com.xxx.project.entity.response.request;

import com.xxx.project.util.BasePage;
import lombok.Data;

@Data
public class ListedCompanyRequest extends BasePage {

    private Integer id;
    private String companyName;
    private String remark;
}
