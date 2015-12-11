/**
 * Created by lichangjie on 01/12/2015.
 */

import com.demo3.dao.UserDao;
import com.demo3.service.impl.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo3.model.User;
import com.demo3.service.UserService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

public class UserTest {

    private UserService userService = new UserServiceImpl();

    @Before
    public void before(){
        ApplicationContext ctx=null;
        ctx=new ClassPathXmlApplicationContext("config/applicationContext.xml");
        UserDao userDao=(UserDao) ctx.getBean("userDao");
    }
    @Test
    public void addUser(){
        User u = new User();
        u.setUsername("hi");
        u.setPassword("hi");
        userService.addUser(u);
        System.out.println("success");
    }
}