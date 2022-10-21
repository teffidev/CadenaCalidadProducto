package company;

public class AnalistaPeso extends AnalistaCalidad {
    @Override
    public void validarCalidadDelProducto(Articulo articulo) {
        if (articulo.getPeso() >= 1200 && articulo.getPeso() <= 1300){
            getSiguienteAnalista().validarCalidadDelProducto(articulo);
        } else {
            System.out.println("Este articulo fue rechazado por Peso");
        }
    }
}
