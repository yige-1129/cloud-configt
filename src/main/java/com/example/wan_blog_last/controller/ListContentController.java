package com.example.wan_blog_last.controller;

import com.example.wan_blog_last.entity.Editor;
import com.example.wan_blog_last.entity.ListContent;
import com.example.wan_blog_last.service.impl.EditorServiceImpl;
import com.example.wan_blog_last.service.impl.ListContentImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/index")
public class ListContentController {
    @Autowired
    private ListContentImpl listContent;
    @RequestMapping("/getContent")
    public Map<String,Object> getListContent(HttpServletRequest request){
        int page= Integer.parseInt(request.getParameter("page"));
        List<ListContent> listContents= listContent.getListContent(page);
        Map<String,Object> map=new HashMap<String,Object>();
        if (listContents!=null){
            map.put("code",200);
            map.put("msg","添加成功");
            map.put("listContent",listContents);
        }else {
            map.put("code",500);
            map.put("msg","添加失败");
            map.put("listContent",null);
        }
        return map;
    }
}
