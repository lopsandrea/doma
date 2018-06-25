package it.digi.doma;

import android.annotation.SuppressLint;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

@SuppressLint("ValidFragment")
class FragmentForm3 extends FragmentFormBase {
    FormViewModel model;
    String eta;
    String sono;
    String tipo;
    String fumo;
    String eta1;
    String sono1;
    String tipo1;
    String fumo1;

    int statoeta=0;
    int statosono=0;
    int statotipo=0;
    int statofumo=0;
    int statotot=0;
    Boolean cazzo1;
    Boolean cazzo2;
    Boolean cazzo3;
    Boolean cazzo4;
    double percert;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_form3, container, false);
        model = ViewModelProviders.of(getActivity()).get(FormViewModel.class);

        View aaaView = rootView.findViewById(R.id.button);
        aaaView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                eta= model.getEta();
                sono= model.getSono();
                tipo= model.getTipo();
                fumo= model.getFumo();
                eta1= model.getEta1();
                sono1= model.getSono1();
                tipo1= model.getTipo1();
                fumo1= model.getFumo1();
                Log.e("cairo2 "," "+eta);

                cazzo1=eta.equals(eta1);
                Log.e("cazzo1 "," "+cazzo1);
                cazzo2=sono.equals(sono1);
                cazzo3=tipo.equals(tipo1);
                cazzo4=fumo.equals(fumo1);

                if (Boolean.TRUE.equals(cazzo1)){
                    statoeta++;
                    Log.e("cazzo222 "," "+statoeta);
                }
                if (Boolean.TRUE.equals(cazzo2)){
                    statosono++;
                }
                if (Boolean.TRUE.equals(cazzo3)){
                    statotipo++;
                }
                if (Boolean.TRUE.equals(cazzo4)){
                    statofumo++;
                }

                statotot= statoeta+statotipo+statosono+statofumo;
                Log.e("cazzo "," "+statotot);

                percert= (statotot*100)/4;
                Log.e("aaa "," "+percert);
            }
        });
        return rootView;

    }
}
