
import java.util.Scanner;
import java.util.Vector;

/**
 * esta clase me permite agregar un valor por defecto al vector y en el momento
 * que se repita un numero predeterminado
 * sale un mensaje de error he imprime los numeros.
 * en caso tal de que el numero no este en la lista imprime el nuevo numero
 * agregado
 */

public class DynamicVector {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print(" Ingrese un numero");
        int numbers = read.nextInt();
        Vector v = new Vector();

        v.addElement(58);
        v.addElement(3);
        v.addElement(119);
        v.addElement(98);
        v.addElement(963);
        v.addElement(397);
        v.addElement(45);

        if (v.contains(numbers)) {
            System.out.print(" ya existe el numero");

        } else {

            v.add(numbers);
            System.out.print(" el numero fue agregado correctamente");

        }
        System.out.print(" Numeros" + v);

    }
}
