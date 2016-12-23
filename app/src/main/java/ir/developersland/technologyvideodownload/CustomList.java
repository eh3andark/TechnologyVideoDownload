package ir.developersland.technologyvideodownload;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by Asus on 2016-12-04.
 */

public class CustomList extends ArrayAdapter<String> {


    private final Activity context;

    private final String[] web;
    private final String[] image_url;


    public CustomList(Activity context,
                      String[] web, String[] imageId) {
        super(context, R.layout.list_view_item, web);
        this.context = context;
        this.web = web;
        this.image_url = imageId;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_view_item, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.text);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.image);
        txtTitle.setText(web[position]);
        Picasso.with(context).load(image_url[position]).into(imageView);
        return rowView;
    }
}

