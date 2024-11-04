package com.example.atv10_exrc1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.atv10_exrc1.model.Circulo;
import com.example.atv10_exrc1.controller.GeometriaCirculo;
import com.example.atv10_exrc1.controller.IGeometriaController;

//Otávio Gabriel Ribeiro Scabio - RA: 1110482223043
public class CirculoFragment extends Fragment {

    private View view;
    private EditText etRaio;
    private Button btnAreaCirc;
    private Button btnPerCirc;
    private TextView tvCirc;

    public CirculoFragment() {
        super();
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_circulo, container, false);
        etRaio = view.findViewById(R.id.etRaio);
        btnAreaCirc = view.findViewById(R.id.btnAreaCirc);
        btnPerCirc = view.findViewById(R.id.btnPerCirc);
        tvCirc = view.findViewById(R.id.tvCirc);
        tvCirc.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        btnAreaCirc.setOnClickListener(op -> CalcArea());
        btnPerCirc.setOnClickListener(op -> CalcPer());

        return view;

    }

    private void CalcPer() {
        Circulo circulo = new Circulo();
        circulo.setRaio(Float.parseFloat(etRaio.getText().toString()));
        IGeometriaController op = new GeometriaCirculo();
        float res = op.CalcPer(circulo);
        tvCirc.setText("Perímetro = "+res);
        limpaCampos();
    }

    private void CalcArea() {
        Circulo circulo = new Circulo();
        circulo.setRaio(Float.parseFloat(etRaio.getText().toString()));
        IGeometriaController op = new GeometriaCirculo();
        float res = op.CalcArea(circulo);
        tvCirc.setText("Área = "+res);
        limpaCampos();
    }

    private void limpaCampos() {
        etRaio.setText("");
    }
}