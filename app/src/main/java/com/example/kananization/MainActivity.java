package com.example.kananization;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button button = (Button) findViewById(R.id.button2);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
    }

    public void replace(View view) {
        EditText editText = findViewById(R.id.editText);
        EditText editText2 = findViewById(R.id.editText2);
        WanaKanaJava wanaKanaJava = new WanaKanaJava(true);
        String s = wanaKanaJava.toHiragana(editText.getText().toString());
        editText2.setText(s);
        InputMethodManager systemService = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        if (systemService != null) {
            systemService.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }


}
