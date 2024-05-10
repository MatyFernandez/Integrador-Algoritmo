public class App {
    public static void main(String[] args) {
        int lista[] = {27,6,14,8,9,12,13};
        System.out.println("Cantidad de números impares: " + Metodos.contarImpares(lista));
        System.out.println("Cantidad de números consecutivos: " + Metodos.mostrarConsecutivos(lista));
    }
}
