package com.example.blog.common;

import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@ApiModel(description = "返回相应信息")   //用于相应类上，表示一个返回相应数据的信息
public class Result {


    @ApiModelProperty(value = "是否成功" )
    @JsonView(View.Summary.class)
    private boolean success;
    @ApiModelProperty(value = "响应的编号")
    @JsonView(com.example.blog.common.View.Summary.class)
    private int code;

    @ApiModelProperty(value = "响应的信息说明")
    @JsonView(com.example.blog.common.View.Summary.class)
    private String  msg;

    @ApiModelProperty(value = "响应的附加对象")
    @JsonView(com.example.blog.common.View.SummaryWithDetail.class)
    private Object data;
}
