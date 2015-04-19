package com.example.Sign_up;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by mekinconnu on 18/04/2015.
 */
public class AdapterMaker {

    AdapterMaker(){

    }
    static void setAdapter(int array, Context context, Spinner spinner){

        spinner.setAdapter(new ArrayAdapter<String>(context,android.R.layout.simple_spinner_item,context.getResources().getStringArray(array)));
    }
}
