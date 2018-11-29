package kpopstation.com.br.kpopstation;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PostsActivity extends AppCompatActivity {

    FloatingActionButton VoltarView;

    String TituloPosts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posts);

        //define título de posts

        TituloPosts = "Posts";

        if (TituloPosts != null) {

            setTitle(TituloPosts);

        }
        else {

            setTitle("Aplicativo hackeado fale com o desenvolvedor");
        }

        //verifica se o usuário está com rede
        ConnectivityManager CN = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        if (CN.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED
                || CN.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED)
        {
            Toast.makeText(this, "Boa leitura!", Toast.LENGTH_SHORT).show();
        }
        else if (CN.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.DISCONNECTED
                || CN.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.DISCONNECTED)
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(PostsActivity.this);
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
                            Intent mandaparahomedenovo = new Intent(PostsActivity.this, MainActivity.class);
                            startActivity(mandaparahomedenovo);
                        }
                    });

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
        else {

            Toast.makeText(this, "Sem rede", Toast.LENGTH_SHORT).show();
            System.exit(1);

        }

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
