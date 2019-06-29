package ru.ogorodnik.homework621;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int ActivityNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView linkText = (TextView) findViewById(R.id.wwwlink);
        final Button frontBtn = (Button) findViewById(R.id.buttonFront);
        final Button backBtn = (Button) findViewById(R.id.buttonBack);

        int num = 1+(int)((100-1+1)*Math.random());
        linkText.setText(getString(R.string.link, num));
        ActivityNumber = num; // ActivityNumber - число, сгенерированное в onCreate

        Log.d("Lifecycle", ActivityNumber + " onCreate()");
        Toast.makeText(MainActivity.this, "onCreate()",  Toast.LENGTH_LONG).show();

// Нажатие кнопки ВПЕРЕД ---------------------------------------------------------------------
        frontBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
// Нажатие кнопки НАЗАД ---------------------------------------------------------------------
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("Lifecycle", ActivityNumber + " onStart()");
        Toast.makeText(MainActivity.this, ActivityNumber + " onStart()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("Lifecycle", ActivityNumber +" onResume()");
        Toast.makeText(MainActivity.this, ActivityNumber + " onResume()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("Lifecycle", ActivityNumber +" onPause()");
        Toast.makeText(MainActivity.this, ActivityNumber + " onPause()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("Lifecycle", ActivityNumber +" onStop()");
        Toast.makeText(MainActivity.this, ActivityNumber + " onStop()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("Lifecycle", ActivityNumber +" onDestroy()");
        Toast.makeText(MainActivity.this, ActivityNumber + " onDestroy()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("Lifecycle", ActivityNumber +" onRestart()");
        Toast.makeText(MainActivity.this, ActivityNumber + " onRestart()", Toast.LENGTH_LONG).show();
    }

}
