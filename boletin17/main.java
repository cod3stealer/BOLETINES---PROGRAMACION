package boletin17;

public class main {
    public static void main(String[] args) {
        // Crear personas
        persona persona1 = new persona("Juan", "Gomez", "12345678A");
        persona persona2 = new persona("Maria", "Perez", "87654321B");

        // Crear cuentas
        conta cuenta1 = new cuentaCorriente(persona1, 123456789,'a');
        conta cuenta2 = new cuentaAhorro(persona2, 987654321, 2.0, 1000,'b');

        // Realizar operaciones
        cuenta1.ingresar(2000);
        cuenta1.retirar(500);
        cuenta1.actualizarSaldo();

        cuenta2.ingresar(1500);
        cuenta2.retirar(200);
        cuenta2.actualizarSaldo();

        // Mostrar información de las cuentas
        System.out.println(cuenta1);
        System.out.println(cuenta2);
    }
}
