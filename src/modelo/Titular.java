package modelo;

public class Titular {

    protected String nombre;
    protected String Apellido;
    protected long dni;
    protected long telefono;
    protected String mail;
    protected long cuil;
    protected long cuit;
    protected double ingresoMensual;

    public Titular() {
        this.nombre = "";
        this.Apellido = "";
        this.dni = 0;
        this.telefono = 0;
        this.mail = "";
        this.cuil = 0;
        this.cuit = 0;
        this.ingresoMensual = 0.0;
    }

    public Titular(String nombre, String Apellido, long dni, long telefono, String mail, long cuil, long cuit, double ingresoMensual) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.mail = mail;
        this.cuil = cuil;
        this.cuit = cuit;
        this.ingresoMensual = ingresoMensual;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setCuil(long cuil) {
        this.cuil = cuil;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public void setIngresoMensual(double ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public long getDni() {
        return dni;
    }

    public long getTelefono() {
        return telefono;
    }

    public String getMail() {
        return mail;
    }

    public long getCuil() {
        return cuil;
    }

    public long getCuit() {
        return cuit;
    }

    public double getIngresoMensual() {
        return ingresoMensual;
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", Apellido=" + Apellido + ", dni=" + dni + ", telefono=" + telefono + ", mail=" + mail + ", cuil=" + cuil + ", cuit=" + cuit + ", ingresoMensual=" + ingresoMensual + '}';
    }

}
