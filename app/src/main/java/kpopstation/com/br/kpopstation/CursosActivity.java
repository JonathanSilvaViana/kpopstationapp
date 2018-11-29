package kpopstation.com.br.kpopstation;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CursosActivity extends AppCompatActivity {

    FloatingActionButton VoltarView;

    String titulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos);

        //define o titulo da activity
        titulo = "Cursos";
        setTitle(titulo);

        //chama o evento de voltar para o botão flutuante de voltar
        VoltarView = (FloatingActionButton)findViewById(R.id.btVoltarAntes);

        VoltarView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }


}
