package modelo;

public class Propiedad {
    protected String direccion;
    protected double valorTasacion;
    protected int cantAmbientes;
    protected double metrosCuadradosCubiertos;
    protected double metrosCuadradosTotales;
    
    public Propiedad(String direccion, double valorTasacion, int cantAmbientes, double metrosCuadradosCubiertos, double metrosCuadradosTotales){
        this.direccion = direccion;
        this.valorTasacion = valorTasacion;
        this.cantAmbientes = cantAmbientes;
        this.metrosCuadradosCubiertos = metrosCuadradosCubiertos;
        this.metrosCuadradosTotales = metrosCuadradosTotales;
    }
    
    public Propiedad(){
        this.direccion = "";
        this.valorTasacion = 0.0;
        this.cantAmbientes = 0;
        this.metrosCuadradosCubiertos = 0.0;
        this.metrosCuadradosTotales = 0.0;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setValorTasacion(double valorTasacion) {
        this.valorTasacion = valorTasacion;
    }

    public void setCantAmbientes(int cantAmbientes) {
        this.cantAmbientes = cantAmbientes;
    }

    public void setMetrosCuadradosCubiertos(double metrosCuadradosCubiertos) {
        this.metrosCuadradosCubiertos = metrosCuadradosCubiertos;
    }

    public void setMetrosCuadradosTotales(double metrosCuadradosTotales) {
        this.metrosCuadradosTotales = metrosCuadradosTotales;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getValorTasacion() {
        return valorTasacion;
    }

    public int getCantAmbientes() {
        return cantAmbientes;
    }

    public double getMetrosCuadradosCubiertos() {
        return metrosCuadradosCubiertos;
    }

    public double getMetrosCuadradosTotales() {
        return metrosCuadradosTotales;
    }

    @Override
    public String toString() {
        return "Inmueble{" + "direccion=" + direccion + ", valorTasacion=" + valorTasacion + ", cantAmbientes=" + cantAmbientes + ", metrosCuadradosCubiertos=" + metrosCuadradosCubiertos + ", metrosCuadradosTotales=" + metrosCuadradosTotales + '}';
    }
    
    
}
