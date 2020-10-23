package com.example.exe2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class EXE2_calc extends AppCompatActivity {


    //Checkbox taxa
    CheckBox bx_sim;
    CheckBox bx_nao;

    //Checkbox divisão por pessoa
    CheckBox bx_qtd2;
    CheckBox bx_qtd3;
    CheckBox bx_qtd4;
    CheckBox bx_qtd5;

    //Valor total de consumo
    EditText valor_consumo;
    EditText val_total;
    EditText val_totPessoa;

    //Couvert por pessoa
    EditText couv;

    //Valor total com taxas



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_x_e2_calc);
        // passando checkbox taxa;
        bx_sim = (CheckBox) findViewById(R.id.box_taxa_sim);
        bx_nao = (CheckBox) findViewById(R.id.box_taxa_nao);
        // passando checkbox qtd Pessoas;
        bx_qtd2 = (CheckBox) findViewById(R.id.box_qtd2);
        bx_qtd3= (CheckBox) findViewById(R.id.box_qtd3);
        bx_qtd4= (CheckBox) findViewById(R.id.box_qtd4);
        bx_qtd5 = (CheckBox) findViewById(R.id.box_qtd5);
        //valores;
        valor_consumo =  (EditText)  findViewById(R.id.editText_consumoPessoa);
        couv = (EditText) findViewById(R.id.editTex_couvert);
        //resultados
        val_total = (EditText) findViewById(R.id.edit_valorTotal);
        val_totPessoa = (EditText) findViewById(R.id.editText_porPessoa);
    }

    public  void onCalcularClick(View calc){
        Double vl_consumo;
        Double vl_couv;
        Double taxa = 0.10;
        Double result_total = null;
        //Valor dividido
        Double result_porPessoa = null;

        vl_consumo = Double.parseDouble(valor_consumo.getText().toString());
        vl_couv = Double.parseDouble(couv.getText().toString());



        if(bx_sim.isChecked()){
            result_total = taxa*(vl_consumo+vl_couv);
            if (bx_qtd2.isChecked()){
                result_porPessoa = (taxa*(vl_consumo+vl_couv))/2;
            }if (bx_qtd3.isChecked()){
                result_porPessoa = (taxa*(vl_consumo+vl_couv))/3;
            }if (bx_qtd4.isChecked()){
                result_porPessoa = (taxa*(vl_consumo+vl_couv))/4;
            }if (bx_qtd5.isChecked()){
                result_porPessoa = (taxa*(vl_consumo+vl_couv))/5;
            }
        }else{
            if (bx_nao.isChecked()){
                result_total = vl_consumo+vl_couv;
                if (bx_qtd2.isChecked()){
                    result_porPessoa = (vl_consumo+vl_couv)/2;
                }if (bx_qtd3.isChecked()){
                    result_porPessoa = (vl_consumo+vl_couv)/3;
                }if (bx_qtd4.isChecked()){
                    result_porPessoa = (vl_consumo+vl_couv)/4;
                }if (bx_qtd5.isChecked()){
                    result_porPessoa = (vl_consumo+vl_couv)/5;
                }
            }
        }

        val_totPessoa.setText(result_porPessoa.toString());
        val_total.setText(result_total.toString());

    }
}