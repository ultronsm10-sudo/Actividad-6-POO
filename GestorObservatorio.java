package Activ6;

import java.util.ArrayList;

public class GestorObservatorio {

    public static void main(String[] args) {
        ArrayList<CuerpoCeleste> catalogo = new ArrayList<>();

        System.out.println("--- REGISTRANDO OBSERVACIONES EN SAN PEDRO MÁRTIR ---\n");

        CuerpoCeleste obs1 = new CuerpoCeleste(
            "Cometa Halley", 45.5, 'N', 120.0, 'E', 3, 2.5, "Años luz", "Gases y Sólidos"
        );
        catalogo.add(obs1);

        System.out.println("Intentando registrar datos inválidos...");
        CuerpoCeleste obs2Invalida = new CuerpoCeleste(
            "Asteroide B-612", 200.0, 'S', 90.0, 'O', 15, 100000, "km/s", "Sólidos"
        );
        catalogo.add(obs2Invalida);
        System.out.println();

        CuerpoCeleste obs3 = new CuerpoCeleste(
            "Cometa Halley", 48.0, 'N', 125.5, 'E', 7, 2.4, "Años luz", "Gases y Sólidos"
        );
        catalogo.add(obs3);

        System.out.println("--- CATÁLOGO DE OBSERVACIONES ---");
        for (CuerpoCeleste cuerpo : catalogo) {
            System.out.println(cuerpo.toString());
        }
        System.out.println();

        System.out.println("--- CÁLCULO DE DESPLAZAMIENTO ---");
        obs1.calcularDesplazamiento(obs3);
    }
}
