package com.example.wan_blog_last.controller;

import com.example.wan_blog_last.entity.Editor;
import com.example.wan_blog_last.service.impl.EditorServiceImpl;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
public class EditorController {
    @Autowired
    private EditorServiceImpl service;
    @RequestMapping("/content")
    public Map<String,Object> InsertContent(HttpServletRequest request){
        String content=request.getParameter("content");
        boolean flag=false;
        if(content!=null){
            flag=service.insertContent(new Editor("4",content));
        }
        System.out.println("内容："+content);
        Map<String,Object> map=new HashMap<String,Object>();
        if (!flag){
            map.put("code",500);
            map.put("msg","添加失败");
        }else {
            map.put("code",200);
            map.put("msg","添加成功");
        }
        return map;
    }
    @RequestMapping("/getContent")
    public Editor getContent(HttpServletRequest request){
        String id= request.getParameter("id");
        Editor editor=service.queryContent(id);
        return editor;
    }
}
