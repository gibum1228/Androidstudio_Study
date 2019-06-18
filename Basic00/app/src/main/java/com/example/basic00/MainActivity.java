package com.example.basic00;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 한줄 주석 Ctrl+/ , 전체 주석 Ctrl + Shift + /
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnText = (Button)findViewById(R.id.btn_test);
        // CallBack 기술을 이용한다 > 서버와 연결되지 않았을 때 쌓인 데이터를 서버와 연결됐을 때, 그 데이터 값을 보냄
        btnText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText( context: MainActivity.this, text: "click", Toast.LENGTH_SHORT).show();
//                Log.d(tag: "sigu", msg: "btn click");
                Toast.makeText(MainActivity.this, "Test Text", Toast.LENGTH_SHORT).show(); // 토스트로 출력
            }
        });
    }
}
