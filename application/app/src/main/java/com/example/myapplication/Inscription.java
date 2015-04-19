package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Spinner;


public class Inscription extends Activity {
    //rivate InscriptionController inscriptionController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
        AdapterMaker adapterMaker = new AdapterMaker();
        Spinner spinner = (Spinner) findViewById(R.id.sexe);
        AdapterMaker.setAdapter(R.array.sexe, getBaseContext(), spinner);
        spinner = (Spinner) findViewById(R.id.region);
        AdapterMaker.setAdapter(R.array.region,getBaseContext(),spinner);
        spinner = (Spinner) findViewById(R.id.departement);
        AdapterMaker.setAdapter(R.array.departement,getBaseContext(),spinner);
        spinner = (Spinner) findViewById(R.id.ville);
        AdapterMaker.setAdapter(R.array.ville,getBaseContext(),spinner);

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_inscription, menu);
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
