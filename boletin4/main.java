package boletin4;

public class main {
    public static void main(String[] args) {
        Libro obj = new Libro();

        obj.Libro();
        obj.amosar();

        obj.libro("Claudi","Claudi",2003, (short) 16);
        obj.amosar();

        obj.setAno(2008);
        obj.setTitulo("Modificado");
        obj.amosar();
    }
}
