package com.msouthwell.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button app1 = (Button) findViewById(R.id.app1);
        Button app2 = (Button) findViewById(R.id.app2);
        Button app3 = (Button) findViewById(R.id.app3);
        Button app4 = (Button) findViewById(R.id.app4);
        Button app5 = (Button) findViewById(R.id.app5);
        Button app6 = (Button) findViewById(R.id.app6);
        app1.setOnClickListener(this);
        app2.setOnClickListener(this);
        app3.setOnClickListener(this);
        app4.setOnClickListener(this);
        app5.setOnClickListener(this);
        app6.setOnClickListener(this);


    }

    @Override
    public void onClick(View v){
        Context context = getApplicationContext();
        CharSequence text = getString(R.string.app_name);
        switch (v.getId()) {
            case R.id.app1:
                text = getString(R.string.app1);
                break;

            case R.id.app2:
                text = getString(R.string.app2);
                break;

            case R.id.app3:
                text = getString(R.string.app3);
                break;

            case R.id.app4:
                text = getString(R.string.app4);
                break;

            case R.id.app5:
                text = getString(R.string.app5);
                break;

            case R.id.app6:
                text = getString(R.string.app6);
                break;
            default:
                break;
        }
        Toast toast = Toast.makeText(context, text, Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
