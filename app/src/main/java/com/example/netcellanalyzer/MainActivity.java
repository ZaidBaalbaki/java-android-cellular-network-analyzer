package com.example.netcellanalyzer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.razerdp.widget.animatedpieview.AnimatedPieView;
import com.razerdp.widget.animatedpieview.AnimatedPieViewConfig;
import com.razerdp.widget.animatedpieview.callback.OnPieSelectListener;
import com.razerdp.widget.animatedpieview.data.IPieInfo;
import com.razerdp.widget.animatedpieview.data.SimplePieInfo;


public class MainActivity extends AppCompatActivity {

    TextView operator;
    TextView snr;
    TextView frequency;
    TextView cell;
    TextView time;
    Button sync;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operator = findViewById(R.id.opEdit);
        snr = findViewById(R.id.snrEdit);
        frequency = findViewById(R.id.freqEdit);
        cell = findViewById(R.id.cellidEdit);
        time = findViewById(R.id.timeEdit);
        sync = findViewById(R.id.syncButton);

        drawPie();
        drawPie2();
        drawPie3();

    }
    public void drawPie() {
        AnimatedPieView mAnimatedPieView = findViewById(R.id.animatedPieView);
        AnimatedPieViewConfig config = new AnimatedPieViewConfig();
        config.startAngle(-90)// Starting angle offset
                .addData(new SimplePieInfo(230, Color.parseColor("#58508d"), "Alfa")).pieRadius(150) //Data (bean that implements the IPieInfo interface)
                .addData(new SimplePieInfo(110, Color.parseColor("#bc5090"), "Touch")).drawText(true)
                .duration(1200).textSize(40);// draw pie animation duration
        config.selectListener(new OnPieSelectListener<IPieInfo>() {
            @Override
            public void onSelectPie(@NonNull IPieInfo pieInfo, boolean isFloatUp) {
                Toast.makeText(MainActivity.this, pieInfo.getDesc() + " - " + pieInfo.getValue(), Toast.LENGTH_SHORT).show();
            }
        });

// The following two sentences can be replace directly 'mAnimatedPieView.start (config); '
        mAnimatedPieView.applyConfig(config);
        mAnimatedPieView.start();

    }
    public void drawPie2() {
        AnimatedPieView mAnimatedPieView = findViewById(R.id.animatedPieView2);
        AnimatedPieViewConfig config = new AnimatedPieViewConfig();
        config.startAngle(-90)// Starting angle offset
                .addData(new SimplePieInfo(230, Color.parseColor("#58508d"), "LTE"))
                .addData(new SimplePieInfo(300, Color.parseColor("#bc5090"), "3G")) //Data (bean that implements the IPieInfo interface)
                .addData(new SimplePieInfo(20, Color.parseColor("#ff6361"), "2G")).drawText(true)
                .duration(1200).textSize(40).autoSize(true);// draw pie animation duration
        config.selectListener(new OnPieSelectListener<IPieInfo>() {
            @Override
            public void onSelectPie(@NonNull IPieInfo pieInfo, boolean isFloatUp) {
                Toast.makeText(MainActivity.this, pieInfo.getDesc() + " - " + pieInfo.getValue(), Toast.LENGTH_SHORT).show();
            }
        });

// The following two sentences can be replace directly 'mAnimatedPieView.start (config); '
        mAnimatedPieView.applyConfig(config);
        mAnimatedPieView.start();

    }
    public void drawPie3() {
        AnimatedPieView mAnimatedPieView = findViewById(R.id.animatedPieView3);
        AnimatedPieViewConfig config = new AnimatedPieViewConfig();
        config.startAngle(-90)// Starting angle offset
                .addData(new SimplePieInfo(100, Color.parseColor("#58508d"), "LTE"))
                .addData(new SimplePieInfo(500, Color.parseColor("#bc5090"), "3G")) //Data (bean that implements the IPieInfo interface)
                .addData(new SimplePieInfo(200, Color.parseColor("#ff6361"), "2G")).drawText(true)
                .duration(1200).textSize(40).autoSize(true);// draw pie animation duration
        config.selectListener(new OnPieSelectListener<IPieInfo>() {
            @Override
            public void onSelectPie(@NonNull IPieInfo pieInfo, boolean isFloatUp) {
                Toast.makeText(MainActivity.this, pieInfo.getDesc() + " - " + pieInfo.getValue(), Toast.LENGTH_SHORT).show();
            }
        });

// The following two sentences can be replace directly 'mAnimatedPieView.start (config); '
        mAnimatedPieView.applyConfig(config);
        mAnimatedPieView.start();

    }
}