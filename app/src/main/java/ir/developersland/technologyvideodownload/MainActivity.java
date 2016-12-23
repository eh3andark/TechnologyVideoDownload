package ir.developersland.technologyvideodownload;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarBadge;
import com.roughike.bottombar.BottomBarFragment;
import com.roughike.bottombar.OnTabSelectedListener;

import java.util.ArrayList;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    //baraye dokmeye emtiyaz toolbar va drawerlayout
    private ImageView star;
    private DrawerLayout drawer;
    private SliderLayout sliderShow;
    private BottomBar bottomBar;
    //end

    private final String Text_First_Category[] = {
            "Adobe",
            "آموزش های ویژه",
            "Apple TV",
            "Artificial Intelligence",
            "Autodesk",
            "Book",
            "Business",
            "Data Access",
            "Database",
            "Electronic",
            "Email Marketing",
            "English Learning",
            "Frameworks",
            "General Discussion",
            "Graphic",
            "Mac Programming",
            "Matlab",
            "Mechanic",
            "Microsoft.Net",
            "Microsoft Office"
    };

    private final String Text_Secend_Category[] = {
            "Microsoft Windows",
            "Mobile Development",
            "Network",
            "Other Languages",
            "Physics",
            "Project",
            "Report Tools",
            "Science",
            "Softwares",
            "Sprite Kit",
            "Static Testing",
            "Tools",
            "Unit Testing",
            "Unity",
            "Universities",
            "Unreal Engine",
            "Video",
            "Web Development",
            "Web Graphic"
    };

    private final String Image_First_Category[] = {
            "http://icons.iconarchive.com/icons/blackvariant/button-ui-requests-15/72/PhotoscapeX-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png"
    };

    private final String Images_Secend_Category[] = {

            "http://icons.iconarchive.com/icons/blackvariant/button-ui-requests-15/72/PhotoscapeX-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png",
            "http://icons.iconarchive.com/icons/janosch500/tropical-waters-folders/128/Burn-icon.png"
    };


    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bottonbar
        bottomBar = BottomBar.attach(this, savedInstanceState);
        bottombar();

        //first category
        First_Category();

        //secend category
        Secend_Category();

        //slider
        slider();


        star = (ImageView) findViewById(R.id.btn_star_actionbar);
        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);



        //baraye navigationdrawer
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }


    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.END)) {
            drawer.closeDrawer(GravityCompat.END);
        } else {
            super.onBackPressed();
        }
    }
    //end


    //end slideshow
    @Override
    protected void onStop() {
        sliderShow.stopAutoCycle();
        super.onStop();
    }


    //tarife dokmeye setting baraye drawernavigation
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();


        if (id == R.id.action_settings) {
            drawer.openDrawer(GravityCompat.END);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    //end


    //ajzaye navigationdrawer
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();


        if (id == R.id.nav_import) {

        } else if (id == R.id.nav_gallery) {
            startActivity(new Intent(MainActivity.this, List.class));
        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        drawer.closeDrawer(GravityCompat.END);
        return true;
    }

    private void slider() {
        sliderShow = (SliderLayout) findViewById(R.id.slider);
        TextSliderView text_one = new TextSliderView(this);
        text_one
                .description("One")
                .image("http://images.boomsbeat.com/data/images/full/19640/game-of-thrones-season-4-jpg.jpg");
        sliderShow.addSlider(text_one);

        TextSliderView text_two = new TextSliderView(this);
        text_two
                .description("Two")
                .image("http://images.boomsbeat.com/data/images/full/19640/game-of-thrones-season-4-jpg.jpg");
        sliderShow.addSlider(text_two);

        TextSliderView text_three = new TextSliderView(this);
        text_three
                .description("Three")
                .image("http://images.boomsbeat.com/data/images/full/19640/game-of-thrones-season-4-jpg.jpg");
        sliderShow.addSlider(text_three);

        TextSliderView text_for = new TextSliderView(this);
        text_for
                .description("For")
                .image("http://images.boomsbeat.com/data/images/full/19640/game-of-thrones-season-4-jpg.jpg");
        sliderShow.addSlider(text_for);

        TextSliderView text_five = new TextSliderView(this);
        text_five
                .description("Five")
                .image("http://images.boomsbeat.com/data/images/full/19640/game-of-thrones-season-4-jpg.jpg");
        sliderShow.addSlider(text_five);
    }

    //first receycle
    private void First_Category() {
        RecyclerView recyclerView_one = (RecyclerView) findViewById(R.id.card_recycler_view);
        recyclerView_one.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView_one.setLayoutManager(layoutManager);

        ArrayList<CardViewModel> cardViewModels = prepareData_one();
        DataAdapter_One adapter = new DataAdapter_One(getApplicationContext(), cardViewModels);
        recyclerView_one.setAdapter(adapter);

    }

    private ArrayList<CardViewModel> prepareData_one() {

        ArrayList<CardViewModel> android_version = new ArrayList<>();
        for (int i = 0; i < Text_First_Category.length; i++) {
            CardViewModel cardViewModel = new CardViewModel();
            cardViewModel.setAndroid_version_name(Text_First_Category[i]);
            cardViewModel.setAndroid_image_url(Image_First_Category[i]);
            android_version.add(cardViewModel);
        }
        return android_version;
    }


    //secend receycle
    private void Secend_Category() {
        RecyclerView recyclerView_two = (RecyclerView) findViewById(R.id.card_recycler_vieww);
        recyclerView_two.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView_two.setLayoutManager(layoutManager);

        ArrayList<CardViewModel> cardViewModels = prepareData_two();
        DataAdapter_Two adapter = new DataAdapter_Two(getApplicationContext(), cardViewModels);
        recyclerView_two.setAdapter(adapter);

    }

    private ArrayList<CardViewModel> prepareData_two() {

        ArrayList<CardViewModel> android_versionn = new ArrayList<>();
        for (int d = 0; d < Text_Secend_Category.length; d++) {
            CardViewModel androidVersionn = new CardViewModel();
            androidVersionn.setAndroid_version_name(Text_Secend_Category[d]);
            androidVersionn.setAndroid_image_url(Images_Secend_Category[d]);
            android_versionn.add(androidVersionn);
        }
        return android_versionn;
    }

    private void bottombar() {


        //agar version android >= 21 bashe in code ke baraye navBar hast ro ejra mikone
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            bottomBar.noNavBarGoodness();
        }

        bottomBar.setFragmentItems(getSupportFragmentManager(), R.id.fragmentContainer,
                new BottomBarFragment(SampleFragment.newInstance("Content for recents."), R.drawable.ic_star_black_24dp, "a"),
                new BottomBarFragment(SampleFragment.newInstance("Content for food."), R.drawable.ic_help_outline_black_24dp, "b"),
                new BottomBarFragment(SampleFragment.newInstance("Content for favorites."), R.drawable.ic_view_list_black_24dp, "c"),
                new BottomBarFragment(SampleFragment.newInstance("Content for locations."), R.drawable.ic_help_outline_black_24dp, "d")
        );

        // Setting colors for different tabs when there's more than three of them.
        bottomBar.mapColorForTab(0, "#3B494C");
        bottomBar.mapColorForTab(1, "#00796B");
        bottomBar.mapColorForTab(2, "#7B1FA2");
        bottomBar.mapColorForTab(3, "#FF5252");

        bottomBar.setOnItemSelectedListener(new OnTabSelectedListener() {
            @Override
            public void onItemSelected(int position) {
                switch (position) {
                    case 0:

                        break;

                    case 2:
                        break;

                    case 3:
                        break;

                    case 4:
                        break;
                }
            }
        });

        // Make a Badge for the first tab, with red background color and a value of "4".
        BottomBarBadge unreadMessages = bottomBar.makeBadgeForTabAt(3, "#E91E63", 10);

        // Control the badge's visibility
        unreadMessages.show();
        //unreadMessages.hide();

        // Change the displayed count for this badge.
        //unreadMessages.setCount(4);

        // Change the show / hide animation duration.
        unreadMessages.setAnimationDuration(200);

        // If you want the badge be shown always after unselecting the tab that contains it.
        //unreadMessages.setAutoShowAfterUnSelection(true);
    }
}