package example.com.android.tourguide;

import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvMonuments = (TextView) findViewById(R.id.tvMonuments);
        TextView tvHotels = (TextView) findViewById(R.id.tvHotels);
        TextView tvRestaurants = (TextView) findViewById(R.id.tvRestaurants);
        TextView tvMarkets = (TextView) findViewById(R.id.tvMarkets);

        tvMonuments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Monuments.class);
                startActivity(intent);
            }
        });
        tvHotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Hotels.class);
                startActivity(intent);
            }
        });
        tvRestaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Restaurants.class);
                startActivity(intent);
            }
        });

        tvMarkets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Markets.class);
                startActivity(intent);
            }
        });


    }
}
