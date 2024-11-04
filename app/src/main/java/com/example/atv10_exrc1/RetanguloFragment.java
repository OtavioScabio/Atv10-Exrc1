package com.example.atv10_exrc1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.atv10_exrc1.model.Retangulo;
import com.example.atv10_exrc1.model.controller.GeometriaRetangulo;
import com.example.atv10_exrc1.model.controller.IGeometriaController;

//Otávio Gabriel Ribeiro Scabio - RA: 1110482223043
public class RetanguloFragment extends Fragment {

    private View view;
    private EditText etAltRet;
    private EditText etBaseRet;
    private Button btnAreaRet;
    private Button btnPerRet;
    private TextView tvRet;


    public RetanguloFragment() {
        super();
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_retangulo, container, false);
        etAltRet = view.findViewById(R.id.etAltRet);
        etBaseRet = view.findViewById(R.id.etBaseRet);
        btnAreaRet = view.findViewById(R.id.btnAreaRet);
        btnPerRet = view.findViewById(R.id.btnPerRet);
        tvRet = view.findViewById(R.id.tvRet);
        tvRet.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        btnAreaRet.setOnClickListener(op-> CalcArea());
        btnPerRet.setOnClickListener(op-> CalcPer());

        return view;
    }

    private void CalcPer() {
        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(Float.parseFloat(etAltRet.getText().toString()));
        retangulo.setBase(Float.parseFloat(etBaseRet.getText().toString()));
        IGeometriaController op = new GeometriaRetangulo();
        float res = op.CalcPer(retangulo);
        tvRet.setText("Perímetro = "+res);
        limparCampos();
    }

    private void CalcArea() {
        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(Float.parseFloat(etAltRet.getText().toString()));
        retangulo.setBase(Float.parseFloat(etBaseRet.getText().toString()));

        IGeometriaController op = new GeometriaRetangulo();
        float res = op.CalcArea(retangulo);
        tvRet.setText("Área = "+res);
        limparCampos();
    }

    private void limparCampos() {
        etAltRet.setText("");
        etBaseRet.setText("");

    }
}