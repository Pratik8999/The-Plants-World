package com.plants.DatabasePipleline;

import java.sql.Connection;
import java.sql.DriverManager;

public class GlobleConnection{

    public static Connection connection;

    private final String username="root";

    private final String password="root@123";

    public GlobleConnection()
    {
        this.esatblishConnection();
    }

    private void esatblishConnection()
    {
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/the_plants_world?useSSL=false", username,password );

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
