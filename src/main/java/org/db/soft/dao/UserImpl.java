package org.db.soft.dao;

public class UserImpl implements  UserDAO{
    @Override
    public boolean userLogin(String username, String password) {
        boolean b=false;
        if(username.equalsIgnoreCase("xiaoliu")){
            if (password.equalsIgnoreCase("123")){
                b=true;
            }
        }
        return b;
    }
}
