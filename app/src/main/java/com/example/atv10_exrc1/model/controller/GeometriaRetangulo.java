package com.example.atv10_exrc1.model.controller;
//Otávio Gabriel Ribeiro Scabio - RA: 1110482223043
import com.example.atv10_exrc1.model.Retangulo;

public class GeometriaRetangulo implements IGeometriaController<Retangulo>{


    @Override
    public float CalcArea(Retangulo retangulo) {
        float b = retangulo.getBase();
        float h = retangulo.getAltura();
        float A = b*h;
        return A;
    }

    @Override
    public float CalcPer(Retangulo retangulo) {
        float b = retangulo.getBase();
        float h = retangulo.getAltura();
        float P = 2*(b+h);
        return P;
    }
}
