package com.yong.myapp5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listView = (ListView) findViewById(R.id.list);

        //Data source
//        String cities[] = {"PhnomPenh", "KompongSom", "SvangReang", "SiemReab"};

        String cities[] = getProvinceNames();

        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, cities);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectProvince = (String) listView.getItemAtPosition(position);
                Location location = loadLocationsData().get(selectProvince);
                Toast.makeText(getApplicationContext(), location.toString(), Toast.LENGTH_LONG).show();
            }
        });
        }

    private HashMap<String, Location> loadLocationsData () {
        HashMap<String, Location> locations = new HashMap<>();
        locations.put("Phnom Penh", new Location(11.5564, 104.9282));
        locations.put("Banteay Meanchey", new Location(13.58588, 102.97369));
        locations.put("Battambang", new Location(13.028697, 102.989616));
        locations.put("Siem Reap", new Location(13.364047, 103.860313));
        locations.put("Sihanouk", new Location(10.627543, 103.522141));
        locations.put("Kompot", new Location(10.594242, 104.164032));
        locations.put("Kampong Cham", new Location(11.99339, 105.4635));
        locations.put("Kampong Chnang", new Location(12.25, 104.66667));
        locations.put("Kampong Thom", new Location(12.71112, 104.88873));
        locations.put("Koh Kong", new Location(11.61531, 102.9838));
        locations.put("Kep", new Location(10.48291, 104.31672));
        locations.put("Prey Veng", new Location(11.48682, 105.32533));
        locations.put("Takeo", new Location(10.99081, 104.78498));
        locations.put("Pursat", new Location(12.53878, 103.9192));
        locations.put("Mondolkiri", new Location(12.45583, 107.18811));
        locations.put("Stung Treng", new Location(13.52586, 105.9683));
        locations.put("Svay Rieng", new Location(11.08785, 105.79935));
        locations.put("Preah Vihear", new Location(13.80731, 104.98046));
        locations.put("Kandal", new Location(11.48333, 104.95));
        locations.put("Ratanak Kiri", new Location(13.73939, 106.98727));
        locations.put("Kampong Speu", new Location(11.45332, 104.52085));
        locations.put("Kratie", new Location(12.48811, 106.01879));
        locations.put("Pailin", new Location(12.84895, 102.60928));
        locations.put("Otar Meanchey", new Location(14.18175, 103.51761));
        locations.put("Tbong Khmum", new Location(11.8891, 105.8760));
        return locations;
    }

    private String[] getProvinceNames () {
        String[] provinces = new String[loadLocationsData().size()];
        provinces = loadLocationsData().keySet().toArray(provinces);
        return provinces;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

}