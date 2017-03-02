package com.jimmy.romyim.secondhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        this.height = getIntent().getDoubleExtra("height", 0.00);
        this.sex = getIntent().getStringExtra("sex");
        this.text = (TextView)findViewById(R.id.textResult);
        this.weight = this.getWeight();
        this.text.setText("你是一位" + this.sex + "性" + "\n你的身高是" + this.height + "公分\n你的标准体重是" + this.weight +"公斤");
    }

    private double getWeight(){
        if (this.sex.equals("男"))
            this.weight = (height - 80) * 0.7;
        else this.weight = (height - 70) * 0.6;
        return weight;
    }

    double weight;
    double height;
    String sex;

    TextView text;
}
