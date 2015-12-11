package com.demo3.mapper;

import com.demo3.dao.BlogDao;
import com.demo3.dao.UserDao;
import com.demo3.model.Blog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lichangjie on 03/12/2015.
 */
public class BlogTest {
    public static void main(String[] args){
        ApplicationContext ctx;
        ctx=new ClassPathXmlApplicationContext("config/applicationContext.xml");
        BlogDao blogDao=(BlogDao) ctx.getBean("blogDao");
        Blog blog = new Blog();
        blog.setTitle("z");
        blog.setContent("w");
        blog.setOwner("k");
        final List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        ids.add(6);
        ids.add(7);
        ids.add(9);
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("ids", ids);
        params.put("title", "q");
        List<Blog> blogs = blogDao.dynamicForeach3Test(params);
        if(blogs.isEmpty()){
            System.out.println("is empty");
        }else {
            for(Blog blog1 : blogs){
                System.out.println(blog1.toString());
            }
        }
    }
}
