package com.example.home.properthesis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

//jdbc


import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;


//
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.microsoft.windowsazure.mobileservices.MobileServiceClient;
import com.microsoft.windowsazure.mobileservices.http.OkHttpClientFactory;

import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import com.microsoft.windowsazure.mobileservices.MobileServiceClient;
import com.microsoft.windowsazure.mobileservices.http.NextServiceFilterCallback;
import com.microsoft.windowsazure.mobileservices.http.OkHttpClientFactory;
import com.microsoft.windowsazure.mobileservices.http.ServiceFilter;
import com.microsoft.windowsazure.mobileservices.http.ServiceFilterRequest;
import com.microsoft.windowsazure.mobileservices.http.ServiceFilterResponse;
import com.microsoft.windowsazure.mobileservices.table.MobileServiceTable;
import com.microsoft.windowsazure.mobileservices.table.query.Query;
import com.microsoft.windowsazure.mobileservices.table.query.QueryOperations;
import com.microsoft.windowsazure.mobileservices.table.sync.MobileServiceSyncContext;
import com.microsoft.windowsazure.mobileservices.table.sync.MobileServiceSyncTable;
import com.microsoft.windowsazure.mobileservices.table.sync.localstore.ColumnDataType;
import com.microsoft.windowsazure.mobileservices.table.sync.localstore.MobileServiceLocalStoreException;
import com.microsoft.windowsazure.mobileservices.table.sync.localstore.SQLiteLocalStore;
import com.microsoft.windowsazure.mobileservices.table.sync.synchandler.SimpleSyncHandler;


import static com.example.home.properthesis.R.id.password;
import static com.microsoft.windowsazure.mobileservices.table.query.QueryOperations.*;



public class MainActivity extends AppCompatActivity {



    private DatabaseReference mFirebaseDatabase;
    private FirebaseDatabase mFirebaseInstance;
    //Create an object of DatabaseReference to create second table
    private DatabaseReference mFirebaseDatabase1;
    private MobileServiceClient mClient;
    ConnectionClass connection;
    //defining view objects
    private EditText muser;
    private EditText mPassword;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
        try {
            // Create the Mobile Service Client instance, using the provided


            mClient = new MobileServiceClient(
                    "https://safetyfrst.azurewebsites.net",
                   this);

        mu


        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

         **/
        connection = new ConnectionClass();


        login =findViewById(R.id.btn_signin);
        muser = findViewById(R.id.musertext);
        mPassword =  findViewById(password);

    }


        public  void signin (View v){

            Connection con = connection.CONN();
            String userid=  muser.getText().toString();
            String userpassword = mPassword.getText().toString();


            try {
                    //String query = "select password from users where username='" + userid + "'";
                   // Statement stmt = con.createStatement();
                   // ResultSet rs = stmt.executeQuery(query);
                String val1="test";
                String val2="test";
                String val3="test";
                String val4="test";
                String query = "insert into safetyfirst.dbo.users (username,email,password,status) values " +"(" + val1 + val2 + val3 + val4 ;
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);




                        Toast.makeText(getApplicationContext(), "Problem",
                                Toast.LENGTH_SHORT).show();


                    /**
                    String query2 = "select * from dbo.users where password='" + userpassword+ "'";
                    Statement stmt2 = con.createStatement();
                    ResultSet rs = stmt2.executeQuery(query2);
                    **/


            }catch (Exception e){

            }


        }

        public void register (View v){
            Connection con = connection.CONN();

            if(con == null){


                Toast.makeText(getApplicationContext(), "Your toast message.",
                        Toast.LENGTH_SHORT).show();

            }
            else{
                Toast.makeText(getApplicationContext(), "connected.",
                        Toast.LENGTH_SHORT).show();
            }
        }

    }

