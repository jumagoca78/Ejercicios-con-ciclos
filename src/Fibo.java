import javax.swing.JOptionPane;

public class Fibo {
    public static void main(String[] args) {
        // Paso 1: Solicitar al usuario el valor de n.
        String input = JOptionPane.showInputDialog("Ingrese un número entero positivo para calcular el término de Fibonacci:");
        int n = Integer.parseInt(input);

        // Paso 2: Identificar casos base de la secuencia.
        if (n == 0) {
            JOptionPane.showMessageDialog(null, "El término de Fibonacci en la posición 0 es: 0");
        } else if (n == 1) {
            JOptionPane.showMessageDialog(null, "El término de Fibonacci en la posición 1 es: 1");
        } else {
            // Paso 3: Inicializar variables para la secuencia.
            int a = 0;
            int b = 1;
            int contador = 2;
            int fibonacci = 1;

            // Paso 4: Calcular la secuencia usando un ciclo `while`.
            while (contador <= n) {
                fibonacci = a + b; // Sumar los dos últimos términos.
                a = b; // Actualizar el término anterior.
                b = fibonacci; // Actualizar el nuevo término.
                contador++; // Avanzar al siguiente número.
            }

            // Paso 5: Mostrar el resultado.
            JOptionPane.showMessageDialog(null, "El término de Fibonacci en la posición " + n + " es: " + fibonacci);
        }
    }
}
