package company;

public class AnalistaEnvase extends AnalistaCalidad {
    @Override
    public void validarCalidadDelProducto(Articulo articulo) {
        if (articulo.getEnvasado().equalsIgnoreCase("sano") || articulo.getEnvasado().equalsIgnoreCase("casi sano")){
            System.out.println("Este articulo fue aceptado");
        } else {
            System.out.println("Este articulo fue rechazado por Envase");
        }
    }
}
