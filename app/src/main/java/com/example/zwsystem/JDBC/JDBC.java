package com.example.zwsystem.JDBC;


import android.util.Log;

import com.example.zwsystem.Constans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
    private static final String TAG = "JDBC";
    public Connection getConnection() {
        Connection c = null;
        Log.d(TAG, "getConnection: -----------------");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sqlAddress = Constans.JDBCLocalAddress;
            c = DriverManager.getConnection(sqlAddress, Constans.JDBCUser, Constans.JDBCPassword);
            Log.d(TAG, "连接为 " + c);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }

    public static void test(){
        JDBC jdbc = new JDBC();
        jdbc.getConnection();
    }
}
