package br.com.casadocodigo.produtos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeCupons {

    private Map<String,Double> cupons;

    public GerenciadorDeCupons() {
        this.cupons = new HashMap<>();
        cupons.put("CUP74",10.0);
        cupons.put("CUP158",11.0);
        cupons.put("CUP14",12.0);
        cupons.put("CUP52",13.0);
        cupons.put("CUP21",14.0);
        cupons.put("CUP221",15.0);
    }

    public Double validaCupon(String cupom) {
        return this.cupons.get(cupom);
    }
}
