package com.example.srinivasan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private int value=0;
    Button increase;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        increase=(Button)findViewById(R.id.increase);
        result=(TextView)findViewById(R.id.result);

        increase.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        value++;

        result.setText(""+ value);

    }
}
