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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_form3, container, false);
        model = ViewModelProviders.of(this).get(FormViewModel.class);

        eta= model.getEta();
        sono= model.getSono();
        tipo= model.getTipo();
        fumo= model.getFumo();
        eta1= model.getEta1();
        sono1= model.getSono1();
        tipo1= model.getTipo1();
        fumo1= model.getFumo1();
        Log.e("cairo2 "," "+eta);

//        cazzo1=eta.equals(eta1);
//        Log.e("cazzo1 "," "+cazzo1);
//        cazzo2=sono.equals(sono1);
//        cazzo3=tipo.equals(tipo1);
//        cazzo4=fumo.equals(fumo1);

        if (cazzo1=true){
            statoeta++;
            Log.e("cazzo222 "," "+statoeta);
        }
        if (sono==sono1){
            statosono++;
        }
        if (tipo==tipo1){
            statotipo++;
        }
        if (fumo==fumo1){
            statofumo++;
        }

        statotot= statoeta+statotipo+statosono+statofumo;
        Log.e("cazzo "," "+statotot);




        return rootView;

    }
}
