package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        EditText editText=(EditText) findViewById(R.id.editTextNumber);
        String amountInEuro=editText.getText().toString();
        Double amountInDouble=Double.parseDouble(amountInEuro);
        Double convertedInRupee=amountInDouble * 80.01;
        String rupeeString=Double.toString(convertedInRupee);

        Toast.makeText(this,"₹ "+rupeeString,Toast.LENGTH_LONG).show();
        Log.i("Info",rupeeString);



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}