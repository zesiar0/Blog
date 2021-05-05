package com.springboot.blog.service;

import com.springboot.blog.entity.Blog;
import com.springboot.blog.queryvo.BlogQuery;
import com.springboot.blog.queryvo.BlogSearch;
import com.springboot.blog.queryvo.BlogShow;

import java.util.List;

public interface BlogService {
    //保存新增博客
    int saveBlog(Blog blog);

    //查询文章管理列表
    List<BlogQuery> getAllBlog();

    //删除博客
    void deleteBlog(Long id);

    //查询编辑修改的文章
    BlogShow getBlogById(Long id);

    //编辑修改文章
    int updateBlog(BlogShow blogShow);

    //搜索博客管理列表
    List<BlogQuery> getBlogBySearch(BlogSearch blogSearch);
}
