package example.com.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Monuments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monuments);
        ListView listView = (ListView) findViewById(R.id.activity_monuments);
        ArrayList<ListItemClass> monumentsArrayList = new ArrayList<ListItemClass>();
        ListItemClass item1 = new ListItemClass(getResources().getString(R.string.monu1), getResources().getString(R.string.monu1_add), R.drawable.humay_tomb, getResources().getString(R.string.monu1_timing));
        monumentsArrayList.add(item1);
        ListItemClass item2 = new ListItemClass(getResources().getString(R.string.monu2), getResources().getString(R.string.monu2_add), R.drawable.red_fort, getResources().getString(R.string.monu2_timing));
        monumentsArrayList.add(item2);
        ListItemClass item3 = new ListItemClass(getResources().getString(R.string.monu3), getResources().getString(R.string.monu3_add), R.drawable.lotus_temple, getResources().getString(R.string.monu3_timing));
        monumentsArrayList.add(item3);
        ListItemClass item4 = new ListItemClass(getResources().getString(R.string.monu4), getResources().getString(R.string.monu4_add), R.drawable.india_gate,getResources().getString(R.string.monu4_timing));
        monumentsArrayList.add(item4);
        ListItemClass item5 = new ListItemClass(getResources().getString(R.string.monu5), getResources().getString(R.string.monu5_add), R.drawable.qutub_minar_123,getResources().getString(R.string.monu5_timing));
        monumentsArrayList.add(item5);
        ListItemClass item6 = new ListItemClass(getResources().getString(R.string.monu6), getResources().getString(R.string.monu6_add), R.drawable.safdarjungtomb,getResources().getString(R.string.monu6_timing));
        monumentsArrayList.add(item6);

        Adapter monumentAdapter = new Adapter(this, monumentsArrayList);
        listView.setAdapter(monumentAdapter);

    }
}
