package com.rapacon.igna.multipleactivityservices;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = new Intent(this,MyService.class);
        startService(i);

    }

    public void option(View v) {
        Intent i = null, chooser = null;

        if (v.getId() == R.id.btntoscreen2) {
            i = new Intent(this, Main2Activity.class);
            startActivity(i);

        } else if (v.getId() == R.id.btntomap) {
            i = new Intent(Intent.ACTION_VIEW);

            i.setData(Uri.parse("geo:14.534871, 121.050994"));
            chooser = Intent.createChooser(i, "Maps");
            startActivity(chooser);

        } else if (v.getId() == R.id.btntoweb) {
            i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ust.edu.ph"));
            startActivity(i);
        }
    }
}
