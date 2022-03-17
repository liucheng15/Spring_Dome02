package org.db.soft.dao;

import lombok.Setter;

@Setter
public class Server {
    private  UserDAO userDAO;

    public  void  operation(){
        boolean b=userDAO.userLogin("xiaoliu","123");
        if (b){
            System.out.println("成功");
        }else {
            System.out.println("失败");
        }
    }
}
