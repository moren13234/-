package com.ithucl.controller;

import com.ithucl.domain.Account;
import com.ithucl.domain.User;
import com.ithucl.service.AccountService;
import com.ithucl.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

/*
* 账户web
* */
@Controller
@RequestMapping("/account")
public class AccountController {


        @Autowired
        private AccountService accountService;

        @RequestMapping("/findAll")
        public String  findAll(Model model,HttpServletRequest request) throws UnsupportedEncodingException {
            request.setCharacterEncoding("UTF-8");
            System.out.println("表现层：查询所有的账户信息....");
            //调用service的方法
            List<Account> list = accountService.findAll();
            model.addAttribute("list",list);
            return "list";
        }

        /*
        *
        * 保存用户
        * */
        @RequestMapping("/save")
        public void  save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
            accountService.saveAccount(account);
            response.sendRedirect(request.getContextPath()+"/account/findAll");
            return ;
        }


        /*
        * 保存学生信息
        *
        *
        * */
        @RequestMapping("/saveuser")
        public void  saveuser(User user, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
                System.out.println(user);
                accountService.saveUser(user);
            //编写请求转发的程序
            request.getRequestDispatcher("/account/findAll").forward(request, response);
                return ;
        }

        /*
        *
        * 删除学生信息
        *
        * */
        @RequestMapping(value = "/deleteuser")
        public void deleteuser( HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {

            Integer  userId =  Integer.parseInt(request.getParameter("id"));

            System.out.println("62362392932394"+userId);

            accountService.deleteUser(userId);
            //编写请求转发
            request.getRequestDispatcher("/account/findAlluser").forward(request,response);
            return;
        }

        /*
        * 查询全部的用户的信息
        * */
        @RequestMapping("/findAlluser")
        public String  findAlluser(Model model){
            System.out.println("表现层：查询所有的账户信息....");
            //调用service的方法
            List<User> list = accountService.findAllUser();
            model.addAttribute("dele",list);
            return "dele";
        }
        /*
        *
        * 修改用户的信息
        * */
        @RequestMapping(value = "/updateuser")
        public void updateuser(User user, HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {

            System.out.println("dsyagdjas"+user);
            System.out.println("645324523428yriryewyruiwiryiwyriw34727489237547325");

            accountService.updateUser(user);
            //编写请求转发
            request.getRequestDispatcher("/account/findAlluser").forward(request,response);

            return;
        }

        @RequestMapping(value = "/upda")
        public String upda(){
            return "upda";
        }

}
