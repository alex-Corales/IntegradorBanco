package modelo;

public class Casa extends Propiedad {

    private int antiguedad;

    public Casa() {
        super();
        this.antiguedad = 0;
    }

    public Casa(int antiguedad, String direccion, double valorTasacion, int cantAmbientes, double metrosCuadradosCubiertos, double metrosCuadradosTotales) {
        super(direccion, valorTasacion, cantAmbientes, metrosCuadradosCubiertos, metrosCuadradosTotales);
        this.antiguedad = antiguedad;
    }

    public Casa(int antiguedad, int cantAmbientes, String direccion, double valorTasacion, int cantAmbientes0, double metrosCuadradosCubiertos, double metrosCuadradosTotales) {
        super(direccion, valorTasacion, cantAmbientes, metrosCuadradosCubiertos, metrosCuadradosTotales);
        this.antiguedad = antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    @Override
    public String toString() {
        return "Casa{" + "antiguedad=" + antiguedad + '}';
    }

}
