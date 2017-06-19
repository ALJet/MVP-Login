package indi.aljet.testmvp.model;

import indi.aljet.testmvp.bean.UserBean;

/**
 * Created by LJL-lenovo on 2017/6/15.
 */

public interface IUserModel {


//    void setUser(UserBean userBean);

    void setID(int id);

    void setFirstName(String firstName);

    void setLastName(String lastName);
    int getID();

    UserBean load(int id);
}
