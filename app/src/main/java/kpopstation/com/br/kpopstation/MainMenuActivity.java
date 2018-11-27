package kpopstation.com.br.kpopstation;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenuActivity extends AppCompatActivity {

    FloatingActionButton bt_email;

    Button posts;

    Button social_views;

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
                Intent enviauseraposts = new Intent(MainMenuActivity.this, SemRedeActivity.class);
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
    }

}
