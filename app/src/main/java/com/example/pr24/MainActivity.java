package com.example.pr24;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
TextView Out;
Button Ok;
Button Cancel;
String TAG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Find View-elements");
        Out = (TextView) findViewById(R.id.TextOut);
        Ok = findViewById(R.id.btnOk);
        Cancel = findViewById(R.id.btnCancel);
        Log.d(TAG, "присваиваем обработчик кнопкам");
        Ok.setOnClickListener(this::onClick);
        Cancel.setOnClickListener(this::onClick);

    }
    public  void  onClick(View v){
        switch (v.getId()){
            case R.id.btnOk:
                Log.d(TAG, "'Ok' button");
                Out.setText("Button 'ok' has been tapped");
                Toast.makeText(this, "Button 'ok' has been tapped", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnCancel:
                Log.d(TAG, "'Cancel' button");
                Out.setText("Button 'Cancel' has been tapped");
                Toast.makeText(this, "Button 'cancel' has been tapped", Toast.LENGTH_SHORT).show();
                break;
            default:
                Log.d(TAG, "None if the buttons is tapped");
                Out.setText("None if the buttons is tapped");
                Toast.makeText(this, "None if the buttons is tapped", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}