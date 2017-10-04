package com.example.dat11nse.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class tabeltest extends AppCompatActivity {

    String[] NAMES = {"Café Killeröd", "Restaurang Sand", "Victoria", "Veranda Café & Bistro", "Bistro – grodlår & timjan!", "Två Män Cafét"};
    String[] DESCR = {"Kontinentalt café", "Frukost, brunch, lunch, middag - Skandinaviskt", "Café, restaurang, bar", "Café, bistro" , "Restaurang, franskinspirerat", "Café, lunch"};
    String[] TIDER = {"Alla dagar 12:00 - 17:00", "Se hemsida för öppettider", " Onsdag 17:00 - 21:00 \n Torsdag 17:00 - 21:00 \n Fredag/Lördag 11:30 - 01:00 \n Söndag 12:00 - 15:00", "Stängt för säsongen", "Onsdag - Söndag från 18.00", "Måndag - Söndag, 11:00 - 16:00"};
    String[] LINKS = {"http://www.cafe-killerod.se/", "http://www.hotelskansen.se/restaurang-sand", "http://www.victoriabastad.se/", "http://verandabastad.se/sv/hem/" , "http://www.bistrogrodlar-timjan.se/", "tvaman.se"};
    String[] MAPS = {"Kontinentalt café", "Lasses Bodega", "Ninos Bodega", "Aff serverar stuvade flugor" , "Lasses Bodega", "Ninos Bodega"};
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
                view = getLayoutInflater().inflate(R.layout.expanded_resturant, null);

                TextView namn = (TextView) view.findViewById(R.id.textView);
                TextView desc = (TextView) view.findViewById(R.id.textView2);
                TextView times = (TextView) view.findViewById(R.id.textViewOppet);
                TextView link = (TextView) view.findViewById(R.id.textViewLink);
                TextView map = (TextView) view.findViewById(R.id.textViewMap);


                String linkText = "<a href='"+ LINKS[i] + "'>Länk</a>";
                namn.setText(NAMES[i]);
                desc.setText(DESCR[i]);
                times.setText(TIDER[i]);
                link.setText(Html.fromHtml(linkText));
                link.setMovementMethod(LinkMovementMethod.getInstance());
                map.setText("Karta");
            } else {
                view = getLayoutInflater().inflate(R.layout.single_line_for_lists, null);
                TextView namn = (TextView) view.findViewById(R.id.textView4);
                namn.setText(NAMES[i]);

            }
            return view;
        }
    }
}
