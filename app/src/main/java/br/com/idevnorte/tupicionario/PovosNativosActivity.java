package br.com.idevnorte.tupicionario;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PovosNativosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_povos_nativos);

        String[] povos_nativosArray = getResources().getStringArray(R.array.povos_nativos);
        final String[]povos_nativosDescArray = getResources().getStringArray(R.array.povos_nativos_desc);

        ArrayList<Item> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            String titulo = povos_nativosArray[i];
            String descricao = povos_nativosDescArray[i];

            Item item = new Item(titulo,descricao, R.drawable.ic_povos_nativos);
            list.add(item);

        }

        ItemAdapter adapter = new ItemAdapter(this, list, R.color.povos_nativos_categoria);

        ListView listView = (ListView) findViewById(R.id.rootPovosNativos);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String desc = povos_nativosDescArray[position];
                Toast.makeText(PovosNativosActivity.this, desc, Toast.LENGTH_LONG).show();
            }
        });
        listView.setAdapter(adapter);
    }
}
