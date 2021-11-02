package modelo;

public class Garante extends Titular {

    private String firma;

    public Garante() {
        super();
        this.firma = "";
    }

    public Garante(String firma, String nombre, String Apellido, long dni, long telefono, String mail, long cuil, long cuit, double ingresoMensual) {
        super(nombre, Apellido, dni, telefono, mail, cuil, cuit, ingresoMensual);
        this.firma = firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getFirma() {
        return firma;
    }

    @Override
    public String toString() {
        return "Garante{" + "firma=" + firma + '}';
    }

}
