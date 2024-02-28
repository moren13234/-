package com.ithucl.service.impl;

import com.ithucl.dao.AccountDao;
import com.ithucl.domain.Account;
import com.ithucl.domain.User;
import com.ithucl.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层，查询所有的账户信息.....");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务成，保存账户....");
        accountDao.saveAccount(account);
    }

    @Override
    public void saveUser(User user) {
        accountDao.saveUser(user);
    }

    @Override
    public void deleteUser(Integer userId) {
        accountDao.deleteUser(userId);
    }

    @Override
    public List<User> findAllUser() {
        System.out.println("查询所有的用户信息");
        return accountDao.findAllUser();
    }

    @Override
    public void updateUser(User user) {
        System.out.println("修改用户的信息");
        accountDao.updateUser(user);
    }


}
