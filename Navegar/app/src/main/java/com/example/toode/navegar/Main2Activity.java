package com.example.toode.navegar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
  Button avanzar;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main2);
    avanzar=(Button)findViewById(R.id.buttonAvanzar);
    avanzar.setOnClickListener(new View.OnClickListener(){
      @Override
      public void onClick(View v)
      {
        Intent avanzar = new Intent(Main2Activity.this, Main3Activity.class);
        startActivity(avanzar);
      }
    });
  }
}
