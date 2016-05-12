package com.hthinyane.translateapplication;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toEnglish(View view) {
        translateTo("en");
    }

    public void toFrench(View view) {
        translateTo("fr");
    }

    public void toSpanish(View view) {
        translateTo("es");
    }

    public void toBosnian(View view) {
        translateTo("bs");
    }

    public void translateTo(String str) {
        Locale locale = new Locale (str);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getApplicationContext().getResources().updateConfiguration(config,
                getApplicationContext().getResources().getDisplayMetrics());
        recreate();
    }
}
