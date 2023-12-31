package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void init() {
        // i. Crear el perfil de dos mecánicos.
        Mechanic mechanic1 = new Mechanic("Hércules", "Sánchez");
        Mechanic mechanic2 = new Mechanic("Yanira", "Fernández");

        // ii. Crear el perfil de dos vehículos con sus respectivos clientes.
        Plate plate1 = new Plate("AJK235");
        Plate plate2 = new Plate("XYZ124");

        Phone phone1 = new Phone("222-457-2351");
        Phone phone2 = new Phone("678-435-2222");

        Customer customer1 = new Customer("Customer 1", phone1);
        Customer customer2 = new Customer("Customer 2", phone2);

        Vehicle vehicle1 = new Vehicle("Make 1", "Model 1", plate1, customer1);
        Vehicle vehicle2 = new Vehicle("Make 2", "Model 2", plate2, customer2);

        vehicle1.setCustomer(customer1);
        vehicle2.setCustomer(customer2);

        // iii. Crear dos piezas en el stock del taller.
        SparePart part1 = new SparePart("Part 1", 45);
        SparePart part2 = new SparePart("Part 2", 10);

        // iv. Imprimir por pantalla todos los datos del primer mecánico.
        System.out.println("Mechanic 1: " + mechanic1.getName() + " " + mechanic1.getSurname());

        // v. Imprimir por pantalla todos los datos del segundo vehículo.
        System.out.println("Vehicle 2: " + vehicle2.getMake() + " " + vehicle2.getModel());

        // vi. Registrar una reparación que realiza el primer mecánico sobre el segundo vehículo.
        Date repairDate = new Date(); // Fecha actual
        Repair repair = new Repair(repairDate, "Mechanical Repair", 7);
        repair.addSparePart(part1);
        repair.addSparePart(part2);

        // vii. Formalizar el pago de la reparación anterior
        Payment payment = new Payment(new Date(), 150);
        repair.addPayment(payment);

        // viii. Borrar el primer vehículo.
        // (Puedes implementar un método en Vehicle o en una clase de taller para eliminar un vehículo)

        // ix. Imprimir por pantalla el número de vehículos del taller.
        List<Vehicle> vehiclesInTaller = new ArrayList<>();
        vehiclesInTaller.add(vehicle1);
        vehiclesInTaller.add(vehicle2);
        System.out.println("Número de vehículos en el taller: " + vehiclesInTaller.size());

        // x. Imprimir por pantalla toda la información de la reparación.
        System.out.println("Información de la reparación:");
        System.out.println("Fecha: " + repair.getDate());
        System.out.println("Descripción: " + repair.getDescription());
        System.out.println("Esfuerzo: " + repair.getEffort());
        System.out.println("Piezas sustituidas: " + repair.getSpareParts());
        System.out.println("Pagos realizados: " + repair.getPayments());
    }

    public static void main(String[] args) {
        init();
    }
}