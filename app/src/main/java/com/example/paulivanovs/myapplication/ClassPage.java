package com.example.paulivanovs.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;


public class ClassPage extends AppCompatActivity
    /*
        This is the ClassPage java class that handles all the classes
        and action listeners for the homepage.
        Extends AppCompatActivity.
     */
{
    ArrayList<String> m_Text_List;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        m_Text_List = new ArrayList<>();
        m_Text_List.add("Hello World");
        m_Text_List.add("Android Studio is cool");
        m_Text_List.add("JavaDocs Future Home Page");


        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_class_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.class_toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void ClassAction(View v)
    /*
       This is a action listener for the btn_add_class to
       Parameter v is the view of which the button is on
     */
    {
    }
}
