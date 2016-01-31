package com.example.annasblackhat.kisah25nabi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(new AdapterListView(this, nabi));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, KisahDetail.class);
                intent.putExtra(KisahDetail.KEY_NABI, nabi[0][position]);
                intent.putExtra(KisahDetail.KEY_KISAH, nabi[1][position]);
                if(gambar.length>position)
                intent.putExtra(KisahDetail.KEY_IMAGE, gambar[position]);
                startActivity(intent);
            }
        });

    }

    int[] gambar = {R.drawable.steve, R.drawable.steve, R.drawable.steve};

    String[][] nabi = {
            {"Nabi Adam As.","Nabi Idris As.","Nabi Nuh As.","Nabi Hud As.","Nabi Sholeh As.",
                    "Nabi Ibrohim As.","Nabi Luth As.","Nabi Ismail As.","Nabi Ishak As.",
                    "Nabi Ya’kub As.","Nabi Yusuf As.","Nabi Ayub As.","Nabi Syu’aib As.",
                    "Nabi Musa As.","Nabi Harun As.","Nabi Dzulkifli As.","Nabi Daud As.",
                    "Nabi Sulaiman As.","Nabi Ilyas As.","Nabi Ilyasa As.","Nabi Yunus As.",
                    "Nabi Zakaria As.","Nabi Yahya As.","Nabi Isa As.","Nabi Muhammad Saw"
            },
            {"<p align=\"justify\">Last couple of days I've been working on open-sourcing my app Wear for Swarm. <b> This Is Bold</b> This application offers to make a Foursquare check-in using Android wearable device. <b><i> This Is Italic And Bold</i></b> I've been working on it since Android Wear Preview SDK was announced. With first release app was only looking for neaby venues regarding location change in certain time period and offered check-in using automatic system notifications. Last days I've added native support for check-in, so user can make a check-in explicitily (when he needs). Automatic notifications are still optional feature. It's possible to enable it in settings. I'll be happy for any feedback!</p>",
                    "Ini Kisah Nabi Idris As.",
                    "Ini Kisah Nabi Nuh As.",
                    "Ini Kisah Nabi Hud As.",
                    "Ini Kisah Nabi Sholeh As.",
                    "Ini Kisah Nabi Ibrohim As.",
                    "Ini Kisah Nabi Luth As.",
                    "Ini Kisah Nabi Ismail As.",
                    "Ini Kisah Nabi Ishak As.",
                    "Ini Kisah Nabi Ya’kub As.",
                    "Ini Kisah Nabi Yusuf As.",
                    "Ini Kisah Nabi Ayub As.",
                    "Ini Kisah Nabi Syu’aib As.",
                    "Ini Kisah Nabi Musa As.",
                    "Ini Kisah Nabi Harun As.",
                    "Ini Kisah Nabi Dzulkifli As.",
                    "Ini Kisah Nabi Daud As.",
                    "Ini Kisah Nabi Sulaiman As.",
                    "Ini Kisah Nabi Ilyas As.","Ini Kisah Nabi Ilyasa As.","Ini Kisah Nabi Yunus As.",
                    "Ini Kisah Nabi Zakaria As.","Ini Kisah Nabi Yahya As.","Ini Kisah Nabi Isa As.","Ini Kisah Nabi Muhammad Saw"}
    };
}
