package com.jimmy.romyim.secondhomework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.caculateButton = (Button)findViewById(R.id.caculateButton);
        this.sexRadioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        this.editText = (EditText)findViewById(R.id.editText);
        this.intent = new Intent(MainActivity.this, Result.class);
        this.caculateButton.setOnClickListener(new MyClickListener());
        this.sexRadioGroup.setOnCheckedChangeListener(new MyCheckedChangedListener());
    }

    class MyClickListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            height = Double.parseDouble(editText.getText().toString());
            intent.putExtra("height", height);
            intent.putExtra("sex", sex);
            startActivity(intent);
        }
    }

    class MyCheckedChangedListener implements RadioGroup.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            if (i == R.id.radioButton)
                sex = "男";
            else
                sex = "女";
        }
    }

    double height;
    String sex;
    Intent intent;

    Button caculateButton;
    RadioGroup sexRadioGroup;
    EditText editText;
}
