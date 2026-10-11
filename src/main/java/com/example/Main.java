import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

         ArrayList<Vehiculo> flota = new ArrayList<>();

        flota.add(new Automovil("Toyota", "Corolla", 2022, 4));
        flota.add(new Camion("Chevrolet", "NPR", 2020, 5.5));
        flota.add(new Motocicleta("Yamaha", "FZ", 2023, 150));
        flota.add(new Automovil("Mazda", "3", 2021, 4));

        for (Vehiculo v : flota) {
            System.out.println(v + " -> Mantenimiento: $" + v.calcularMantenimiento());
        }

        
    }
}