package net.shreygupta.t_1461;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        RelativeLayout r = new RelativeLayout(this);
        EditText e1 = new EditText(this);
        EditText e2 = new EditText(this);
        LinearLayout l = new LinearLayout(this);
        Button b1 = new Button(this);
        Button b2 = new Button(this);

        e1.setId(1);
        e2.setId(2);

        RelativeLayout.LayoutParams dim_r = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        RelativeLayout.LayoutParams dim_e1 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        RelativeLayout.LayoutParams dim_e2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        RelativeLayout.LayoutParams dim_l = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        LinearLayout.LayoutParams dim_b1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        LinearLayout.LayoutParams dim_b2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        dim_e2.addRule(RelativeLayout.BELOW, 1);
        dim_e2.setMargins(0, 75, 0, 0);
        dim_l.setMargins(0, 150, 0, 0);
        dim_l.addRule(RelativeLayout.BELOW, 2);
        dim_l.addRule(RelativeLayout.CENTER_HORIZONTAL);

        r.setLayoutParams(dim_r);
        e1.setLayoutParams(dim_e1);
        e2.setLayoutParams(dim_e2);
        l.setLayoutParams(dim_l);
        b1.setLayoutParams(dim_b1);
        b2.setLayoutParams(dim_b2);

        r.setPadding(150, 150, 150, 0);

        e1.setHint("USERNAME");
        e2.setHint("PASSWORD");

        b1.setText("LOG IN");
        b2.setText("REGISTER");

        l.addView(b1);
        l.addView(b2);
        r.addView(e1);
        r.addView(e2);
        r.addView(l);

        setContentView(r);

    }
}