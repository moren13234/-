package com.ithucl.service;

import com.ithucl.domain.Account;
import com.ithucl.domain.User;

import java.util.List;

public interface AccountService {


    //查询所有账户信息
    public List<Account> findAll();

    //保存账户信息
    public void saveAccount(Account account);

    public void saveUser(User user);

    //删除用户信息
    public void deleteUser(Integer userId);

    //查询所有的用户信息
    public List<User> findAllUser();

    //修改用户的信息
    public void updateUser(User user);
}
