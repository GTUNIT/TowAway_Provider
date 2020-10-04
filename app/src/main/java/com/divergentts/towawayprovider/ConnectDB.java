package com.divergentts.towawayprovider;


import java.sql.*;
public class ConnectDB {

    public void connecttaw() {
        System.out.println("want connect to towaway database");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Towaway", "root", "7DTSlmthpb&");
            //here Towaway is database name, root is username and password
            System.out.println("connected to towaway database");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from PROVIDER");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}


