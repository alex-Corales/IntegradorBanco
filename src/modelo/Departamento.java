package modelo;

public class Departamento extends Propiedad {

    private String piso;
    private String numero;
    private String letra;

    public Departamento() {
        super();
        this.piso = "";
        this.numero = "";
        this.letra = "";
    }

    /*
    Constructor para la carga de los archivos 
     */
    public Departamento(String direccion, String valorTasacion, String cantAmbientes, String metrosCuadradosCubiertos, String metrosCuadradosTotales, String piso, String numero) {
        super(direccion, valorTasacion, cantAmbientes, metrosCuadradosCubiertos, metrosCuadradosTotales);
        this.piso = piso;
        this.numero = numero;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getPiso() {
        return piso;
    }

    public String getNumero() {
        return numero;
    }

    public String getLetra() {
        return letra;
    }

    @Override
    public void mostrarDatos(){
        System.out.println("Direccion: "+direccion);
        System.out.println("Tasacion: "+valorTasacion);
        System.out.println("Ambientes: "+cantAmbientes);
        System.out.println("Metros cuadrados cubiertos: "+metrosCuadradosCubiertos);
        System.out.println("Metros cuadrados totales: "+metrosCuadradosTotales);
        System.out.println("Piso: "+piso);
        System.out.println("Numero: "+numero);
    }

}
