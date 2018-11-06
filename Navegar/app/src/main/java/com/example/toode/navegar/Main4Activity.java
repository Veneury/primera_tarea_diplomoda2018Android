package com.example.toode.navegar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {
Button seguir;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main4);
    seguir=(Button)findViewById(R.id.buttonAdelante);
    seguir.setOnClickListener(new View.OnClickListener(){
      @Override
      public void onClick(View v)
      {
        Intent seguir = new Intent(Main4Activity.this, Main5Activity.class);
        startActivity(seguir);
      }
    });
  }
}
