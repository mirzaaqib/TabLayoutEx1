package com.example.nscpl_aqib.tablayoutex1;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {
    EditText tv1,tv2,tv3,tv4;
    Button button;


    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v=inflater.inflate(R.layout.fragment_fragment1, container, false);
       button= (Button) v.findViewById(R.id.bt1);
        tv1= (EditText) v.findViewById(R.id.et1);
        tv2= (EditText) v.findViewById(R.id.et2);
        tv3= (EditText) v.findViewById(R.id.et3);
        tv4= (EditText) v.findViewById(R.id.et4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=tv1.getText().toString();
                String cource=tv2.getText().toString();
                String deptt=tv3.getText().toString();
                String college=tv4.getText().toString();
                Toast.makeText(getContext(), "Details are.."+name+"+/n"+""+cource+"+/n"+deptt+"+/n"+college, Toast.LENGTH_SHORT).show();
                tv1.setText("");
                tv2.setText("");
                tv3.setText("");
                tv4.setText("");
                tv1.requestFocus();
            }
        });
        return v;

    }

}
