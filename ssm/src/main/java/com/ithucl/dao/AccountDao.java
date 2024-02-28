package com.ithucl.dao;

import com.ithucl.domain.Account;
import com.ithucl.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * 账户dao接口
 */


public interface AccountDao {

    //查询所有账户信息
    //   @Select("select * from account")
    public List<Account> findAll();

    //保存账户信息
    @Insert("insert into account (name,money) values (#{name},#{money})")
    public void saveAccount(Account account);

    //添加学生信息
    @Insert("insert into user (id,name,career) values (#{id},#{name},#{career})")
    public void saveUser(User user);

    //删除信息
    @Delete("delete from user where id=(#{userId})")
    public void deleteUser(Integer userId);

    //查询所有用户信息
    @Select("select * from user")
    public List<User> findAllUser();


    //修改用户信息
    @Update("update user set name = #{name},career = #{career} where id = #{id}")
    public void updateUser(User user);


}
