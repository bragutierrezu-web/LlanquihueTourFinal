package Model;

public class Persona {
    private String nombre;
    private String rut;
    private String telefono;
    private int edad;

    public Persona () {

    }


    public Persona (String nombre, int edad, String rut, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.rut = rut;
        this.telefono = telefono;


    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona.    " +
                "nombre: " + nombre + '\'' +
                ", rut: " + rut + '\'' +
                ", telefono: " + telefono + '\'' +
                ", edad: " + edad +
               ".    ";
    }



}
