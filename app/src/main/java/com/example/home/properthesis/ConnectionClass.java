package com.example.home.properthesis;
import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.util.Log;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;

public class ConnectionClass {

    String ip = "saf123.database.windows.net";
    String portNumber = "1433";
    String databaseName = "safetyfirst";
    String username = "saf123@saf123";
    String password = "Pennyblack1";
    String classs = "net.sourceforge.jtds.jdbc.Driver";


    @SuppressLint("NewApi")
    public Connection CONN() {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                .permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection conn = null;
        String ConnURL = "jdbc:sqlserver://saf123.database.windows.net:1433;database=safetyfirst;user=saf123@saf123;password=Pennyblack1;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;;";
        try {

           Class.forName(classs);

            ConnURL = "jdbc:jtds:sqlserver://" + ip + ":"+ portNumber+ ";"
                    + "database=" + databaseName + ";user=" + username + ";password="
                    + password +  ";encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;;";

            conn = DriverManager.getConnection(ConnURL);
        } catch (SQLException se) {
            Log.e("ERRO", se.getMessage());
        } catch (Exception e) {
            Log.e("ERRO", e.getMessage());
        }
        return conn;
    }
}
