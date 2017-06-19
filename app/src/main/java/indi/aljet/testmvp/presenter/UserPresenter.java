package indi.aljet.testmvp.presenter;

import indi.aljet.testmvp.bean.UserBean;
import indi.aljet.testmvp.model.IUserModel;
import indi.aljet.testmvp.view.IUserView;

/**
 * Created by LJL-lenovo on 2017/6/15.
 */

public class UserPresenter {

    private IUserView mUserView;
    private IUserModel mUserMode;

    public UserPresenter(IUserView mUserView) {
        this.mUserView = mUserView;
    }

    public void saveUser(int id,String firstName,
                         String lastName){
        mUserMode.setID(id);
        mUserMode.setFirstName(firstName);
        mUserMode.setLastName(lastName);
    }

    public void loadUser(int id){
        UserBean user = mUserMode.load(id);
        mUserView.setFristName(user.getmFirstName());
        mUserView.setLastName(user.getmLastName());
    }
}
