package com.demo3.mapper;

import com.demo3.model.Blog;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by lichangjie on 03/12/2015.
 */
public interface BlogMapper {
    public List<Blog> dynamicIfTest1(Blog blog);
    public List<Blog> dynamicChooseTest(Blog blog);
    public List<Blog> dynamicWhereTest(Blog blog);
    public List<Blog> dynamicForeachTest(List<Integer> ids);
    public List<Blog> dynamicForeach3Test(Map<String, Object> params);
}
