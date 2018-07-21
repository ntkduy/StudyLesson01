package ntkduy1604.com.studylesson01;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ntkduy1604.com.studylesson01.databinding.FragmentBpmBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class BpmFragment extends Fragment {
    FragmentBpmBinding _binding;

    public static BpmFragment newInstance() {
        return new BpmFragment();
    }

    public BpmFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        _binding = DataBindingUtil.inflate(inflater, R.layout.fragment_bpm, container, false);

        return _binding.getRoot();
    }

}
