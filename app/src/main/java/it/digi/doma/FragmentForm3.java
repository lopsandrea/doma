package it.digi.doma;

import android.annotation.SuppressLint;
import android.arch.lifecycle.ViewModelProviders;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

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
    String sesso;
    String sesso1;


    int statoeta=0;
    int statosono=0;
    int statotipo=0;
    int statofumo=0;
    int statosesso=0;
    int statotot=0;
    Boolean cazzo1;
    Boolean cazzo2;
    Boolean cazzo3;
    Boolean cazzo4;
    Boolean cazzo5;
    double percert;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_form3, container, false);
        model = ViewModelProviders.of(getActivity()).get(FormViewModel.class);

        View aaaView = rootView.findViewById(R.id.button);
        aaaView.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
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
                sesso= model.getSesso();
                sesso1= model.getSesso1();

                Log.e("cairo2 "," "+eta);

                cazzo1=eta.equals(eta1);
                Log.e("cazzo1 "," "+cazzo1);
                cazzo2=sono.equals(sono1);
                cazzo3=tipo.equals(tipo1);
                cazzo4=fumo.equals(fumo1);
                cazzo5 = sesso.equals(sesso1);

                if (Boolean.TRUE.equals(cazzo1)){
                    statoeta=1;
                    Log.e("cazzo222 "," "+statoeta);
                }
                if (Boolean.TRUE.equals(cazzo2)){
                    statosono=1;
                }
                if (Boolean.TRUE.equals(cazzo3)){
                    statotipo=1;
                }
                if (Boolean.TRUE.equals(cazzo4)){
                    statofumo=1;
                }
                if (Boolean.TRUE.equals(cazzo5)){
                    statosesso=1;
                }

                statotot= statoeta+statotipo+statosono+statofumo+statosesso;
                Log.e("cazzo "," "+statotot);

                percert= (statotot*100)/5;
                Log.e("aaa "," "+percert);

                int percent = ((int) percert);

                ProgressBar mProgress = rootView.findViewById(R.id.progressBar);
                mProgress.setProgress(percent);

                TextView mtext = rootView.findViewById(R.id.textView);
                mtext.setText(""+percent+"%" +
                        "Compatibile");

            }
        });
        View continueView = rootView.findViewById(R.id.button1);
        continueView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextPage();
            }
        });
        return rootView;

    }
}
