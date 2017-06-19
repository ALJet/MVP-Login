package indi.aljet.testmvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import indi.aljet.testmvp.R;

public class MainActivity extends AppCompatActivity
implements IUserView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public int getID() {
        return 0;
    }

    @Override
    public String getFristName() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public void setFristName(String firstName) {

    }

    @Override
    public void setLastName(String lastName) {

    }
}
