package informatica.cristianandresguerrerobermudez.chistesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {
    Button boton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        boton5 = (Button) findViewById(R.id.boton5);
        boton5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.boton5:
                Intent intent = new Intent(ThirdActivity.this,MainActivity.class);
                startActivity(intent);
                break;


        }
    }
}
