
import javax.swing.JOptionPane;
import java.util.Arrays;

public class VentanasEmergentes {
    public static void main(String[] args) {
        
        int[] numeros = new int[5]; // Creamos un arreglo de enteros para almacenar los números.

        
        for (int i = 0; i < numeros.length; i++) { // Con éste fragmento solicitamos al usuario que ingrese los cinco números.
            String input = JOptionPane.showInputDialog("Ingrese el número " + (i+1) + ":");
            numeros[i] = Integer.parseInt(input);
        }

       
        Arrays.sort(numeros); // Con éste método ordenamos los números de menor a mayor.

       
        StringBuilder mensaje = new StringBuilder("Los números ordenados de menor a mayor son: "); // Se crea el mensaje con los números ordenados de menor a mayor.
        for (int i = 0; i < numeros.length; i++) {
            mensaje.append(numeros[i]);
            if (i < numeros.length - 1) {
                mensaje.append(", ");
            }
        }

        
        JOptionPane.showMessageDialog(null, mensaje.toString()); // Aquí mostramos los números ordenados en una ventana emergente.
    }
}
