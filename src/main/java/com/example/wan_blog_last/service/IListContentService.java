package com.example.wan_blog_last.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.wan_blog_last.entity.ListContent;

import java.util.List;

public interface IListContentService extends IService<ListContent> {
    public List<ListContent> getListContent(int page);
    public boolean insertListContent(ListContent listContent);
}
