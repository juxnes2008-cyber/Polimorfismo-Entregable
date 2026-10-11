public class Vehiculo {

    private String marca;
    private String modelo;
    private int año;

 public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

      public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAnio(int año) {
        this.año = año;
    }

    public double calcularMantenimiento() {
        return 100000;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " (" + año + ")";
    }





}
