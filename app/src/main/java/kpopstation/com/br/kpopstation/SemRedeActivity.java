package kpopstation.com.br.kpopstation;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SemRedeActivity extends AppCompatActivity {

    Button sair_do_app;
    String semrede;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem_rede);


        //aviso que está sem rede
        semrede = "Sem conexão neste dispositivo";

        Toast.makeText(this, semrede, Toast.LENGTH_SHORT).show();

        //dá ação de sair do aplicativo
        sair_do_app = (Button)findViewById(R.id.bt_sair);

        sair_do_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //android.os.Process.killProcess(android.os.Process.myPid());
                //System.exit(0);

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(SemRedeActivity.this);
                alertDialogBuilder.setTitle("Problemas de rede");
                alertDialogBuilder
                        .setMessage("Clique em sim para fechar")
                        .setCancelable(false)
                        .setPositiveButton("Sim",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        moveTaskToBack(true);
                                        android.os.Process.killProcess(android.os.Process.myPid());
                                        System.exit(1);
                                    }
                                })

                        .setNegativeButton("Não", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                                dialog.cancel();
                                Intent mandaparahomedenovo = new Intent(SemRedeActivity.this, MainActivity.class);
                                startActivity(mandaparahomedenovo);
                            }
                        });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });

    }
}
