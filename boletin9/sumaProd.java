package boletin9;

public class sumaProd {
    public static void main(String[] args) {
        int suma = 0;
        long producto = 1;

        for (int i = 10; i < 91; i++) {
            suma += i;
            producto *= i;
        }

        System.out.println("Suma de números entre 10 y 90: " + suma);
        System.out.println("Producto de números entre 10 y 90: " + producto);
    }
}
