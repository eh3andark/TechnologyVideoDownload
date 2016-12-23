package ir.developersland.technologyvideodownload.Graphic.Animation_3D;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import ir.developersland.technologyvideodownload.CustomList;
import ir.developersland.technologyvideodownload.Graphic.ZBrush.A_A;
import ir.developersland.technologyvideodownload.R;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * Created by Asus on 2016-12-04.
 */

public class List_Animation_3D extends AppCompatActivity {
    ListView list;
    String[] web = {

            "Animation 3D",
            "Photography",
            "Blender",
            "Logo Design",
            "CINEMA 4D",
            "Animation 2D",
            "Digital Painting",
            "ZBrush",
            "Painter"
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
        CustomList adapter = new CustomList(List_Animation_3D.this, web, image_url);
        list = (ListView) findViewById(R.id.list_list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position){
                    case 0 :
                        A_A frame_1 = new A_A();
                        FragmentManager manager_1 = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction_1 = manager_1.beginTransaction();
                        if (frame_1 != null) {
                            fragmentTransaction_1.replace(R.id.form_containerr, frame_1);
                            fragmentTransaction_1.addToBackStack(null);
                            fragmentTransaction_1.commit();
                        }
                        break;

                    case 1:

                        break;

                    case 2:

                }
            }
        });
    }
}