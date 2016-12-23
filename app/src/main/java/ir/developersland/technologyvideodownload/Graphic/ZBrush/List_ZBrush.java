package ir.developersland.technologyvideodownload.Graphic.ZBrush;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import ir.developersland.technologyvideodownload.CustomList;
import ir.developersland.technologyvideodownload.R;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * Created by Asus on 2016-12-04.
 */

public class List_ZBrush extends AppCompatActivity {
    ListView list;
    String[] web = {

            "شروع کار با ZBrush",
            "آموزش کامل ZBrush",
            "طراحی بازی در ZBrush",
            "گردش کار NanoMesh در ZBrush",
            "مدل سازی تبر برای بازیها و فیلم ها در ZBrush",
            "طراحی کاراکتر برای بازی موبایل در ZBrush"
    };

    String[] image_url = {

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
        CustomList adapter = new CustomList(List_ZBrush.this, web, image_url);
        list = (ListView) findViewById(R.id.list_list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position){
                    case 0 :
                        setContentView(R.layout.form);
                        A_A frame_1 = new A_A();
                        FragmentManager manager_1 = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction_1 = manager_1.beginTransaction();
                        if (frame_1 != null) {
                            fragmentTransaction_1.replace(R.id.form_containerr, frame_1);
                            fragmentTransaction_1.addToBackStack(null);
                            fragmentTransaction_1.commit();
                        }
                        break;

                    case 1 :
                        setContentView(R.layout.form);
                        A_B frame_2 = new A_B();
                        FragmentManager manager_2 = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction_2 = manager_2.beginTransaction();
                        if (frame_2 != null) {
                            fragmentTransaction_2.replace(R.id.form_containerr, frame_2);
                            fragmentTransaction_2.addToBackStack(null);
                            fragmentTransaction_2.commit();
                        }
                        break;

                    case 2 :
                        setContentView(R.layout.form);
                        A_C frame_3 = new A_C();
                        FragmentManager manager_3 = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction_3 = manager_3.beginTransaction();
                        if (frame_3 != null) {
                            fragmentTransaction_3.replace(R.id.form_containerr, frame_3);
                            fragmentTransaction_3.addToBackStack(null);
                            fragmentTransaction_3.commit();
                        }
                        break;

                    case 3 :
                        setContentView(R.layout.form);
                        A_D frame_4 = new A_D();
                        FragmentManager manager_4 = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction_4 = manager_4.beginTransaction();
                        if (frame_4 != null) {
                            fragmentTransaction_4.replace(R.id.form_containerr, frame_4);
                            fragmentTransaction_4.addToBackStack(null);
                            fragmentTransaction_4.commit();
                        }
                        break;

                    case 4 :
                        setContentView(R.layout.form);
                        A_E frame_5 = new A_E();
                        FragmentManager manager_5 = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction_5 = manager_5.beginTransaction();
                        if (frame_5 != null) {
                            fragmentTransaction_5.replace(R.id.form_containerr, frame_5);
                            fragmentTransaction_5.addToBackStack(null);
                            fragmentTransaction_5.commit();
                        }
                        break;

                    case 5 :
                        setContentView(R.layout.form);
                        A_F frame_6 = new A_F();
                        FragmentManager manager_6 = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction_6 = manager_6.beginTransaction();
                        if (frame_6 != null) {
                            fragmentTransaction_6.replace(R.id.form_containerr, frame_6);
                            fragmentTransaction_6.addToBackStack(null);
                            fragmentTransaction_6.commit();
                        }
                        break;
                }
            }
        });
    }
}