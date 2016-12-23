package ir.developersland.technologyvideodownload;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;


/**
 * Created by Asus on 2016-12-01.
 */

public class DataAdapter_One extends RecyclerView.Adapter<DataAdapter_One.ViewHolder> {
    private ArrayList<CardViewModel> android;
    private Context context;

    public DataAdapter_One(Context context, ArrayList<CardViewModel> android) {
        this.android = android;
        this.context = context;
    }

    @Override
    public DataAdapter_One.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view_minimum, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final DataAdapter_One.ViewHolder viewHolder, final int i) {

        viewHolder.tv_android.setText(android.get(i).getAndroid_version_name());
        Picasso.with(context).load(android.get(i).getAndroid_image_url()).resize(100, 100).into(viewHolder.img_android);


        viewHolder.img_android.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                switch (viewHolder.getAdapterPosition()){
                    case 0 :
                        Intent a1 = new Intent(context, List.class);
                        a1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(a1);
                        break;

                    case 1 :
                        Intent a2 = new Intent(context, List.class);
                        a2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(a2);
                        break;

                    case 2 :
                        Intent a3 = new Intent(context, List.class);
                        a3.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(a3);
                        break;

                    case 3 :
                        Intent a4 = new Intent(context, List.class);
                        a4.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(a4);
                        break;

                    case 4 :
                        Intent a5 = new Intent(context, List.class);
                        a5.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(a5);
                        break;

                    case 5 :
                        Intent a6 = new Intent(context, List.class);
                        a6.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(a6);
                        break;

                    case 6 :
                        Intent a7 = new Intent(context, List.class);
                        a7.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(a7);
                        break;

                    case 7 :
                        Intent a8 = new Intent(context, List.class);
                        a8.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(a8);
                        break;

                    case 8 :
                        Intent a9 = new Intent(context, List.class);
                        a9.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(a9);
                        break;

                    case 9 :
                        Intent a10 = new Intent(context, List.class);
                        a10.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(a10);
                        break;

                    case 10 :
                        Intent a11 = new Intent(context, List.class);
                        a11.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(a11);
                        break;

                    case 11 :
                        Intent a12 = new Intent(context, List.class);
                        a12.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(a12);
                        break;

                    case 12 :
                        Intent a13 = new Intent(context, List.class);
                        a13.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(a13);
                        break;

                    case 13 :
                        Intent a14 = new Intent(context, List.class);
                        a14.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(a14);
                        break;

                    case 14 :
                        Intent a15 = new Intent(context, List.class);
                        a15.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(a15);
                        break;

                    case 15 :
                        Intent a16 = new Intent(context, List.class);
                        a16.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(a16);
                        break;

                    case 16 :
                        Intent a17 = new Intent(context, List.class);
                        a17.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(a17);
                        break;

                    case 17 :
                        Intent a18 = new Intent(context, List.class);
                        a18.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(a18);
                        break;

                    case 18 :
                        Intent a19 = new Intent(context, List.class);
                        a19.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(a19);
                        break;

                    case 19 :
                        Intent a20 = new Intent(context, List.class);
                        a20.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(a20);
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return android.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_android;
        private ImageView img_android;
        public ViewHolder(View view) {
            super(view);

            tv_android = (TextView)view.findViewById(R.id.tv_android);
            img_android = (ImageView) view.findViewById(R.id.img_android);
        }
    }

}