package ir.developersland.technologyvideodownload;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import ir.developersland.technologyvideodownload.Graphic.Animation_2D.List_Animation_2D;
import ir.developersland.technologyvideodownload.Graphic.Animation_3D.List_Animation_3D;
import ir.developersland.technologyvideodownload.Graphic.Blender.List_Blender;
import ir.developersland.technologyvideodownload.Graphic.CINEMA_4D.List_CINEMA_4D;
import ir.developersland.technologyvideodownload.Graphic.Digital_Painting.List_Digital_Painting;
import ir.developersland.technologyvideodownload.Graphic.Logo_Design.List_Logo_Design;
import ir.developersland.technologyvideodownload.Graphic.Painter.List_Painter;
import ir.developersland.technologyvideodownload.Graphic.Photography.List_Photography;
import ir.developersland.technologyvideodownload.Graphic.ZBrush.List_ZBrush;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * Created by Asus on 2016-12-04.
 */

public class List extends AppCompatActivity {
    ListView list;
    String[] web = {
            "Animation 2D",
            "Animation 3D",
            "Blender",
            "CINEMA 4D",
            "Digital Painting",
            "Logo Design",
            "Painter",
            "Photography",
            "ZBrush"
    };

    String[] image_url = {
            "http://icons.iconarchive.com/icons/blackvariant/button-ui-requests-15/72/PhotoscapeX-icon.png",
            "http://icons.iconarchive.com/icons/blackvariant/button-ui-requests-15/72/PhotoscapeX-icon.png",
            "http://icons.iconarchive.com/icons/blackvariant/button-ui-requests-15/72/PhotoscapeX-icon.png",
            "http://icons.iconarchive.com/icons/blackvariant/button-ui-requests-15/72/PhotoscapeX-icon.png",
            "http://icons.iconarchive.com/icons/blackvariant/button-ui-requests-15/72/PhotoscapeX-icon.png",
            "http://icons.iconarchive.com/icons/blackvariant/button-ui-requests-15/72/PhotoscapeX-icon.png",
            "http://icons.iconarchive.com/icons/blackvariant/button-ui-requests-15/72/PhotoscapeX-icon.png",
            "http://icons.iconarchive.com/icons/blackvariant/button-ui-requests-15/72/PhotoscapeX-icon.png",
            "http://icons.iconarchive.com/icons/blackvariant/button-ui-requests-15/72/PhotoscapeX-icon.png"
    };

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        CustomList adapter = new CustomList(List.this, web, image_url);
        list = (ListView) findViewById(R.id.list_list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position){
                    case 0 :
                        startActivity(new Intent(List.this, List_Animation_2D.class));
                        break;

                    case 1 :
                        startActivity(new Intent(List.this, List_Animation_3D.class));
                        break;

                    case 2 :
                        startActivity(new Intent(List.this, List_Blender.class));
                        break;

                    case 3 :
                        startActivity(new Intent(List.this, List_CINEMA_4D.class));
                        break;

                    case 4 :
                        startActivity(new Intent(List.this, List_Digital_Painting.class));
                        break;

                    case 5 :
                        startActivity(new Intent(List.this, List_Logo_Design.class));
                        break;

                    case 6 :
                        startActivity(new Intent(List.this, List_Painter.class));
                        break;

                    case 7 :
                        startActivity(new Intent(List.this, List_Photography.class));
                        break;

                    case 8 :
                        startActivity(new Intent(List.this, List_ZBrush.class));
                        break;

                }
            }
        });
    }
}