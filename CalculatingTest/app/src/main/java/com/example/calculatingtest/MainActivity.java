package com.example.calculatingtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.InputMismatchException;

public class MainActivity extends AppCompatActivity {

    private Button btnAdd;
    private Button btnMinus;
    private Button btnMul;
    private Button btnDiv;

    private TextView tvResult;

    private EditText etvNum1;
    private EditText etvNum2;

    private int num1 = 0, num2 = 0, result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = (Button)findViewById(R.id.btn_add);
        btnMinus = (Button)findViewById(R.id.btn_minus);
        btnMul = (Button)findViewById(R.id.btn_mul);
        btnDiv = (Button)findViewById(R.id.btn_div);

        btnAdd.setOnClickListener(onClickListener);
        btnMinus.setOnClickListener(onClickListener);
        btnMul.setOnClickListener(onClickListener);
        btnDiv.setOnClickListener(onClickListener);

        tvResult = (TextView)findViewById(R.id.tv_result);

        etvNum1 = (EditText)findViewById(R.id.etv_num1);
        etvNum2 = (EditText)findViewById(R.id.etv_num2);
    }

    private View.OnClickListener onClickListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
        try{
            num1 = Integer.parseInt(etvNum1.getText().toString());
            num2 = Integer.parseInt(etvNum2.getText().toString());

            if(v.getId() == R.id.btn_add){
                result = num1 + num2;
            }else if(v.getId() == R.id.btn_minus){
                result = num1 - num2;
            }else if(v.getId() == R.id.btn_mul){
                result = num1 * num2;
            }else if(v.getId() == R.id.btn_div){
                result = num1 / num2;
            }

            tvResult.setText("결과값: " + String.valueOf(result));
        }
        catch(InputMismatchException e){
            Toast.makeText(getApplicationContext(), "정수 입력", Toast.LENGTH_SHORT).show();
            tvResult.setText("에러");
            }
        catch(NumberFormatException e){
            Toast.makeText(getApplicationContext(), "나누는 값이 0", Toast.LENGTH_SHORT).show();
            tvResult.setText("에러");
        }
        catch(Exception e){
            Toast.makeText(getApplicationContext(), "알 수 없는 에러", Toast.LENGTH_SHORT).show();
            tvResult.setText("에러");
        }
        }
    };
}
