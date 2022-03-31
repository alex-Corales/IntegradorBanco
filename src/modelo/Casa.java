package modelo;

public class Casa extends Propiedad {

    private String antiguedad;

    public Casa() {
        super();
        this.antiguedad = "";
    }

    /*
    Constructor para la carga de los archivos 
     */
    public Casa(String antiguedad, String direccion, String valorTasacion, String cantAmbientes, String metrosCuadradosCubiertos, String metrosCuadradosTotales) {
        super(direccion, valorTasacion, cantAmbientes, metrosCuadradosCubiertos, metrosCuadradosTotales);
        this.antiguedad = antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Direccion: " + direccion);
        System.out.println("Tasacion: " + valorTasacion);
        System.out.println("Ambientes: " + cantAmbientes);
        System.out.println("Metros cuadrados cubiertos: " + metrosCuadradosCubiertos);
        System.out.println("Metros cuadrados totales: " + metrosCuadradosTotales);
        System.out.println("Antiguedad: " + antiguedad);

    }

}
