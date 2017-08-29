package com.xyz.arodrigu46.xyzenterprise;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {
    private Resources resources;
    private TextView res;
    private EditText txtUnidades;
    private Spinner material;
    private String mat[];
    private Spinner dije;
    private String dij[];
    private Spinner tipo;
    private String tip[];
    private RadioButton rbcop;
    private RadioButton rbusd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        rbcop = (RadioButton) findViewById(R.id.rbcop);
        rbusd = (RadioButton) findViewById(R.id.rbusd);

        txtUnidades = (EditText) findViewById(R.id.txtUnidades);
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
    public void calcular(View v) {

        if (validar()) {
            Double resultado;
            Double unidades = Double.parseDouble(txtUnidades.getText().toString());
            int coin=1;
            if(rbcop.isChecked()==true){
                coin = 1;
            }if(rbusd.isChecked()==true){
                coin=3200;
            }
            int pmat = material.getSelectedItemPosition();
            int pdij = dije.getSelectedItemPosition();
            int ptip = tipo.getSelectedItemPosition();
            if(pmat==0 && pdij==1 && (ptip==0 || ptip==2)){


                resultado = (unidades*320000/coin);
                res.setText(String.valueOf(resultado));

            }
            if(pmat==0 && pdij==1 && ptip==3){


                resultado = (unidades*256000/coin);
                res.setText(String.valueOf(resultado));

            }
            if(pmat==0 && pdij==1 && ptip==4){


                resultado = (unidades*224000/coin);
                res.setText(String.valueOf(resultado));

            }
            if(pmat==0 && pdij==0 && (ptip==0 || ptip==2)){


                resultado = (unidades*384000/coin);
                res.setText(String.valueOf(resultado));

            }
            if(pmat==0 && pdij==0 && ptip==3){


                resultado = (unidades*320000/coin);
                res.setText(String.valueOf(resultado));

            }
            if(pmat==0 && pdij==0 && ptip==4){


                resultado = (unidades*288000/coin);
                res.setText(String.valueOf(resultado));

            }
            if(pmat==1 && pdij==1 && (ptip==0 || ptip==2)){


                resultado = (unidades*288000/coin);
                res.setText(String.valueOf(resultado));

            }
            if(pmat==1 && pdij==1 && ptip==3){


                resultado = (unidades*224000/coin);
                res.setText(String.valueOf(resultado));

            }
            if(pmat==1 && pdij==1 && ptip==4){


                resultado = (unidades*160000/coin);
                res.setText(String.valueOf(resultado));

            }
            if(pmat==1 && pdij==0 && (ptip==0 || ptip==2)){


                resultado = (unidades*352000/coin);
                res.setText(String.valueOf(resultado));

            }
            if(pmat==1 && pdij==0 && ptip==3){


                resultado = (unidades*288000/coin);
                res.setText(String.valueOf(resultado));

            }
            if(pmat==1 && pdij==0 && ptip==4){


                resultado = (unidades*256000/coin);
                res.setText(String.valueOf(resultado));

            }
            if(ptip==1){
                Toast.makeText(this, resources.getString(R.string.error02),Toast.LENGTH_SHORT).show();
            }

        }
    }
    public boolean validar(){
        if(txtUnidades.getText().toString().isEmpty() || txtUnidades.getText().toString().equals("0")){
            Toast.makeText(this, resources.getString(R.string.error00),Toast.LENGTH_SHORT).show();
            return false;
        }
        else{
            if(rbcop.isChecked()!=true && rbusd.isChecked()!=true){
                Toast.makeText(this, resources.getString(R.string.error01),Toast.LENGTH_SHORT).show();
                return false;
            }else{
                return true;
            }
        }
    }
}
