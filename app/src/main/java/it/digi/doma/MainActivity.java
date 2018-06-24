package it.digi.doma;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    PagerAdapter adapter;
    NonScrollableViewPager pager;
    FormViewModel model;
    ImageButton previous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        model = ViewModelProviders.of(this).get(FormViewModel.class);

        pager = findViewById(R.id.review_pager);
        adapter = new FormPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);
        pager.setCurrentItem(model.getPagerPosition());
        previous = findViewById(R.id.purchasePrevius);

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previousPagerPage();
            }
        });
    }

    public void saveForm(String eta, String sono, String tipo, String fumo){
        model.setEta(eta);
        model.setSono(sono);
        model.setTipo(tipo);
        model.setFumo(fumo);
    }

    public void saveForm1(String eta1, String sono1, String tipo1, String fumo1){
        model.setEta1(eta1);
        model.setSono1(sono1);
        model.setTipo1(tipo1);
        model.setFumo1(fumo1);
    }

    public void nextPagerPage() {
        Log.e("tag", model.getPagerPosition() + "");
        if (model.getPagerPosition() != 2) {
            model.setPagerPosition(model.getPagerPosition() + 1);
            pager.setCurrentItem(model.getPagerPosition());
        } else {
            finish();
        }
    }

    public void previousPagerPage(){
        if (model.getPagerPosition() != 0) {
            model.setPagerPosition(model.getPagerPosition() - 1);
            pager.setCurrentItem(model.getPagerPosition());
        }
        else{
            finish();
        }
    }
}
