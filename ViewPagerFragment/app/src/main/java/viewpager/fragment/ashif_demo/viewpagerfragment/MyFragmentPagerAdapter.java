package viewpager.fragment.ashif_demo.viewpagerfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter{
	
	final int PAGE_COUNT = 2;

	public MyFragmentPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int pos) {

        if (pos == 0){
            ViewFirst firstFragment = new ViewFirst();
            //to send data

//		    Bundle data = new Bundle();
//		    data.putInt("current_page", arg0+1);
//		    firstFragment.setArguments(data);
		    return firstFragment;
        }else{
            ViewSecond secondFragment = new ViewSecond();

            //to send data
//		    Bundle data = new Bundle();
//		    data.putInt("current_page", arg0+1);
//		    secondFragment.setArguments(data);
            return secondFragment;
        }
	}


	@Override
	public int getCount() {		
		return PAGE_COUNT;
	}
	
	@Override
	public CharSequence getPageTitle(int position) {		
		return "ViewPager " + ( position + 1 );
	}

	
}
