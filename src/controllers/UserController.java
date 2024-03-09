package controllers;

import models.User;
import models.UserDao;
import models.UserDaoImp;

import java.util.List;

public class UserController {
    public static final UserDao userDao = new UserDaoImp();
    public  List<User> userList(){
        return userDao.getAllUser();
    }
    public List<User> userListToList(){
        return userDao.getAllUserToList();
    }
    public void addUser(User user){
        userDao.addUser(user);
    }
    public User searchUser(){
        return userDao.searchUser();
    }
    public void updateUser(List<User> users){
        userDao.updateUser(users);
    }
    public void setUserVerified(List<User> user){
        userDao.setUserVerified(user);
    }
    public void deleteUser(List<User> users){
        userDao.deleteUser(users);
    }

}