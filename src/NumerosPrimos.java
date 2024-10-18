import javax.swing.JOptionPane;

public class NumerosPrimos {
    public static void main(String[] args) {
        // Solicitar al usuario cuántos números primos desea ver
        String input = JOptionPane.showInputDialog("Introduce cuántos números primos deseas ver:");
        int n = Integer.parseInt(input);

        if (n <= 0) {
            JOptionPane.showMessageDialog(null, "Por favor, introduce un número mayor que 0.");
            return;
        }

        // Inicialización de variables
        String resultado = "Primeros " + n + " números primos:\n";
        int contadorPrimos = 0;
        int numero = 2;
        int contadorEnLinea = 0;

        // Bucle para encontrar los primeros 'n' números primos
        while (contadorPrimos < n) {
            boolean esPrimo = true;

            // Verificar si el número es primo
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            // Si es primo, añadirlo al resultado
            if (esPrimo) {
                resultado += numero + " ";
                contadorPrimos++;
                contadorEnLinea++;

                // Saltar a una nueva línea cada 5 números
                if (contadorEnLinea == 5) {
                    resultado += "\n";
                    contadorEnLinea = 0;
                }
            }

            numero++;
        }

        // Mostrar los resultados en una ventana emergente
        JOptionPane.showMessageDialog(null, resultado);
    }
}
