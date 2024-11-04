package com.example.atv10_exrc1.controller;
//Otávio Gabriel Ribeiro Scabio - RA: 1110482223043
import com.example.atv10_exrc1.model.Circulo;

public class GeometriaCirculo implements IGeometriaController<Circulo> {

    @Override
    public float CalcArea(Circulo circulo) {
        float raio = circulo.getRaio();
        float pi = 3.14159f;
        float A = pi * (raio*raio);
        return A;
    }

    @Override
    public float CalcPer(Circulo circulo) {
        float raio = circulo.getRaio();
        float pi = 3.14159f;
        float P = 2 * pi * raio;
        return P;
    }
}
