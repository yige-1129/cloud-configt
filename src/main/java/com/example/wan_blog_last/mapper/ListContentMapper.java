package com.example.wan_blog_last.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.wan_blog_last.entity.ListContent;

import java.util.List;

public interface ListContentMapper extends BaseMapper<ListContent> {
    public List<ListContent> getListContent(int page);
    public boolean insertListContent(ListContent listContent);
}
