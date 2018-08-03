package idadedecachorro.cursoandroid.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText caixaTexto;
    private Button botaoDescobreIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaTexto = (EditText) findViewById(R.id.caixaTextoId);
        botaoDescobreIdade = (Button) findViewById(R.id.botaoDescobreIdadeId);
        resultadoIdade = (TextView) findViewById(R.id.resultadoIdadeId);

        botaoDescobreIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoDigitado = caixaTexto.getText().toString();

                if(textoDigitado.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Campo idade inválido", Toast.LENGTH_SHORT).show();
                } else {
                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int idadeResultado = valorDigitado*7;
                    resultadoIdade.setText("Idade:"+idadeResultado);
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    public void recreate() {
        super.recreate();
    }

    @Override
    public void finish() {
        super.finish();
    }
}
