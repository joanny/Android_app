package com.example.Init;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Intent;

import com.example.Init.R;
import com.example.Sign_up.Inscription;
import com.example.Find.Find;

public class MainActivity extends Activity {

    Button sign_up = null;
    Button connecter = null;

    Intent intent_sign_up;
    Intent intent_recherche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent_sign_up = new Intent(this,Inscription.class );
        intent_recherche = new Intent(this, Find.class );

        connecter = (Button)findViewById(R.id.login);
        sign_up =  (Button)findViewById(R.id.sign_up);

        connecter.setOnClickListener(connect);
        sign_up.setOnClickListener(Sign);
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


    /*
            Event
     */

    private OnClickListener connect = new OnClickListener() {
        @Override
        public void onClick(View v) {
           startActivity(intent_sign_up);
        }
    };

    private OnClickListener Sign = new OnClickListener() {
        @Override
        public void onClick(View v) {
          startActivity(intent_sign_up);
        }
    };
}
