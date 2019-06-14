package com.example.visiabletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout layoutFirst;
    private LinearLayout layoutSecond;
    private LinearLayout layoutThird;

    private TextView tvCount;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutFirst = (LinearLayout)findViewById(R.id.layoutFirst);
        layoutSecond = (LinearLayout)findViewById(R.id.layoutSecond);
        layoutThird = (LinearLayout)findViewById(R.id.layoutThird);
        tvCount = (TextView)findViewById(R.id.tv_count);

        layoutFirst.setOnClickListener(clickListener);
        layoutSecond.setOnClickListener(clickListener);

    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            /*if(layoutSecond.getVisibility() == View.VISIBLE){          // 나타내기
                layoutSecond.setVisibility(View.GONE);                   // 사라지기
            }else{                                                      // 클릭시 가운데 칸 안 보이게 하기
                layoutSecond.setVisibility(View.VISIBLE);
            }*/

            tvCount.setText("count/클릭 수 = " + ++count); // 클릭한 만큼 count 값 보여주기
        }
    };

}
