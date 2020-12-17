package com.example.wan_blog_last.entity;
//放在了userMapper里面操作了
public class ListContent {
    private String title;
    private String content;
    private String time;

    public ListContent(String title,String content,String time){
        this.title=title;
        this.content=content;
        this.time=time;
    }

    public ListContent(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "ListContent{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
