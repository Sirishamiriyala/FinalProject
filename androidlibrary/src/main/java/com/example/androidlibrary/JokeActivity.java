package com.example.androidlibrary;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        final Intent intent =getIntent();
        if (intent!=null && intent.hasExtra(Intent.EXTRA_TEXT)){
            final TextView textView=(TextView)findViewById(R.id.jokeTv);
            textView.setText(intent.getStringExtra(Intent.EXTRA_TEXT));
        }
    }
    public static Intent IntentMethod(Context c,String str){
        final Intent intent=new Intent(c,JokeActivity.class);
        intent.putExtra(Intent.EXTRA_TEXT,str);
        return intent;
    }
}