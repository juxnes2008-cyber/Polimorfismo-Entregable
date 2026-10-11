public class Motocicleta extends Vehiculo {

      private int cilindraje;

    public Motocicleta(String marca, String modelo, int año, int cilindraje) {
        super(marca, modelo, año);
        this.cilindraje = cilindraje;
    }

     public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public double calcularMantenimiento() {
        return super.calcularMantenimiento() * 0.5;
    }


}
