package com.example.sacha.tp_mob;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonNext, btnDelete;
    private RecyclerView recycleView;
    private NameListAdapteur nameAdapteur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameAdapteur = new NameListAdapteur();

        initViews();
        initList();
    }

    private void initViews() {
        buttonNext = findViewById(R.id.activity_main_button_next);
        btnDelete = findViewById(R.id.activity_main_button_delete);
        recycleView = findViewById(R.id.rec);
        buttonNext.setOnClickListener(this);
        btnDelete.setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        nameAdapteur.updateData(DataManager.getInstance().getName_list());
    }

    private void initList() {
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(linearLayoutManager.VERTICAL);

        recycleView.setLayoutManager(linearLayoutManager);
        recycleView.setAdapter(nameAdapteur);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {

            if (resultCode == RESULT_OK && data.getExtras() != null) {
                Bundle args = data.getExtras();
                String username = args.getString("USERNAME");

            } else {

                //code

            }
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.activity_main_button_next:
                Intent intent = new Intent(MainActivity.this, FormActivity.class);
                startActivity(intent);
                break;
            case R.id.activity_main_button_delete:
                DataManager.getInstance().getName_list().removeAll(DataManager.getInstance().getName_list());
                nameAdapteur.updateData(DataManager.getInstance().getName_list());
                break;
        }
    }
}



