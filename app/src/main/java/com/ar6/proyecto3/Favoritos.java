package com.ar6.proyecto3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class Favoritos extends AppCompatActivity {

    private ArrayList<Pet> varPetsList = new ArrayList<Pet>();
    private RecyclerView varRvListPet;
    private CreatePet varPetsIni = new CreatePet();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        Toolbar varToolbar = findViewById(R.id.v2_ToolBar);
        setSupportActionBar(varToolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        varPetsList = varPetsIni.getVarPets();

        varRvListPet =(RecyclerView) findViewById(R.id.v2_RecycledView);

        LinearLayoutManager varLLM = new LinearLayoutManager(this);
        varLLM.setOrientation(LinearLayoutManager.VERTICAL);

        varRvListPet.setLayoutManager(varLLM);

        iniAdaptador();

    }

    public void iniAdaptador () {
        Petadapter varAdapterPet = new Petadapter(varPetsList);
        varRvListPet.setAdapter(varAdapterPet);
    }

    public void onClickImgBtn(View v){
        Intent varIntent = new Intent(this, MainActivity.class);
        //varIntent.putExtra(prmV2Name, varV1tiName.getText().toString().trim());
        startActivity(varIntent);
    }
}