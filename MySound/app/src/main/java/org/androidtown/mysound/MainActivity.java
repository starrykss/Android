package org.androidtown.mysound;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    SoundPool soundf;
    Button btn;
    int tom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soundf = new SoundPool(1, AudioManager.STREAM_NOTIFICATION, 0);
        tom = soundf.load(this, R.raw.drum4, 1);
        btn = (Button)findViewById(R.id.bt11);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundf.play(tom, 1, 1, 0, 0, 1);
                // soundf.play(a, b, c, d, e, f);
                // a: int sounded - 사운드 파일을 구분하기 위한 구분자
                // b: float leftVolume - 사운드 왼쪽 볼륨(소리 크기 범위는 0과 1)
                // c: float rightVolume - 사운드 우측 볼륨(소리 크기 범위는 0과 1)
                // d: int priority - 사운드 우선 순위
                // e: int loop - 재생 반복. 1은 1회, 2는 2회, -1은 무한 반복
                // f: float rate - 재생 속도. 1은 정상 속도, -1은 느리게, 2는 빠르게
            }
        });

    }
}
