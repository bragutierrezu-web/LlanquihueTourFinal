package model;

public class Tour {
    private String nombreTour;
    private String destino;
    private String duracionDias;
    private double precio;

    public Tour() {

    }


    public Tour (String nombreTour, String destino, String duracionDias, double precio ) {
        this.nombreTour = nombreTour;
        this.destino = destino;
        this.duracionDias = duracionDias;
        this.precio = precio;

    }

    public String getDuracionDias() {
        return duracionDias;
    }

    public void setDuracionDias(String duracionDias) {
        this.duracionDias = duracionDias;
    }

    public String getNombreTour() {
        return nombreTour;
    }

    public void setNombreTour(String nombreTour) {
        this.nombreTour = nombreTour;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tour.  " +
                "Nombre del Tour: " + nombreTour + '\'' +
                ", destino: " + destino + '\'' +
                ", duracionDias: " + duracionDias + '\'' +
                ", precio: " + precio +
                ".";
    }




}
