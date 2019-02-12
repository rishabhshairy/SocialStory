package com.example.rishabh.socialstory;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class BirthdayActivity extends FragmentActivity {
    ImageFragmentPagerAdapter imageFragmentPagerAdapter;
    ViewPager viewPager;
    private static final Integer[] IMAGE_NAME = {R.drawable.bd1,R.drawable.bd2,R.drawable.bd3,
            R.drawable.bd4,R.drawable.bd5,R.drawable.bd6,
            R.drawable.bd7,R.drawable.bd8,R.drawable.bd9,
            R.drawable.bd10,R.drawable.bd11,R.drawable.bd12,
            R.drawable.bd13,R.drawable.bd14,R.drawable.bd15};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_pager);
        imageFragmentPagerAdapter = new ImageFragmentPagerAdapter(getSupportFragmentManager());
        viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(imageFragmentPagerAdapter);
    }

    public static class ImageFragmentPagerAdapter extends FragmentPagerAdapter {
        public ImageFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return IMAGE_NAME.length;
        }

        @Override
        public Fragment getItem(int position) {
            SwipeFragment fragment = new SwipeFragment();
            return SwipeFragment.newInstance(position);
        }
    }

    public static class SwipeFragment extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View swipeView = inflater.inflate(R.layout.swipe_fragment, container, false);
            ImageView imageView = (ImageView) swipeView.findViewById(R.id.imageView);
            Bundle bundle = getArguments();
            int position = bundle.getInt("position");
//            String imageFileName = IMAGE_NAME[position];
//            int imgResId = getResources().getIdentifier(IMAGE_NAME[position], "drawable", "com.example.rishabh.socialstory");
            imageView.setImageResource(IMAGE_NAME[position]);
            return swipeView;
        }

        static SwipeFragment newInstance(int position) {
            SwipeFragment swipeFragment = new SwipeFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("position", position);
            swipeFragment.setArguments(bundle);
            return swipeFragment;
        }
    }
}
