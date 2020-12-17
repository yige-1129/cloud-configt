package com.example.wan_blog_last.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.wan_blog_last.entity.ListContent;
import com.example.wan_blog_last.mapper.ListContentMapper;
import com.example.wan_blog_last.service.IListContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ListContentImpl extends ServiceImpl<ListContentMapper, ListContent> implements IListContentService {
    @Autowired
    private ListContentMapper listContentMapper;
    @Override
    public List<ListContent> getListContent(int page) {
        List<ListContent> listContents=listContentMapper.getListContent(page);
        return listContents;
    }

    @Override
    public boolean insertListContent(ListContent listContent) {
        return false;
    }
}
