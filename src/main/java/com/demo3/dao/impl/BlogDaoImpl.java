package com.demo3.dao.impl;

import com.demo3.dao.BlogDao;
import com.demo3.mapper.BlogMapper;
import com.demo3.mapper.UserMapper;
import com.demo3.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by lichangjie on 03/12/2015.
 */
@Repository("BlogDao")
public class BlogDaoImpl implements BlogDao{
    @Autowired
    private BlogMapper blogMapper;

    @Override
    public List<Blog> dynamicIfTest1(Blog blog) {
        return blogMapper.dynamicIfTest1(blog);
    }

    @Override
    public List<Blog> dynamicChooseTest(Blog blog) {
        return blogMapper.dynamicChooseTest(blog);
    }

    @Override
    public List<Blog> dynamicWhereTest(Blog blog) {
        System.out.println("blog in impl");
        return blogMapper.dynamicWhereTest(blog);
    }

    @Override
    public List<Blog> dynamicForeachTest(List<Integer> ids) {
        return blogMapper.dynamicForeachTest(ids);
    }

    @Override
    public List<Blog> dynamicForeach3Test(Map<String, Object> params) {
        return blogMapper.dynamicForeach3Test(params);
    }
}
