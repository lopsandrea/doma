package it.digi.doma;

import android.support.v4.app.Fragment;


public class FragmentFormBase extends Fragment {
    public void nextPage(){
        if (getActivity() != null){
            getFormActivity().nextPagerPage();
        }
    }
    public MainActivity getFormActivity() {
        return (MainActivity) getActivity();
    }

}
