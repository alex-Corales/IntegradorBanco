package modelo;

public class Departamento extends Propiedad{
    private int piso;
    private int numero;
    private String letra;
    
    public Departamento(){
        super();
        this.piso = 0;
        this.numero = 0;
        this.letra = "";
    }
    
    public Departamento(String direccion, double valorTasacion, int cantAmbientes, double metrosCuadradosCubiertos, double metrosCuadradosTotales, int piso, int numero){
        super(direccion, valorTasacion, cantAmbientes, metrosCuadradosCubiertos, metrosCuadradosTotales);
        this.piso = piso;
        this.numero = numero;
    }
    
    public Departamento(String direccion, double valorTasacion, int cantAmbientes, double metrosCuadradosCubiertos, double metrosCuadradosTotales, int piso, String letra){
        super(direccion, valorTasacion, cantAmbientes, metrosCuadradosCubiertos, metrosCuadradosTotales);
        this.piso = piso;
        this.letra = letra;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getPiso() {
        return piso;
    }

    public int getNumero() {
        return numero;
    }

    public String getLetra() {
        return letra;
    }

    @Override
    public String toString() {
        return "Departamento{" + "piso=" + piso + ", numero=" + numero + ", letra=" + letra + '}';
    }
    
    
}
