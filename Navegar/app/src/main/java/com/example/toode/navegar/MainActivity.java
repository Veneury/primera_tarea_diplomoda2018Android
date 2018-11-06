package com.example.toode.navegar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button next;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    next=(Button)findViewById(R.id.buttonSiguiente);
    next.setOnClickListener(new View.OnClickListener(){
  @Override
      public void onClick(View v)
  {
    Intent next = new Intent(MainActivity.this, Main2Activity.class);
    startActivity(next);
  }
    });
  }
}
