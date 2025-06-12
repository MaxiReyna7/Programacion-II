public class Funciones {

}
    public static void mostrarSaludo() {
        System.out.println("Hola, mundo");
    }
    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }

    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static String convertirM(String texto) {
        return texto.toUpperCase();
    }

    public static void mostrarMenu() {
        System.out.println("1. Primera opción");
        System.out.println("2. Segunda opción");
        System.out.println("3. Tercera opción");
        System.out.println("4. Cuarta opción");
        System.out.println("5. Quinta opción");
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static int cuadrado(int numero) {
        return numero * numero;
    }

    public static long factorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }

    public static int sumarNumeros(int... numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }

    public static double promedio(double[] numeros) {
        if (numeros.length == 0) return 0;

        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    public static boolean buscarValor(int[] array, int valor) {
        for (int num : array) {
            if (num == valor) {
                return true;
            }
        }
        return false;
    }

    public static int contarOcurrencias(String[] array, String clave) {
        int contador = 0;
        for (String elemento : array) {
            if (elemento.equals(clave)) {
                contador++;
            }
        }
        return contador;
    }

    public static void imprimirArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] invertirArray(int[] array) {
        int[] invertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            invertido[i] = array[array.length - 1 - i];
        }
        return invertido;
    }

    public static String mejorNota(String[] nombres, double[] notas) {
        if (nombres.length == 0 || nombres.length != notas.length) return "";

        int mejorIndice = 0;
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > notas[mejorIndice]) {
                mejorIndice = i;
            }
        }
        return nombres[mejorIndice];
    }

    public static void main(String[] args) {
        // Aquí podés probar tus métodos
    }


