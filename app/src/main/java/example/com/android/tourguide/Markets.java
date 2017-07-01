package example.com.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Markets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_markets);
        ListView listView = (ListView) findViewById(R.id.activity_markets);
        ArrayList<ListItemClass> marketArrayList = new ArrayList<ListItemClass>();
        ListItemClass item1 = new ListItemClass(getResources().getString(R.string.mar1), getResources().getString(R.string.mar1_timin), R.drawable.ma1, getResources().getString(R.string.mar1_add));
        marketArrayList.add(item1);
        ListItemClass item2 = new ListItemClass(getResources().getString(R.string.mar2), getResources().getString(R.string.mar2_timing), R.drawable.ma2, getResources().getString(R.string.mar2_add));
        marketArrayList.add(item2);
        ListItemClass item3 = new ListItemClass(getResources().getString(R.string.mar3), getResources().getString(R.string.mar3_timing), R.drawable.ma3, getResources().getString(R.string.mar3_add));
        marketArrayList.add(item3);
        Adapter monumentAdapter = new Adapter(this, marketArrayList);
        listView.setAdapter(monumentAdapter);
    }
}
