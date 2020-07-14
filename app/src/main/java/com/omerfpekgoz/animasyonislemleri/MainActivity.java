package com.omerfpekgoz.animasyonislemleri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;


// Animasyonlar	androidişletim	sisteminde	var	olan	görsel	nesneleri	hepsinde	uygulanabilir	yapılardır.
// • Androidstudioproje	dizininde	animklasörü	olarak	bulunmaktadır.
// • Yapılacak	her	bir	animasyon	xmldosyası	içerisinde	kodlanmaktadır.

//• SetAnimation :Sayfa	yüklendikten	sonra	çalışır.
// • StartAnimation : Hızlı	bir	şekilde	çalışmasını	istiyorsak	sayfa	yüklenmesi	önemsiz	ise	örneğin	butona	basılınca	çalıştırma	durumlarında	çalışır.

//• Görsel	nesnelerin	şekilsel	işlemlerde	merkezini	belirlemek	için	kullanılır.
// • Örneğin	:	pivotX=	“50%”	ve	pivotY=	“50%”	olursa	görsel	nesnenin	tam	ortasından	başlanır	ve	merkezi	olur.
// X	ve	Y	olarak	kesişim	noktası	alınır.

public class MainActivity extends AppCompatActivity {

    private Button btnBaslat;
    private Animation animationAlpha, animationScale, animationRotate, animationTranslate;

    private Button btnAlpha, btnScale, btnRotate, btnTranslate;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBaslat = findViewById(R.id.btnBaslat);
        btnAlpha = findViewById(R.id.btnAlpha);
        btnScale = findViewById(R.id.btnScale);
        btnRotate = findViewById(R.id.btnRotate);
        btnTranslate = findViewById(R.id.btnTranslate);

        animationAlpha = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animalpha);
        animationScale = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animscale);
        animationRotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animrotate);
        animationTranslate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animtranslate);

        btnBaslat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btnAlpha.startAnimation(animationAlpha);
                btnScale.startAnimation(animationScale);
                btnRotate.startAnimation(animationRotate);
                btnTranslate.startAnimation(animationTranslate);
            }
        });

    }
}
