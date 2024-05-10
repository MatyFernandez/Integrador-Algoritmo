public class Metodos {
    public static int contarImpares(int lista[]) {
        int impares = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 != 0) {
                impares++;
            }
        }
        return impares;
    }

    public static String mostrarConsecutivos(int lista[]) {
    StringBuilder result = new StringBuilder();
    if (lista.length == 0) {
        result.append("La lista está vacía.");
        return result.toString();
    }
    
    for (int i = 1; i < lista.length; i++) {
        if (lista[i] == lista[i - 1] + 1) {
            if (result.length() > 0) {
                result.append(",");
            }
            result.append(lista[i - 1]).append(",").append(lista[i]);
        }
    }
    return result.length() > 0 ? result.toString() : "No hay números consecutivos.";
}
}