import javax.swing.JOptionPane;

public class Sumatoria {
    public static void main(String[] args) {
        // Paso 1: Solicitar al usuario el valor de n.
        String input = JOptionPane.showInputDialog("Ingrese un número entero positivo para calcular la sumatoria:");
        int n = Integer.parseInt(input);
        
        // Paso 2: Calcular la sumatoria usando un ciclo `while`.
        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }

        // Paso 3: Mostrar el resultado.
        JOptionPane.showMessageDialog(null, "La sumatoria de 1 a " + n + " es: " + sum);
    }
}
