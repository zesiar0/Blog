package com.springboot.blog.dao;

import com.springboot.blog.entity.Blog;
import com.springboot.blog.queryvo.BlogQuery;
import com.springboot.blog.queryvo.BlogSearch;
import com.springboot.blog.queryvo.BlogShow;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BlogDao {
    //保存新增博客
    int saveBlog(Blog blog);

    //查询文章管理列表
    List<BlogQuery> getAllBlogQuery();

    //删除博客
    void deleteBlog(Long id);

    //编辑博客
    int updateBlog(BlogShow blogShow);

    //查询编辑修改的文章
    BlogShow getBlogById(Long id);

    //搜索博客管理列表
    List<BlogQuery> searchByTileAndType(BlogSearch blogSearch);
}
