import java.util.Random;

public class AnalisisArrays {

    
    public static int[] generarArray(int n, int maxValor) {
        int[] arreglo = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            arreglo[i] = random.nextInt(maxValor + 1);
        }

        return arreglo;
    }

    
    public static double calcularMedia(int[] arr) {
        int suma = 0;
        for (int i = 0; i < arr.length; i++) {
            suma += arr[i];
        }
        return (double) suma / arr.length;
    }

    
    public static int encontrarMaximo(int[] arr) {
        int maximo = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximo) {
                maximo = arr[i];
            }
        }
        return maximo;
    }

    
    public static int encontrarMinimo(int[] arr) {
        int minimo = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimo) {
                minimo = arr[i];
            }
        }
        return minimo;
    }

    
    public static double calcularVarianza(int[] arr) {
        double media = calcularMedia(arr);
        double sumaCuadrados = 0;

        for (int i = 0; i < arr.length; i++) {
            double diferencia = arr[i] - media;
            sumaCuadrados += diferencia * diferencia;
        }

        double varianza = sumaCuadrados / arr.length;
        return varianza; 
    }

    public static void main(String[] args) {
        int[] miArray = generarArray(10, 20); 
        System.out.println("Arreglo generado:");
        for (int i = 0; i < miArray.length; i++) {
            System.out.print(miArray[i] + " ");
        }
        System.out.println();

        System.out.println("Media: " + calcularMedia(miArray));
        System.out.println("Máximo: " + encontrarMaximo(miArray));
        System.out.println("Mínimo: " + encontrarMinimo(miArray));
        System.out.println("Varianza (no desviación estándar): " + calcularVarianza(miArray));
    }
}
