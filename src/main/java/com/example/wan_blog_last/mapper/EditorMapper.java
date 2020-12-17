package com.example.wan_blog_last.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.wan_blog_last.entity.Editor;
import com.example.wan_blog_last.entity.Role;
import org.apache.ibatis.annotations.Mapper;


public interface EditorMapper extends BaseMapper<Editor> {
    public boolean insertContent(Editor editor);
    public Editor queryContent(String id);
}
