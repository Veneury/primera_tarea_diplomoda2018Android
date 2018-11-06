package com.example.toode.navegar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
Button seguir;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main3);

    seguir=(Button)findViewById(R.id.buttonSeguir);
    seguir.setOnClickListener(new View.OnClickListener(){
      @Override
      public void onClick(View v)
      {
        Intent seguir = new Intent(Main3Activity.this, Main4Activity.class);
        startActivity(seguir);
      }
    });
  }
}
