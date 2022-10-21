package main;

import company.Articulo;
import company.PruebaCalidad;

public class Main {
    public static void main(String[] args) {

        PruebaCalidad proceso1 = new PruebaCalidad();

        proceso1.checkArticulo(new Articulo("Jabon",1100,1200,"sano"));
        proceso1.checkArticulo(new Articulo("sdas",900,1200,"sano"));
        proceso1.checkArticulo(new Articulo("dsa",1100,2050,"sano"));
        proceso1.checkArticulo(new Articulo("dsa",1100,1200,"sodhasodhsaoid"));
        proceso1.checkArticulo(new Articulo("dsa",1100,1200,"casi sano"));

    }
}
