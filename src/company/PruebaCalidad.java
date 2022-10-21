package company;

public class PruebaCalidad {

    AnalistaCalidad inicial;

    public PruebaCalidad() {
        this.inicial = new AnalistaLote();
        AnalistaCalidad peso = new AnalistaPeso();
        AnalistaCalidad envase = new AnalistaEnvase();

        inicial.setSiguienteAnalista(peso);
        peso.setSiguienteAnalista(envase);
    }

    public void checkArticulo(Articulo articulo) {
        inicial.validarCalidadDelProducto(articulo);
    }

}
