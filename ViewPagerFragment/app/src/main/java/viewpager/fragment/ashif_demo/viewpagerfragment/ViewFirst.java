package viewpager.fragment.ashif_demo.viewpagerfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Ashif_demo on 10/6/2014.
 */
public class ViewFirst extends Fragment {
    int mCurrentPage;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /** Getting the arguments to the Bundle object */
        //Bundle data = getArguments();

        /** Getting integer data of the key current_page from the bundle */
        // mCurrentPage = data.getInt("current_page", 0);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.viewfirst_layout, container,false);


        return v;
    }
}
