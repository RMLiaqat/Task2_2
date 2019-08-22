package au.edu.swin.task2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtmile,edtfeet,edtinches;
    Button btnConvert;
    Float float1,float2,float3;
    CheckBox chkb;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        chkb=(CheckBox)findViewById(R.id.checkBoxM) ;
        btnConvert=(Button) findViewById(R.id.buttonCovert);
        edtmile=(EditText)findViewById(R.id.editTextMile);
        edtfeet=(EditText)findViewById(R.id.editTextFeet);
        edtinches=(EditText)findViewById(R.id.editTextInches);
        tv=(TextView)findViewById(R.id.textViewResult);




        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtinches.getText().toString().length()==0)
                {
                    edtinches.setText("0");
                }
                if(edtmile.getText().toString().length()==0)
                {
                    edtmile.setText("0");
                }
                if(edtfeet.getText().toString().length()==0)
                {
                    edtfeet.setText("0");
                }
                float1=Float.parseFloat(edtfeet.getText().toString());

                float2=Float.parseFloat(edtmile.getText().toString());

                float3=Float.parseFloat(edtinches.getText().toString());

                tv.setText("Distance is= "+((float1*0.3048)+(float2*1609.34)+(float3*0.0254)));
            }
        });

        if(chkb.isChecked())
        {
            tv.setText("Distance is= "+((float1*30.48)+(float2*160934)+(float3*2.54)));
        }

    }


}
