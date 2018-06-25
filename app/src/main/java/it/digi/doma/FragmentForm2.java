package it.digi.doma;

import android.annotation.SuppressLint;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;


@SuppressLint("ValidFragment")
class FragmentForm2 extends FragmentFormBase {
    private RadioGroup radioGroupeta;
    private RadioGroup radioGroupsono;
    private RadioGroup radioGrouptipo;
    private RadioGroup radioGroupfumo;



    public String eta1;
    public String sono1;
    public String tipo1;
    public String fumo1;
    FormViewModel model;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_form2,container,false);

        model = ViewModelProviders.of(getActivity()).get(FormViewModel.class);


        radioGroupeta = (RadioGroup) rootView.findViewById(R.id.eta);
        radioGroupeta.clearCheck();

        radioGroupeta.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton button1 = (RadioButton) group.findViewById(checkedId);
                if (null != button1 && checkedId > -1){
                    model.setEta1(button1.getText().toString());
                    Log.e("Cazzo", " "+ eta1);

                }
            }
        });

        radioGroupsono = (RadioGroup) rootView.findViewById(R.id.sono);

        radioGroupsono.clearCheck();

        radioGroupsono.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton button2 = (RadioButton) group.findViewById(checkedId);
                if (null != button2 && checkedId > -1){
                    model.setSono1(button2.getText().toString());
                    Log.e("Cazzo", " "+ sono1);
                }
            }
        });

        radioGrouptipo = (RadioGroup) rootView.findViewById(R.id.tipo);
        radioGrouptipo.clearCheck();

        radioGrouptipo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton button3 = (RadioButton) group.findViewById(checkedId);
                if (null != button3 && checkedId > -1){
                    model.setTipo1(button3.getText().toString());
                    Log.e("Cazzo", " "+ tipo1);
                }
            }
        });


        radioGroupfumo = (RadioGroup) rootView.findViewById(R.id.fumo);
        radioGroupfumo.clearCheck();

        radioGroupfumo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton button4 = (RadioButton) group.findViewById(checkedId);
                if (null != button4 && checkedId > -1){
                    model.setFumo1(button4.getText().toString());
                    Log.e("Cazzo", " "+ fumo1);
                }
            }
        });


//        getFormActivity().saveForm(
//                eta1,sono1,tipo1,fumo1
//        );

        View continueView = rootView.findViewById(R.id.review_fab);
        continueView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextPage();
            }
        });
        return rootView;
    }
}
