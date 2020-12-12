package com.example.study.controller;

import com.example.study.Model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {
    //HTML <Form>
    //ajax 검색
    //http post body->data
    //json,xml,multipart-form,text plain 등등 다양한 형식 가능

    @RequestMapping(value = "/postMethod")  //http://localhost:8080/api/postMethod
    public SearchParam postMethod(@RequestBody SearchParam searchParam){
        return searchParam;
    }
}
