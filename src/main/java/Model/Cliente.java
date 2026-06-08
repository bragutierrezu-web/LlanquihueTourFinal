package Model;

public class Cliente extends Persona {
    private String idioma;
    private String nacionalidad;
    private String correo;
    public Tour tour;


public Cliente() {

}

    public Cliente(String nombre, int edad, String rut, String telefono, String idioma, String nacionalidad, Tour tour) {
        super(nombre, edad, rut, telefono);
        this.idioma = idioma;
        this.nacionalidad = nacionalidad;
        this.tour = tour;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }


    @Override
    public String toString() {
        return super.toString() + "Cliente.   " +
                "idioma: " + idioma + '\'' +
                ", nacionalidad: " + nacionalidad + '\'' +
                ", tour: " + tour;
    }


}
