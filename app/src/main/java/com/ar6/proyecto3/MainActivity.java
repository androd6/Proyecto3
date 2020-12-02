package com.ar6.proyecto3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Pet> varPetsList = new ArrayList<Pet>();
    private CreatePet varPetsIni = new CreatePet();
    private RecyclerView varRvListPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Definicion del toolbar del activity
        Toolbar varToolbar = findViewById(R.id.v1_ToolBar);
        setSupportActionBar(varToolbar);

       varPetsList = varPetsIni.getVarPets();

        varRvListPet =(RecyclerView) findViewById(R.id.v1_RecycledView);

        LinearLayoutManager varLLM = new LinearLayoutManager(this);
        varLLM.setOrientation(LinearLayoutManager.VERTICAL);

        varRvListPet.setLayoutManager(varLLM);

        iniAdaptador();

    }

    public void iniAdaptador () {
        Petadapter varAdapterPet = new Petadapter(varPetsList);
        varRvListPet.setAdapter(varAdapterPet);
    }
}