package com.springboot.blog.service.Impl;

import com.springboot.blog.dao.BlogDao;
import com.springboot.blog.entity.Blog;
import com.springboot.blog.queryvo.BlogQuery;
import com.springboot.blog.queryvo.BlogSearch;
import com.springboot.blog.queryvo.BlogShow;
import com.springboot.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogDao blogDao;

    //保存新增博客
    @Override
    public int saveBlog(Blog blog) {
        blog.setCreateTime(new Date());
        blog.setUpdateTime(new Date());
        blog.setViews(0);
        return blogDao.saveBlog(blog);
    }

    //查询文章管理列表
    @Override
    public List<BlogQuery> getAllBlog() {
        return blogDao.getAllBlogQuery();
    }

    //删除博客
    @Override
    public void deleteBlog(Long id) {
        blogDao.deleteBlog(id);
    }

    //查询编辑修改的文章
    @Override
    public BlogShow getBlogById(Long id) {
        return blogDao.getBlogById(id);
    }

    //编辑修改文章
    @Override
    public int updateBlog(BlogShow blogShow) {
        blogShow.setUpdateTime(new Date());
        return blogDao.updateBlog(blogShow);
    }

    //搜索博客管理列表
    @Override
    public List<BlogQuery> getBlogBySearch(BlogSearch blogSearch) {
        return blogDao.searchByTileAndType(blogSearch);
    }
}
