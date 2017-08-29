package com.xyz.arodrigu46.xyzenterprise;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
    private Resources resources;
    private TextView res;
    private Spinner material;
    private String mat[];
    private Spinner dije;
    private String dij[];
    private Spinner tipo;
    private String tip[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        res = (TextView) findViewById(R.id.txtValor);
        resources  = this.getResources();

        material = (Spinner)findViewById(R.id.cmbMaterial);
        mat = resources.getStringArray(R.array.material);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, mat);
        material.setAdapter(adapter);

        dije = (Spinner)findViewById(R.id.cmbDije);
        dij = resources.getStringArray(R.array.dije);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, dij);
        dije.setAdapter(adapter2);

        tipo = (Spinner)findViewById(R.id.cmbTipo);
        tip = resources.getStringArray(R.array.tipo);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, tip);
        tipo.setAdapter(adapter3);


    }
    public void calcular(View v){
        res.setText("20");
    }
}
