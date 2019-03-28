package informatica.cristianandresguerrerobermudez.chistesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourthActivity extends AppCompatActivity implements View.OnClickListener {
    Button boton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        boton6 = (Button) findViewById(R.id.boton6);
        boton6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.boton6:
                Intent intent = new Intent(FourthActivity.this,MainActivity.class);
                startActivity(intent);
                break;


        }
    }
}
