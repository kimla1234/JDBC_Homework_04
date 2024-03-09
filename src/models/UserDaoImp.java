package models;

import repositorys.UserRepository;

import java.util.List;

public class UserDaoImp implements UserDao {
    @Override
    public List<User> getAllUserToList() {
        return UserRepository.getAllUserToList();
    }

    @Override
    public List<User> getAllUser() {
        return UserRepository.getAllUsers();
    }

    @Override
    public void addUser(User user) {
        UserRepository.addUser(user);
    }

    @Override
    public User searchUser() {
        return UserRepository.searchUser();
    }

    @Override
    public void updateUser(List<User> users) {
        UserRepository.updateUser(users);
    }

    @Override
    public void setUserVerified(List<User> user) {
        UserRepository.setVerifyUser(user);
    }

    @Override
    public void deleteUser(List<User> users) {
        UserRepository.deleteUser(users);
    }
}