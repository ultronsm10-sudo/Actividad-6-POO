package Activ6;

public class CuerpoCeleste {
    private String nombre;
    private double latitudGrados;
    private char latitudDireccion;
    private double longitudGrados;
    private char longitudDireccion;
    private int mesObservacion; 
    private double distanciaTierra;
    private String unidadDistancia;
    private String composicion;

    public CuerpoCeleste() {}

    public CuerpoCeleste(String nombre, double latitudGrados, char latitudDireccion, 
                         double longitudGrados, char longitudDireccion, int mesObservacion, 
                         double distanciaTierra, String unidadDistancia, String composicion) {
        this.nombre = nombre;
        setLatitudGrados(latitudGrados);
        this.latitudDireccion = latitudDireccion;
        setLongitudGrados(longitudGrados);
        this.longitudDireccion = longitudDireccion;
        setMesObservacion(mesObservacion);
        this.distanciaTierra = distanciaTierra;
        this.unidadDistancia = unidadDistancia;
        this.composicion = composicion;
    }

    public void setLatitudGrados(double grados) {
        if (grados >= 0 && grados <= 180) {
            this.latitudGrados = grados;
        } else {
            System.out.println("Error: Los grados de latitud no pueden superar los 180.");
            this.latitudGrados = 0; 
        }
    }

    public void setLongitudGrados(double grados) {
        if (grados >= 0 && grados <= 180) {
            this.longitudGrados = grados;
        } else {
            System.out.println("Error: Los grados de longitud no pueden superar los 180.");
            this.longitudGrados = 0;
        }
    }

    public void setMesObservacion(int mes) {
        switch (mes) {
            case 1: case 2: case 3: case 4: case 5: case 6:
            case 7: case 8: case 9: case 10: case 11: case 12:
                this.mesObservacion = mes;
                break;
            default:
                System.out.println("Error: El mes debe estar entre 1 (Enero) y 12 (Diciembre).");
                this.mesObservacion = 1; 
                break;
        }
    }

    public void calcularDesplazamiento(CuerpoCeleste otraObservacion) {
        if (this.nombre.equalsIgnoreCase(otraObservacion.getNombre())) {
            double difLatitud = Math.abs(this.latitudGrados - otraObservacion.getLatitudGrados());
            double difLongitud = Math.abs(this.longitudGrados - otraObservacion.getLongitudGrados());
            
            System.out.println("Desplazamiento del cuerpo '" + this.nombre + "':");
            System.out.println("Diferencia en Latitud: " + difLatitud + " grados.");
            System.out.println("Diferencia en Longitud: " + difLongitud + " grados.");
            System.out.println("Tiempo entre observaciones: " + Math.abs(this.mesObservacion - otraObservacion.getMesObservacion()) + " meses.");
        } else {
            System.out.println("Error: Solo se puede calcular el desplazamiento del mismo cuerpo celeste.");
        }
    }

    public String getNombre() { return nombre; }
    public double getLatitudGrados() { return latitudGrados; }
    public double getLongitudGrados() { return longitudGrados; }
    public int getMesObservacion() { return mesObservacion; }

    public String toString() {
        return "Cuerpo Celeste: " + nombre + " | Ubicación: " + latitudGrados + "° " + latitudDireccion + 
               ", " + longitudGrados + "° " + longitudDireccion + " | Mes obs: " + mesObservacion + 
               " | Distancia: " + distanciaTierra + " " + unidadDistancia + " | Composición: " + composicion;
    }
}
