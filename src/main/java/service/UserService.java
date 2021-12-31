package service;

import dao.UserDao;
import model.User;

public class UserService {
    UserDao userDao = new UserDao();

    public void saveUser(String name, String family, String age) {
        User user = new User(name, family, age);
        userDao.create(user);
    }
}
