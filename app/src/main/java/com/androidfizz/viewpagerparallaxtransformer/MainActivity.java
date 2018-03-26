package com.androidfizz.viewpagerparallaxtransformer;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.androidfizz.viewpagerparallaxtransformer.adapter.PagerAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewPager);

        ArrayList<String> list = new ArrayList<>();

        list.add("http://naturewallpapers.biz/wp-content/uploads/2012/05/kitten.jpg");
        list.add("http://www.themountainpulse.com/wp-content/images/2011/09/IMG_0145-Copy.jpg");
        list.add("https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/eclipse_full_res_0.png");

        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), list);
        viewPager.setAdapter(adapter);

        ParallaxPageTransformer pageTransformer = new ParallaxPageTransformer();

        ParallaxPageTransformer.ParallaxTransformInformation transformInformation1 = new ParallaxPageTransformer
                .ParallaxTransformInformation(R.id.imageView,
                2,
                2);
        pageTransformer.addViewToParallax(transformInformation1);

        /*
        adding parallax to another view inside view pager
         */
        /*ParallaxPageTransformer.ParallaxTransformInformation transformInformation2 = new ParallaxPageTransformer
                .ParallaxTransformInformation(R.id.layoutContent,
                -1.95f,
                ParallaxPageTransformer.ParallaxTransformInformation.PARALLAX_EFFECT_DEFAULT);
        pageTransformer.addViewToParallax(transformInformation2);*/

        viewPager.setPageTransformer(true, pageTransformer);
    }
}
