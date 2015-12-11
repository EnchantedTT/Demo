package com.demo3.controller;

import com.demo3.model.Blog;
import com.demo3.model.Client;
import com.demo3.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lichangjie on 03/12/2015.
 */
@Controller
public class TestController {

    @RequestMapping(value = "/convert", headers = "Accept=application/x-y" )
    public @ResponseBody User convert(@RequestBody User user) {
        return user;
    }

    @RequestMapping(value = "/convert2")
    public @ResponseBody Blog convert2(@RequestBody Blog blog) {
        return blog;
    }


    @RequestMapping(value = "/getC", method = {RequestMethod.POST})
    public Client getClient() throws Exception {
        Client client = new Client();
        client.setIds(12312312);
        client.setMessage("asadasdsadasd");
        client.setPrice(12312.22f);
        client.setTime(321312321);
        return client;
    }

}
