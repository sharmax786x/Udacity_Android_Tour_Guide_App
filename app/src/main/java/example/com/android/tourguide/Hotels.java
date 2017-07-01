package example.com.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Hotels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);
        ListView listView = (ListView) findViewById(R.id.activity_hotels);
        ArrayList<ListItemClass> hotelsArrayList = new ArrayList<ListItemClass>();
        ListItemClass item1 = new ListItemClass(getResources().getString(R.string.hotel1), getResources().getString(R.string.hotel_timing), R.drawable.ho1, getResources().getString(R.string.hotel1_add));
        hotelsArrayList.add(item1);
        ListItemClass item2 = new ListItemClass(getResources().getString(R.string.hotel2), getResources().getString(R.string.hotel_timing), R.drawable.ho2, getResources().getString(R.string.hotel2_add));
        hotelsArrayList.add(item2);
        ListItemClass item3 = new ListItemClass(getResources().getString(R.string.hotel3), getResources().getString(R.string.hotel_timing), R.drawable.ho3, getResources().getString(R.string.hotel3_add));
        hotelsArrayList.add(item3);
        ListItemClass item4 = new ListItemClass(getResources().getString(R.string.hotel4), getResources().getString(R.string.hotel_timing), R.drawable.ho4, getResources().getString(R.string.hotel4_add));
        hotelsArrayList.add(item4);
        ListItemClass item5 = new ListItemClass(getResources().getString(R.string.hotel5), getResources().getString(R.string.hotel_timing), R.drawable.ho5, getResources().getString(R.string.hotel5_add));
        hotelsArrayList.add(item5);
        ListItemClass item6 = new ListItemClass(getResources().getString(R.string.hotel6), getResources().getString(R.string.hotel_timing), R.drawable.ho6, getResources().getString(R.string.hotel6_add));
        hotelsArrayList.add(item6);

        Adapter monumentAdapter = new Adapter(this, hotelsArrayList);
        listView.setAdapter(monumentAdapter);
    }
}
