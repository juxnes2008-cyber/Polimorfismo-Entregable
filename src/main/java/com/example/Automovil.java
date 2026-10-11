public class Automovil extends Vehiculo{

     private int numeroPuertas;

    public Automovil(String marca, String modelo, int año, int numeroPuertas) {
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
    }

     public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public double calcularMantenimiento() {
        return super.calcularMantenimiento() + 150000;
    }



}