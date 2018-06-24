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
