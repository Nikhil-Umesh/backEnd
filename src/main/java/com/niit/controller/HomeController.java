
package com.niit.controller;

import com.niit.dao.UserDao;
import com.niit.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 *
 * @author nikhi
 */
@Controller
public class HomeController {
    
    @Autowired
    UserDao userDao;
    
    @Autowired
    User user;
    
    @RequestMapping("/test")
    public String getMesage(){
    return "test";
    }
    @RequestMapping("/register")
    public String register(Model m){
        m.addAttribute("cmd", new User());
        return "register";
    }
    @RequestMapping("/login")
    public String login(Model m){
        return "login";
    }
    @RequestMapping("/index")
    public String Index(Model m){
        return "index";
    }
    @RequestMapping(value = "/save" ,method = RequestMethod.POST)
    public String save(@ModelAttribute("cmd") User user){
        userDao.save(user);
    return "test";
    }
}
