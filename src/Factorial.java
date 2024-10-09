import javax.swing.JOptionPane;

public class Factorial {
    public static void main(String[] args) {
        // Paso 1: Solicitar al usuario el valor de n.
        String input = JOptionPane.showInputDialog("Ingrese un número entero positivo para calcular el factorial:");
        int n = Integer.parseInt(input);
        
        // Paso 2: Calcular el factorial usando un ciclo `while`.
        int factorial = 1;
        int i = 1;

        while (i <= n) {
            factorial *= i;
            i++;
        }

        // Paso 3: Mostrar el resultado.
        JOptionPane.showMessageDialog(null, "El factorial de " + n + " es: " + factorial);
    }
}
