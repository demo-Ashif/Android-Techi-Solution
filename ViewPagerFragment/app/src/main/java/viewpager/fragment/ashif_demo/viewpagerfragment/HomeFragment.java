package viewpager.fragment.ashif_demo.viewpagerfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.support.v4.view.ViewPager;
import android.view.ViewGroup;

/**
 * Created by Ashif_demo on 10/6/2014.
 */
public class HomeFragment extends Fragment {

    public HomeFragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        /** Getting a reference to the ViewPager defined the layout file */
        ViewPager pager = (ViewPager) rootView.findViewById(R.id.pager);

        /** Getting fragment manager */
        FragmentManager fm = getChildFragmentManager();

        /** Instantiating FragmentPagerAdapter */
        MyFragmentPagerAdapter pagerAdapter = new MyFragmentPagerAdapter(fm);

        /** Setting the pagerAdapter to the pager object */
        pager.setAdapter(pagerAdapter);
        return rootView;
    }
}
