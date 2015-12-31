package com.burakiren.shareapp;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Burakiren on 14/12/2015.
 */
public class UserLocalStore {
    public static final String SP_NAME = "userDetails";
    SharedPreferences userLocalDatabase;

    public UserLocalStore(Context context) {
        userLocalDatabase = context.getSharedPreferences(SP_NAME, 0);
    }

    public void storeUserData(User user) {
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.putString("name", user.name);
        spEditor.putString("username", user.username);
        spEditor.putString("password", user.password);
        spEditor.putInt("age", user.age);
        spEditor.putString("email", user.email);
    }

    public User getLoggedInUser() {
        String name = userLocalDatabase.getString("name", "");
        String password = userLocalDatabase.getString("password", "");
        String email = userLocalDatabase.getString("email", "");
        String username = userLocalDatabase.getString("password", "");
        int age = userLocalDatabase.getInt("age", -1);

        User storedUser = new User(name, age, username, password, email);

        return storedUser;
    }

    public void setUserLoggedIn(boolean loggedIn) {
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.putBoolean("loggedIn", loggedIn);
        spEditor.commit();
    }

    public boolean getUserLoggedIn() {
        return userLocalDatabase.getBoolean("LoggedIn", false);
    }

    public void clearUserData() {
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.clear();
        spEditor.commit();
    }
}
