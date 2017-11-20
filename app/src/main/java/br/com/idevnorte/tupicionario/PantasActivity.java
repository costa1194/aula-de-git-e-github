package br.com.idevnorte.tupicionario;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PantasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantas);

        String[] plantasArray = getResources().getStringArray(R.array.plantas);
        final String[] plantasDescArray = getResources().getStringArray(R.array.plantas_desc);

        ArrayList<Item> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            String titulo = plantasArray[i];
            String descricao = plantasDescArray[i];

            Item item = new Item(titulo,descricao, R.drawable.ic_plantas);
            list.add(item);

        }

        ItemAdapter adapter = new ItemAdapter(this, list, R.color.plantas_categoria);

        ListView listView = (ListView) findViewById(R.id.rootPlantas);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String desc = plantasDescArray[position];
                Toast.makeText(PantasActivity.this, desc, Toast.LENGTH_LONG).show();
            }
        });
        listView.setAdapter(adapter);
    }
}
