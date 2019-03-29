package informatica.cristianandresguerrerobermudez.chistesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView titulo;
    Button boton1;
    Button boton2;
    Button boton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titulo = (TextView) findViewById(R.id.titulo);
        boton1 = (Button) findViewById(R.id.boton1);
        boton1.setOnClickListener(this);
        boton2 = (Button) findViewById(R.id.boton2);
        boton2.setOnClickListener(this);
        boton3 = (Button) findViewById(R.id.boton3);
        boton3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.boton1:
                Intent intent1 = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent1);
                break;
            case R.id.boton2:
                Intent intent2 = new Intent(MainActivity.this,ThirdActivity.class);
                startActivity(intent2);
                break;
            case R.id.boton3:
                Intent intent3 = new Intent(MainActivity.this,FourthActivity.class);
                startActivity(intent3);
                break;
        }

    }
}
