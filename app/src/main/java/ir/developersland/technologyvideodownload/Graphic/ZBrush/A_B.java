package ir.developersland.technologyvideodownload.Graphic.ZBrush;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.squareup.picasso.Picasso;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;

import ir.developersland.technologyvideodownload.AppController;
import ir.developersland.technologyvideodownload.R;

import static ir.developersland.technologyvideodownload.AppController.context;

/**
 * Created by Asus on 2016-10-02.
 */public class A_B extends Fragment {

    Button download_1, download_2, download_3, download_4, download_5, download_6, download_7, download_8;
    ImageView image;
    TextView txt_a, txt_b, txt_c, txt_d, txt_e;
    private ProgressDialog pDialog;
    private String urlJsonObj = "http://developersland.ir/Android/Json_git/Graphic/ZBrush/2.json";
    private String download_url_1, download_url_2, download_url_3, download_url_4, download_url_5, download_url_6, download_url_7,download_url_8;
    public static String TAG = A_B.class.getSimpleName();


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.show_imge_download, container, false);

        download_1 = (Button) rootView.findViewById(R.id.btn_download_1);
        download_2 = (Button) rootView.findViewById(R.id.btn_download_2);
        download_3 = (Button) rootView.findViewById(R.id.btn_download_3);
        download_4 = (Button) rootView.findViewById(R.id.btn_download_4);
        download_5 = (Button) rootView.findViewById(R.id.btn_download_5);
        download_6 = (Button) rootView.findViewById(R.id.btn_download_6);
        download_7 = (Button) rootView.findViewById(R.id.btn_download_7);
        download_8 = (Button) rootView.findViewById(R.id.btn_download_8);
        image = (ImageView) rootView.findViewById(R.id.img_view);
        txt_a = (TextView) rootView.findViewById(R.id.txt_a);
        txt_b = (TextView) rootView.findViewById(R.id.txt_b);
        txt_c = (TextView) rootView.findViewById(R.id.txt_c);
        txt_d = (TextView) rootView.findViewById(R.id.txt_d);
        txt_e = (TextView) rootView.findViewById(R.id.txt_e);


        pDialog = new ProgressDialog(getActivity());
        pDialog.setMessage("Please wait...");
        pDialog.setCancelable(false);

        makeJsonObjectRequest();

        Picasso.with(context).load("http://i.git.ir/ZBrush_with_Michael_Defeo.jpg").resize(600, 300).centerCrop().into(image);

        download_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(download_url_1));
                browserIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(browserIntent);
            }
        });

        download_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(download_url_2));
                browserIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(browserIntent);
            }
        });

        download_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(download_url_3));
                browserIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(browserIntent);
            }
        });

        download_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(download_url_4));
                browserIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(browserIntent);
            }
        });

        download_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(download_url_5));
                browserIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(browserIntent);
            }
        });

        download_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(download_url_6));
                browserIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(browserIntent);
            }
        });

        download_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(download_url_7));
                browserIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(browserIntent);
            }
        });

        download_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(download_url_8));
                browserIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(browserIntent);
            }
        });

        return rootView;
    }


    private void makeJsonObjectRequest() {

        showpDialog();

        JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.GET, urlJsonObj, null, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {
                Log.d(TAG, response.toString());

                try {
                    // Parsing json object response
                    // response will be a json object
                    String a = new String(response.getString("1").getBytes("ISO-8859-1"), "UTF-8");
                    String b = new String(response.getString("2").getBytes("ISO-8859-1"), "UTF-8");
                    String c = new String(response.getString("3").getBytes("ISO-8859-1"), "UTF-8");
                    String d = new String(response.getString("4").getBytes("ISO-8859-1"), "UTF-8");
                    String e = new String(response.getString("5").getBytes("ISO-8859-1"), "UTF-8");
                    download_url_1 = new String(response.getString("6").getBytes("ISO-8859-1"), "UTF-8");
                    download_url_2 = new String(response.getString("7").getBytes("ISO-8859-1"), "UTF-8");
                    download_url_3 = new String(response.getString("8").getBytes("ISO-8859-1"), "UTF-8");
                    download_url_4 = new String(response.getString("9").getBytes("ISO-8859-1"), "UTF-8");
                    download_url_5 = new String(response.getString("10").getBytes("ISO-8859-1"), "UTF-8");
                    download_url_6 = new String(response.getString("11").getBytes("ISO-8859-1"), "UTF-8");
                    download_url_7 = new String(response.getString("12").getBytes("ISO-8859-1"), "UTF-8");
                    download_url_8 = new String(response.getString("13").getBytes("ISO-8859-1"), "UTF-8");

                    txt_a.setText(a.toString());
                    txt_b.setText(b.toString());
                    txt_c.setText(c.toString());
                    txt_d.setText(d.toString());
                    txt_e.setText(e.toString());

                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(context.getApplicationContext(),
                            "Error: " + e.getMessage(),
                            Toast.LENGTH_LONG).show();
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                hidepDialog();
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d(TAG, "Error: " + error.getMessage());
                Toast.makeText(context.getApplicationContext(),
                        error.getMessage(), Toast.LENGTH_SHORT).show();
                // hide the progress dialog
                hidepDialog();
            }
        });

        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(jsonObjReq);
    }

    private void showpDialog() {
        if (!pDialog.isShowing())
            pDialog.show();
    }

    private void hidepDialog() {
        if (pDialog.isShowing())
            pDialog.dismiss();
    }

}
