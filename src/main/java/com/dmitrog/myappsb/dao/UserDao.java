package com.dmitrog.myappsb.dao;



import com.dmitrog.myappsb.entity.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    List<User> getAllUsers();

    public User getUserById(int id);

    void deleteUserById(int id);

    public void updateUser(int Id, String name, String lastName, String country, int age);
    public void updateUser(User user);
}
