package com.example.trabalhoavaliativo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PagFinal extends AppCompatActivity implements View.OnClickListener {
    private Button botao;
    private TextView t1, t2;
    private String corretas, t3, t4;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pag_final);

        botao = (Button) findViewById(R.id.button3);
        botao.setOnClickListener(this);
        t1 = (TextView) findViewById(R.id.textView10);
        t2 = (TextView) findViewById(R.id.textView9);

        Intent i = getIntent();
        if (i!= null){
            Bundle b = new Bundle();
            b = i.getExtras();
            if (b!=null){
                t3 = b.getString("dado");
                t4 = b.getString("dado1");
            }
        }
        t1.setText("CORRETAS: " + t3);
        t2.setText("INCORRETAS: " + t4);
    }

    @Override
    public void onClick(View view) {
        if (view==botao){
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
}
