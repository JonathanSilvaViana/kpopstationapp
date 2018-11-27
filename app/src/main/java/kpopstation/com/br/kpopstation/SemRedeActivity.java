package kpopstation.com.br.kpopstation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SemRedeActivity extends AppCompatActivity {

    String semrede;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem_rede);

        semrede = "Sem conexão neste dispositivo";

        Toast.makeText(this, semrede, Toast.LENGTH_SHORT).show();
    }
}
