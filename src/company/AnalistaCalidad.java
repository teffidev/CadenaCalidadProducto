package company;

public abstract class AnalistaCalidad {

    protected AnalistaCalidad siguienteAnalista;

    public AnalistaCalidad getSiguienteAnalista() {
        return siguienteAnalista;
    }

    public void setSiguienteAnalista(AnalistaCalidad siguienteAnalista) {
        this.siguienteAnalista = siguienteAnalista;
    }

    public abstract void validarCalidadDelProducto(Articulo articulo);

}
