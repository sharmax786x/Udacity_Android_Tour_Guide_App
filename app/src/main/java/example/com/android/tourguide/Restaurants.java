package example.com.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);
        ListView listView = (ListView) findViewById(R.id.activity_restaurants);
        ArrayList<ListItemClass> restaurantArrayList = new ArrayList<ListItemClass>();

        ListItemClass item1 = new ListItemClass(getResources().getString(R.string.res1), getResources().getString(R.string.res1_timing), R.drawable.res1, getResources().getString(R.string.res1_add));
        restaurantArrayList.add(item1);
        ListItemClass item2 = new ListItemClass(getResources().getString(R.string.res2), getResources().getString(R.string.res2_timing), R.drawable.res2, getResources().getString(R.string.res2_add));
        restaurantArrayList.add(item2);
        ListItemClass item3 = new ListItemClass(getResources().getString(R.string.res3), getResources().getString(R.string.res3_timing), R.drawable.res3, getResources().getString(R.string.res3_add));
        restaurantArrayList.add(item3);
        ListItemClass item4 = new ListItemClass(getResources().getString(R.string.res4), getResources().getString(R.string.res4_timing), R.drawable.res4, getResources().getString(R.string.res4_add));
        restaurantArrayList.add(item4);
        ListItemClass item5 = new ListItemClass(getResources().getString(R.string.res5), getResources().getString(R.string.res5_timing), R.drawable.res5, getResources().getString(R.string.res5_add));
        restaurantArrayList.add(item5);
        ListItemClass item6 = new ListItemClass(getResources().getString(R.string.res6), getResources().getString(R.string.res6_timing), R.drawable.res6, getResources().getString(R.string.res6_add));
        restaurantArrayList.add(item6);

        Adapter monumentAdapter = new Adapter(this, restaurantArrayList);
        listView.setAdapter(monumentAdapter);
    }
}
