package example.com.android.tourguide;

/**
 * Created by Sharma786 on 27/04/2017.
 */

public class ListItemClass {

    String itemName;
    int imageResourceId;
    String timings;
    String location;

    public ListItemClass(String x, String y, int a, String z) {
        itemName = x;
        timings = y;
        imageResourceId = a;
        location = z;
    }


    public String getMonumentName() {
        return itemName;
    }

    public String getTimings() {
        return timings;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getLocation() {
        return location;
    }
}
