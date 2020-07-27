package io.github.ncsquan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView)findViewById(R.id.textView);
        Button resetButton = (Button)findViewById(R.id.clearButton);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //textView.setText("");
            }
        });
        Button addButton = (Button)findViewById(R.id.plusButton);
        Button numOne = (Button)findViewById(R.id.n1);
        numOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  textView.setText(textView+"1");
            }
        });
    }
}
