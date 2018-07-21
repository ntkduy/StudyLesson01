package ntkduy1604.com.studylesson01;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;

public class BpmActivity extends BaseActivity {
    private static final String TAG = "BpmActivity";
    private static final String BPM_MEASURE_LIST_FRAG = "BPM_MEASURE_LIST_FRAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_bpm);

    }

    private void SetupFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentByTag(BPM_MEASURE_LIST_FRAG);

        if (fragment == null) {
            fragment = BpmFragment.newInstance();
        }

        addFragmentToActivity(fragmentManager,
                                fragment,
                                R.id.activity_bpm_container,
                                BPM_MEASURE_LIST_FRAG
        );


    }
}
