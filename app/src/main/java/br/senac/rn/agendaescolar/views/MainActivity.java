package br.senac.rn.agendaescolar.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_principal_cadastrar;
    private Button btn_principal_consultar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        btn_principal_cadastrar = (Button) findViewById(R.id.btn_principal_cadastrar);
        btn_principal_consultar=(Button) findViewById(R.id.btn_principal_consultar);

    }

    private void definirEventos() {
        btn_principal_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentChamaFormulario = new Intent(MainActivity.this, AlunoFormularioActivity.class);
                startActivity(intentChamaFormulario);
            }
        });

        btn_principal_consultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentChamaLista = new Intent(MainActivity.this, AlunoListaActivity.class);
                startActivity(intentChamaLista);
            }
        });


    }
}
