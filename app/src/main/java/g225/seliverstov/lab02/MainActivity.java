package g225.seliverstov.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void base(View v)
    {
        EditText txt_A = findViewById(R.id.TextBoxA);
        EditText txt_B = findViewById(R.id.TextBoxB);
        TextView txt_Res = findViewById(R.id.TextViewResult);

        Button ADD = findViewById(R.id.buttonADD);
        Button SUB = findViewById(R.id.buttonSUB);
        Button MULT = findViewById(R.id.buttonMULT);
        Button DIV = findViewById(R.id.buttonDIV);
        Button SIN = findViewById(R.id.buttonSIN);
        Button COS = findViewById(R.id.buttonCOS);
        Button TAN = findViewById(R.id.buttonTAN);
        Button SQRT = findViewById(R.id.buttonSQRT);
        Button POW = findViewById(R.id.buttonPOW);

        String Action_A = txt_A.getText().toString();
        String Action_B = txt_B.getText().toString();


        float a = 0,  r = 0 , b = 0;

            try {
                a = Float.parseFloat(Action_A);
                b = Float.parseFloat(Action_B);
            }
            catch (Exception e1)
            {
               txt_Res.setText("input blocks are empty or incorrect number format is entered");
               return;
            }
        if ( a != 0 && b != 0)
            {
                if (v == ADD) r = a + b;
                if (v == SUB) r = a - b;
                if (v == MULT) r = a * b;
                if (v == DIV)
                {
                    if (b == 0)
                    {
                        txt_Res.setText("division by zero is impossible");
                        return;
                    }
                    r = a / b;
                }
                if (v == POW) r = (float) Math.pow(a, b);
                if (v == SIN) r = (float) Math.sin(a);
                if (v == COS) r = (float) Math.cos(a);
                if (v == TAN) r = (float) Math.tan(a);
                if (v == SQRT) {
                    if (a < 0) {
                        txt_Res.setText("You can't take the sqrt of a negative number");
                        return;
                    }
                    r = (float) Math.sqrt(a);
                }
            }
        String recordResult = String.valueOf(r);
        txt_Res.setText(recordResult);
    }
}