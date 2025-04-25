import java.util.Scanner;

public class CalculadoraDeConsola {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = leerNumero(sc, "Ingresa el primer valor:");
        double b = leerNumero(sc, "Ingresa el segundo valor:");
        String op = leerOperacion(sc);

        if (op == "/" && b == 0) {
       
            System.out.println("no se puede hacer , ya que es por 0 ");
            return;
        
    }
        double resultado = calcular(a, b, op);
        mostrarResultado(resultado);
    }

    public static double leerNumero(Scanner sc, String mensaje) {
        System.out.println(mensaje);
        return sc.nextDouble();
    }

    public static String leerOperacion(Scanner sc) {
        String entrada = "";
        boolean valido = false;

        while (!valido) {
            System.out.println("Ingrese operación (+, -, *, /):");
            entrada = sc.next();
            switch (entrada) {
                case "+":
                case "-":
                case "*":
                case "/":
                    valido = true;
                    break;
                default:
                    System.out.println("no se ppuede realizar la opercacion intente otra vez c:");
            }
        }

        return entrada;
    }

    public static double calcular(double a, double b, String op) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                return 0;
        }
    }

    public static void  mostrarResultado(double resultado) {
        System.out.println("Resultado: " + resultado);
    }
}
