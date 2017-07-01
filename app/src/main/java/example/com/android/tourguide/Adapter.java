package example.com.android.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Sharma786 on 27/04/2017.
 */

public class Adapter extends ArrayAdapter<ListItemClass> {

    public Adapter(Activity context, ArrayList objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ListItemClass currentItem = getItem(position);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_layout, parent, false);
        }

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView);
        imageView.setImageResource(currentItem.getImageResourceId());

        TextView tvListItemName = (TextView) listItemView.findViewById(R.id.listItemName);
        tvListItemName.setText(currentItem.getMonumentName());

        TextView tvTimings = (TextView) listItemView.findViewById(R.id.timings);
        tvTimings.setText(currentItem.getTimings());

        TextView tvLocation = (TextView) listItemView.findViewById(R.id.location);
        tvLocation.setText(currentItem.getLocation());

        return listItemView;
    }
}
