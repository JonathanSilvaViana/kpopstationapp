package kpopstation.com.br.kpopstation;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent saidasplashscreen = new Intent(MainActivity.this, MainMenuActivity.class );
                startActivity(saidasplashscreen);
                finish();
            }
        },
                SPLASH_TIME_OUT);

    }

}
