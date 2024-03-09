package models;

import java.util.List;

public interface UserDao {
    List<User> getAllUserToList();
    List<User> getAllUser();
    void addUser(User user);
    User searchUser();
    void updateUser(List<User> users);
    void setUserVerified(List<User> user);

    void deleteUser(List<User> users);
}