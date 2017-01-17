package aplicacion.android.oad.tandaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = (TextView)findViewById(R.id.textViewMain);
        btnNext = (Button)findViewById(R.id.buttonGoSharing);

        //Tomar los datos del Intent
        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            String mensaje = bundle.getString("mensaje");
            Toast.makeText(SecondActivity.this, mensaje, Toast.LENGTH_LONG).show();
            textView.setText(mensaje);
        }else{
            Toast.makeText(SecondActivity.this, "Esta vacio el Bundle", Toast.LENGTH_LONG).show();
        }

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });

    }
}
