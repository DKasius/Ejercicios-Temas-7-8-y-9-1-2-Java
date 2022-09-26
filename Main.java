import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {


        // 1. Array Unidimensional
        String perros[] = {"Doberman", "Pastor Alemán", "Dogo Argentino", "American Stardfordshire Terrier"};

        for (String i : perros) {
            System.out.println(i);
        }

        // 2. Array Bidimensional

        int array[][] = new int [2][3];
        array[0][0]= 5;
        array[0][1]= 10;
        array[0][2]= 15;

        array[1][0]= 20;
        array[1][1]= 25;
        array[1][2]= 30;


        for (int i = 0; i < array.length; i++) {
            System.out.println("Valor de i: " + i);

            for(int j = 0; j < array[1].length; j++) {
                System.out.println("Estoy en i " + i + " j " + j);
                System.out.println(array[i][j]);
            }
        }

        // 3. Vectores

        Vector<String> vector = new Vector(5, 5);
        vector.add("Serpiente");
        vector.add("León");
        vector.add("Pantera");
        vector.add("Caballo");
        vector.add("Elefante");

        vector.remove("León");
        vector.remove("Pantera");
        for (String i : vector) {
            System.out.println("Valor actual del vector: " + i);
        }

        /* 4. El problema es que si la capacidad inicial que le damos está muy por debajo de lo que vamos a necesitar
    habría que duplicar tantas veces el array subyacente que nuestra aplicación se pondría muy
    lenta, por eso siempre es preferible asignar la capacidad lo más próxima a lo que vamos a necesitar
     */

        // 5. ArrayList
        ArrayList<String> vehiculos = new ArrayList<String>();
        vehiculos.add("Porsche");
        vehiculos.add("Ferrari");
        vehiculos.add("Lamborgini");
        vehiculos.add("Maserati");

        for (String nombre : vehiculos){
            System.out.println(nombre);
        }

            // LinkedList
        LinkedList<String> vehiculos2 = new LinkedList<String>();
        vehiculos2.add("Mazda");
        vehiculos2.add("BMW");
        vehiculos2.add("Toyota");
        vehiculos2.add("Tesla");

        for (String nombre : vehiculos2){
            System.out.println(nombre);
        }
    }
}
