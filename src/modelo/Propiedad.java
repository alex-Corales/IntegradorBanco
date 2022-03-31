package modelo;

public class Propiedad {

    protected String direccion;
    protected String valorTasacion;
    protected String cantAmbientes;
    protected String metrosCuadradosCubiertos;
    protected String metrosCuadradosTotales;

    public Propiedad() {
        this.direccion = "";
        this.valorTasacion = "";
        this.cantAmbientes = "";
        this.metrosCuadradosCubiertos = "";
        this.metrosCuadradosTotales = "";
    }

    /*
    Constructor para la carga de los archivos 
     */
    public Propiedad(String direccion, String valorTasacion, String cantAmbientes, String metrosCuadradosCubiertos, String metrosCuadradosTotales) {
        this.direccion = direccion;
        this.valorTasacion = valorTasacion;
        this.cantAmbientes = cantAmbientes;
        this.metrosCuadradosCubiertos = metrosCuadradosCubiertos;
        this.metrosCuadradosTotales = metrosCuadradosTotales;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setValorTasacion(String valorTasacion) {
        this.valorTasacion = valorTasacion;
    }

    public void setCantAmbientes(String cantAmbientes) {
        this.cantAmbientes = cantAmbientes;
    }

    public void setMetrosCuadradosCubiertos(String metrosCuadradosCubiertos) {
        this.metrosCuadradosCubiertos = metrosCuadradosCubiertos;
    }

    public void setMetrosCuadradosTotales(String metrosCuadradosTotales) {
        this.metrosCuadradosTotales = metrosCuadradosTotales;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getValorTasacion() {
        return valorTasacion;
    }

    public String getCantAmbientes() {
        return cantAmbientes;
    }

    public String getMetrosCuadradosCubiertos() {
        return metrosCuadradosCubiertos;
    }

    public String getMetrosCuadradosTotales() {
        return metrosCuadradosTotales;
    }
    
    public void mostrarDatos(){
        System.out.println("Direccion: "+direccion);
        System.out.println("Tasacion: "+valorTasacion);
        System.out.println("Ambientes: "+cantAmbientes);
        System.out.println("Metros cuadrados cubiertos: "+metrosCuadradosCubiertos);
        System.out.println("Metros cuadrados totales: "+metrosCuadradosTotales);
    }

}
