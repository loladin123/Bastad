package com.example.dat11nse.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class tabeltest extends AppCompatActivity {

    String[] NAMES = {"Peppes", "Lasses", "Ninos", "Aff", "Lasses", "Ninos", "Aff"};
    String[] DESCR = {"Peppes bodega", "Lasses Bodega", "Ninos Bodega", "Aff serverar stuvade flugor" , "Lasses Bodega", "Ninos Bodega", "http://www.google.com"};
    int selectedNumber = -1;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabeltest);

        ListView listView = (ListView)findViewById(R.id.ListMat);
        customAdapter = new CustomAdapter();

        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    customAdapter.selectedItem(i);
                    customAdapter.notifyDataSetChanged();
            }
        });
    }

    class CustomAdapter extends BaseAdapter {

        public void selectedItem(int pos){
            selectedNumber = pos;
        }

        @Override
        public int getCount() {
            return NAMES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (i == selectedNumber) {
                view = getLayoutInflater().inflate(R.layout.customlisttest, null);

                TextView namn = (TextView) view.findViewById(R.id.textView);
                TextView desc = (TextView) view.findViewById(R.id.textView2);

                namn.setText(NAMES[i]);
                desc.setText(DESCR[i]);
            } else {
                view = getLayoutInflater().inflate(R.layout.simpleline, null);
                TextView namn = (TextView) view.findViewById(R.id.textView4);
                namn.setText(NAMES[i]);

            }
            return view;
        }
    }
}
