package company;

public class AnalistaLote extends AnalistaCalidad {
    @Override
    public void validarCalidadDelProducto(Articulo articulo) {
        if (articulo.getLote() >= 1000 && articulo.getLote() <= 2000) {
            getSiguienteAnalista().validarCalidadDelProducto(articulo);
        } else {
            System.out.println("Este articulo fue rechazado por Lote");
        }
    }

}
