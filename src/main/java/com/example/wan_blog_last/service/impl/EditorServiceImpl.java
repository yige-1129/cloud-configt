package com.example.wan_blog_last.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.UpdateChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.wan_blog_last.entity.Editor;

import com.example.wan_blog_last.mapper.EditorMapper;
import com.example.wan_blog_last.service.IEditorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class EditorServiceImpl extends ServiceImpl<EditorMapper,Editor> implements IEditorService{
    @Autowired
    private EditorMapper editorMapper;
    @Override
    public boolean insertContent(Editor editor) {
        return editorMapper.insertContent(editor);
    }

    @Override
    public Editor queryContent(String id) {
        //return new Editor("sss","asdasdad");
        return editorMapper.queryContent(id);
    }


}

