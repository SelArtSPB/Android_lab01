package g225.seliverstov.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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

        double a = 0, b = 0;
        try
        {
            a = Double.parseDouble(Action_A);
            b = Double.parseDouble(Action_B);
        }
        catch (Exception e1)
        {
         txt_Res.setText("один или оба поля пустые");
         return;
        }

        double r = 0;
        if (v == ADD) r = a + b;
        if (v == SUB) r = a - b;
        if (v == MULT) r = a * b;
        if (v == DIV)
        {
            if (b == 0)
            {
             txt_Res.setText("деление на ноль невозможно");
             return;
            }
            r = a / b;
        }
        if (v == SIN)  r =Math.sin(a);
        if (v == COS)  r = Math.cos(a);
        if (v == TAN) r = Math.tan(a);
        if (v == SQRT)
        {
            if (a < 0 || b < 0)
            {
             txt_Res.setText("нельзя взять корень от отрицательного числа");
             return;
            }
            r = Math.sqrt(a);
        }
        if (v == POW)
        {
            r = Math.pow(a, b);
        }
        String recordResult = String.valueOf(r);
        txt_Res.setText(recordResult);
    }
}