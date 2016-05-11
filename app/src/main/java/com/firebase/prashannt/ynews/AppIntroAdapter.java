package com.firebase.prashannt.ynews;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by prashannt on 5/11/2016.
 */
public class AppIntroAdapter extends PagerAdapter {

    private Activity activity;
    private LayoutInflater layoutInflater;

    public AppIntroAdapter(Activity __actvity){
        this.activity=__actvity;

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view ==object;
    }

    private ImageView imageView;
    Bitmap mBitMap;

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater=(LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View viewlayout=layoutInflater.inflate(R.layout.app_intro_adapter,container,false);
        imageView=(ImageView)viewlayout.findViewById(R.id.imgDisplay);
        int [] res = {R.drawable.intro_splash,  R.drawable.intro_splash, R.drawable.intro_splash};
        imageView.setImageDrawable(activity.getResources().getDrawable(res[position]));

        (container).addView(viewlayout);

        return viewlayout;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        View view = (View)object;
        /*if((imgDisplay != null) && (imgDisplay.getDrawable() != null)) {
            ((BitmapDrawable)imgDisplay.getDrawable()).getBitmap().recycle();
        }*/

        imageView = null;
        container.removeView((RelativeLayout) object);
        view = null;
    }

}

