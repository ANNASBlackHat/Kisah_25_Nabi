package com.example.annasblackhat.kisah25nabi;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.annasblackhat.kisah25nabi.libs.JustifiedTextView;

public class KisahDetail extends AppCompatActivity {

    public static final String KEY_NABI = "namaNabi";
    public static final String KEY_KISAH = "kisahNabi";
    public static final String KEY_IMAGE = "gambar";
    int x = R.drawable.background;
    String htmlText = " %s ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisah_detail);

        String nama = getIntent().getStringExtra(KEY_NABI);
        String kisah = getIntent().getStringExtra(KEY_KISAH);
        int gambar = getIntent().getIntExtra(KEY_IMAGE, x);

        ((TextView)findViewById(R.id.nama_nabi)).setText(nama);
        //((TextView)findViewById(R.id.txt_kisah)).setText(Html.fromHtml(String.format(htmlText, kisah)));
        ((ImageView) findViewById(R.id.gbr)).setImageResource(gambar);

        WebView webView = (WebView) findViewById(R.id.webView);
        webView.loadData(String.format(htmlText, kisah), "text/html", "utf-8");
        webView.setBackgroundColor(Color.TRANSPARENT);
        webView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);

        /*JustifiedTextView detail = (JustifiedTextView)findViewById(R.id.text_kisah_detail);
        detail.setText(kisah);
        detail.setAlignment(Paint.Align.LEFT);*/
    }
}
