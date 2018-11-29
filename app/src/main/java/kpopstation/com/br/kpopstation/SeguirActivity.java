package kpopstation.com.br.kpopstation;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;



public class SeguirActivity extends AppCompatActivity {

    FloatingActionButton VoltarView;

    String titulo;


    Button bt_fb;
    Button bt_is;
    Button bt_tw;

    private WebView webView = null;

    WebView barradeenderecos;

    public String fb_url;
    public String in_url;
    public String tw_url;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seguir);

        //nomeia a activity

        titulo = "Siga o KPOPSTATION";

        setTitle(titulo);

        //declara web view
        webView = (WebView)findViewById(R.id.webViewSocial);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new MyWebViewClient(this));



        //inicia o facebook

        bt_fb = (Button)findViewById(R.id.bt_abre_facebook);

        bt_fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fb_url = "http://facebook.com.br";

                webView.loadUrl(fb_url);
            }
        });

        //inicia o instagram

        bt_is = (Button)findViewById(R.id.bt_abre_instagram);

        bt_is.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in_url = "http://instagram.com.br";

                webView.loadUrl(in_url);
            }
        });


        //inicia o twitter

        bt_tw = (Button)findViewById(R.id.bt_abre_twitter);

        bt_tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tw_url = "http://twitter.com.br";

                webView.loadUrl(tw_url);
            }
        });


        //chama o evento de voltar para o botão flutuante de voltar
        VoltarView = (FloatingActionButton)findViewById(R.id.btVoltarAntes);

        VoltarView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


    }




    //helpful https://stackoverflow.com/questions/29752095/how-to-open-a-url-in-webview-on-new-screen-based-on-button-click

    //botão de voltar da web view

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && this.webView.canGoBack()) {
            this.webView.goBack();
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }
}
