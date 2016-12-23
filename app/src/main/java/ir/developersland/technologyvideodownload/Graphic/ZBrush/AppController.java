package ir.developersland.technologyvideodownload.Graphic.ZBrush;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.LayoutInflater;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import ir.developersland.technologyvideodownload.FontsOverride;
import ir.developersland.technologyvideodownload.R;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by Asus on 2016-12-01.
 */

public class AppController extends Application {

    //for font
    public static Context context;
    public static LayoutInflater layoutInflater;
    public static SharedPreferences preferences;
    //end font

    public static final String TAG = AppController.class.getSimpleName();

    private RequestQueue mRequestQueue;

    private static AppController mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;

        //font method
        font();
    }

    private void font() {
            super.onCreate();
            FontsOverride.setDefaultFont(this, "MONOSPACE", "fonts/iransans.ttf");
            context=getApplicationContext();
            layoutInflater= (LayoutInflater) getSystemService(context.LAYOUT_INFLATER_SERVICE);
            CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                    .setDefaultFontPath("fonts/iransans.ttf")
                    .setFontAttrId(R.attr.fontPath)
                    .build()
            );
            preferences= PreferenceManager.getDefaultSharedPreferences(context);
    }


    public static synchronized AppController getInstance() {
        return mInstance;
    }

    public RequestQueue getRequestQueue() {
        if (mRequestQueue == null) {
            mRequestQueue = Volley.newRequestQueue(getApplicationContext());
        }

        return mRequestQueue;
    }

    public <T> void addToRequestQueue(Request<T> req, String tag) {
        req.setTag(TextUtils.isEmpty(tag) ? TAG : tag);
        getRequestQueue().add(req);
    }

    public <T> void addToRequestQueue(Request<T> req) {
        req.setTag(TAG);
        getRequestQueue().add(req);
    }

    public void cancelPendingRequests(Object tag) {
        if (mRequestQueue != null) {
            mRequestQueue.cancelAll(tag);
        }
    }
}