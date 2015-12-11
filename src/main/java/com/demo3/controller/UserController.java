package com.demo3.controller;

import com.demo3.dao.UserDao;
import com.demo3.model.Blog;
import com.demo3.model.User;
import com.demo3.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by lichangjie on 01/12/2015.
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/register")
    public String index() {
        return "/register";
    }

    @RequestMapping(value = "/login")
    public String login() {
        return "/login";
    }

    @RequestMapping(value = "/delete")
    public String delete() {
        return "/delete";
    }

    @RequestMapping(value = "/test")
    public String test() {
        return "/testConverter";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(HttpServletRequest request) {
//        ApplicationContext ctx=null;
//        ctx=new ClassPathXmlApplicationContext("config/applicationContext.xml");
//        UserDao userDao=(UserDao) ctx.getBean("userDao");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User u = new User();
        System.out.println(username);
        u.setUsername(username);
        u.setPassword(password);
        userService.addUser(u);
        return "success";
    }

    @RequestMapping(value = "/getUser")
    public ModelAndView getUser(Model model, HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        User u = new User();
        u.setUsername(request.getParameter("username"));
        u.setPassword(request.getParameter("password"));
        userService.getUser(u);
        model.addAttribute("user",userService.getUser(u));
        modelAndView.setViewName("listUser");
        return modelAndView;
    }

    @RequestMapping(value = "/deleteUser")
    public String deleteUser() {
        userService.deleteUser(12);
        return "success";
    }

    @RequestMapping(value = "/showMessage")
    public @ResponseBody String showMessage(@RequestParam(value = "name",defaultValue = "guest") String name){
        return "Read string'" + name + "'";
    }
//    @Resource(name = "userService")
//    private UserService userService;
//
//    @RequestMapping(value = "/getUser")
//    public ModelAndView getUser(Model model) {
//        ModelAndView modelAndView = new ModelAndView();
//        System.out.println(userService.selectAll().size());
//        model.addAttribute("user", userService.selectAll());
//        modelAndView.setViewName("listUser");
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/checkUser")
//    public String checkUser(HttpServletRequest request) {
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        //userService.
//        return "helli";
//    }

//    @RequestMapping("/addUser")
//    public String addUser(HttpServletRequest request) {
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        User u = new User();
//        u.setUsername(username);
//        u.getPassword(password);
//        userService.addUser(u);
//        return "success";
//    }
//


    public static void main(String[] args) {
        ApplicationContext ctx;
        ctx=new ClassPathXmlApplicationContext("config/applicationContext.xml");
        UserDao userDao=(UserDao) ctx.getBean("userDao");

//        //添加两条数据
//        user.setId(5);
//        user.setUsername("Jessica");
//        user.setPassword("123");
//        userDao.addUser(user);
//        user.setId(6);
//        user.setUsername("Jessica2");
//        user.setPassword("123");
//        userDao.addUser(user);
//        System.out.println("添加成功");
//        //查询数据
//        user.setUsername("Jessica");
//        user.setPassword("123");
//        System.out.println(userDao.getUser(user).toString());
//        user.setUsername("Jessica2");
//        user.setPassword("123");
//        System.out.println(userDao.getUser(user).toString());
//        //修改数据
//        user.setId(2);
//        user.setPassword("802");
//        userDao.updateUser(user);
//        System.out.println("修改成功");
//        //删除数据
//        userDao.deleteUser(1);
//        System.out.println("删除成功");

    }
}