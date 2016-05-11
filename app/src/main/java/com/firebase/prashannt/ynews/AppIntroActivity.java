package com.firebase.prashannt.ynews;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;

import com.malinskiy.materialicons.IconDrawable;
import com.malinskiy.materialicons.Iconify;

/**
 * Created by prashannt on 5/11/2016.
 */
public class AppIntroActivity extends Activity {
    final static String TAG = AppIntroActivity.class.getSimpleName();

    private TextView dot1,dot2,dot3;
   private ViewPager introPager;
   private View diveIn;
    private AppIntroAdapter appIntroAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_intro);
        prepareIntro();
    }

    private void prepareIntro(){
        appIntroAdapter=new AppIntroAdapter(AppIntroActivity.this);
        introPager=(ViewPager)findViewById(R.id.intro_pager);
        introPager.setAdapter(appIntroAdapter);
        introPager.setCurrentItem(0);
        introPager.setOffscreenPageLimit(0);
        dot1=(TextView)findViewById(R.id.dot1);
        dot2=(TextView)findViewById(R.id.dot2);
        dot3=(TextView)findViewById(R.id.dot3);
        dot1.setCompoundDrawablesWithIntrinsicBounds(
                new IconDrawable(AppIntroActivity.this, Iconify.IconValue.zmdi_circle)
                        .color(R.color.colorAccent).sizeDp(15), null, null, null);
        dot2.setCompoundDrawablesWithIntrinsicBounds(
                new IconDrawable(AppIntroActivity.this, Iconify.IconValue.zmdi_circle_o)
                        .color(R.color.colorAccent).sizeDp(15), null, null, null);
        dot3.setCompoundDrawablesWithIntrinsicBounds(
                new IconDrawable(AppIntroActivity.this, Iconify.IconValue.zmdi_circle_o)
                        .color(R.color.colorAccent).sizeDp(15), null, null, null);

        introPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                dot1.setCompoundDrawablesWithIntrinsicBounds(new IconDrawable(AppIntroActivity.this, Iconify.IconValue.zmdi_circle_o).color(R.color.colorAccent).sizeDp(15), null, null, null);
                dot2.setCompoundDrawablesWithIntrinsicBounds(new IconDrawable(AppIntroActivity.this, Iconify.IconValue.zmdi_circle_o).color(R.color.colorAccent).sizeDp(15), null, null, null);
                dot3.setCompoundDrawablesWithIntrinsicBounds(new IconDrawable(AppIntroActivity.this, Iconify.IconValue.zmdi_circle_o).color(R.color.colorAccent).sizeDp(15), null, null, null);

                switch (position) {
                    case 0:
                        dot1.setCompoundDrawablesWithIntrinsicBounds(
                                new IconDrawable(AppIntroActivity.this, Iconify.IconValue.zmdi_circle)
                                        .color(R.color.colorAccent).sizeDp(15), null, null, null);
                        break;
                    case 1:
                        dot2.setCompoundDrawablesWithIntrinsicBounds(
                                new IconDrawable(AppIntroActivity.this, Iconify.IconValue.zmdi_circle)
                                        .color(R.color.colorAccent).sizeDp(15), null, null, null);
                        break;
                    case 2:
                        dot3.setCompoundDrawablesWithIntrinsicBounds(
                                new IconDrawable(AppIntroActivity.this, Iconify.IconValue.zmdi_circle)
                                        .color(R.color.colorAccent).sizeDp(15), null, null, null);
                        break;

                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



    }
}
