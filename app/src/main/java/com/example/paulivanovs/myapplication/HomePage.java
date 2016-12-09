package com.example.paulivanovs.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.util.ArrayList;


public class HomePage extends AppCompatActivity
    /*
        This is the homepage java class that handles all the classes
        and action listeners for the homepage.
        Extends AppCompatActivity.
     */
{
    TextView text_hello_world;
    private int m_Word_Index;
    ArrayList<String> m_Text_List;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        m_Word_Index = 0;
        m_Text_List = new ArrayList<String>();
        m_Text_List.add("Hello World");
        m_Text_List.add("Android Studio is cool");
        m_Text_List.add("JavaDocs Future Home Page");


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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


    public void HelloAction(View v)
    /*
       This is a action listener for the btn_hello_world to
       alter the text of text_hello_world.
       Parameter v is the view of which the button is on
     */
    {
        text_hello_world = (TextView) (findViewById(R.id.text_hello_world));
        text_hello_world.setText(m_Text_List.get(++m_Word_Index % m_Text_List.size)); //mod by size to prevent out of index error

    }
}
