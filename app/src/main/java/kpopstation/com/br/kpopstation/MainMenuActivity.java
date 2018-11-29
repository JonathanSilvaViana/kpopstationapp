package kpopstation.com.br.kpopstation;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainMenuActivity extends AppCompatActivity {

    FloatingActionButton bt_email;

    Button posts;

    Button social_views;

    Button compartilhar;

    Button cursos;

    Button videos;

    Button eventos;

    Button player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);


        //encaminha usuário apra a página de e-mail
        bt_email = (FloatingActionButton)findViewById(R.id.bt_EnviarEmail);

        bt_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vaiparaemail = new Intent(MainMenuActivity.this, EmailActivity.class);
                startActivity(vaiparaemail);
            }
        });


        //botões de posts
        posts = (Button)findViewById(R.id.bt_posts_view);

        posts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent enviauseraposts = new Intent(MainMenuActivity.this, PostsActivity.class);
                startActivity(enviauseraposts);
            }
        });

        //encaminha para redes sociais

        social_views = (Button)findViewById(R.id.bt_seguir);

        social_views.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vaiasredessociais = new Intent(MainMenuActivity.this, SeguirActivity.class);
                startActivity(vaiasredessociais);
            }
        });

        //faz a ação de compartilhar a url de instalação para o app

        compartilhar = (Button)findViewById(R.id.bt_compartilhar);

        compartilhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //avisa as pessoas
                Toast.makeText(MainMenuActivity.this, "Disponível apenas para Android", Toast.LENGTH_LONG).show();
                //faz a brincadeira
                Intent intentCompartilhar = new Intent();
                intentCompartilhar.setAction(Intent.ACTION_SEND);
                intentCompartilhar.putExtra(Intent.EXTRA_TEXT, "Baixe o aplicativo do Kpopstation: play.google.com/br.com.kpopstation");
                intentCompartilhar.setType("text/plain");
                startActivity(intentCompartilhar);
            }
        });

        //inicia a activity de cursos

        cursos = (Button)findViewById(R.id.bt_cursos);

        cursos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent enviaParaCursos = new Intent(MainMenuActivity.this , CursosActivity.class);
                startActivity(enviaParaCursos);
            }
        });

        videos = (Button)findViewById(R.id.bt_videos);

        videos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent enviaParaVideos = new Intent(MainMenuActivity.this , ListVideosActivity.class);
                startActivity(enviaParaVideos);
            }
        });

        eventos = (Button)findViewById(R.id.bt_eventos);

        eventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent passaparaeventos = new Intent(MainMenuActivity.this, EventosActivity.class);
                startActivity(passaparaeventos);
            }
        });

        player = (Button)findViewById(R.id.bt_player);

        player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent passaparaplayer = new Intent(MainMenuActivity.this, PlayerActivity.class);
                startActivity(passaparaplayer);
            }
        });

    }

}
