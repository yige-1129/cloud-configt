package com.example.wan_blog_last.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.wan_blog_last.entity.Editor;


public interface IEditorService extends IService<Editor> {
    public boolean insertContent(Editor editor);
    public Editor queryContent(String id);
}
