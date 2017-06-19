package indi.aljet.testmvp.model;

import java.util.ArrayList;

import indi.aljet.testmvp.bean.UserBean;

/**
 * Created by LJL-lenovo on 2017/6/15.
 */

public class UserModel implements IUserModel {

    private String mFristName;
    private String mLastName;
    private int mID;

    private ArrayList<UserBean> arrayList = new ArrayList<>();

    @Override
    public void setID(int id) {
        mID = id;
    }

    @Override
    public void setFirstName(String firstName) {
        mFristName = firstName;
    }

    @Override
    public void setLastName(String lastName) {

        mLastName = lastName;
        UserBean userBean = new UserBean(mFristName,mLastName);
        arrayList.add(userBean);
    }

    @Override
    public int getID() {
        return mID;
    }

    @Override
    public UserBean load(int id) {
        mID = id;

        return new UserBean("no found","no found");
    }
}
