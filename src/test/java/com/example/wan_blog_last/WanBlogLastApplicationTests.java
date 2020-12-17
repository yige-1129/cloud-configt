package com.example.wan_blog_last;

import com.example.wan_blog_last.entity.Editor;
import com.example.wan_blog_last.entity.ListContent;
import com.example.wan_blog_last.service.impl.EditorServiceImpl;
import com.example.wan_blog_last.service.impl.ListContentImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class WanBlogLastApplicationTests {
    @Autowired
    private EditorServiceImpl service;
    @Autowired
    private ListContentImpl listContent;
    @Test
    void contextLoads() {
        List<ListContent> listContents= listContent.getListContent(1);
        System.out.println(listContents);
//        Editor editor=service.queryContent("1");
//        System.out.println("查询出来的数据:"+editor);
//        System.out.println(editor.getContent());


    }



}
