package com.plants.DatabasePipleline;
import com.plants.archive.UserLogin;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class GlobleConnection {

    public static Connection connection;

    private static final String root_username = "root";

    private static final String root_password = "root@123";

    private final String other_user,other_user_password,privilege;

     /*public GlobleConnection()
    {
        root_username="root";
        root_password="root@123";
        other_user=null;
        other_user_password=null;
        privilege="Administrator";
    }*/

    private GlobleConnection(String other_user, String other_user_password,String privilege)
    {
        this.other_user = other_user;
        this.other_user_password = other_user_password;
        this.privilege = privilege;
        esatblishConnection();

    }

    public static void authenticator(String other_user, String other_user_password,String privilege)
    {
        try{
             new GlobleConnection(other_user,other_user_password,privilege);

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(new UserLogin(),"⚠️ Invalid Privilege ⚠️");
            //e.printStackTrace();
        }
    }

    private void esatblishConnection()
    {
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/the_plants_world?useSSL=false", root_username, root_password);

            //PreparedStatement preparedStatement = connection.prepareStatement("select user_name,user_password from user_administration where user_name=? and user_password=?");
//            preparedStatement.setString(1,user_name);
//            preparedStatement.setString(2,user_password);
//
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            if(resultSet!=null)
//            {
//                System.out.println("Before New Connection:"+connection.hashCode());
//                connection.close();
//                connection = DriverManager.getConnection("jdbc:mysql://localhost/the_plants_world?useSSL=false",user_name,user_password);
//                System.out.println("After New Connection:"+connection.hashCode());
//            }


        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}



