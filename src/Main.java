import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //ARRAY
        // Un array tiene un tamaño fijo.
        String[] arrayNames = new String[3];
        // Los elementos del array se asignan usando índices.
        arrayNames[0] = "Ana";
        arrayNames[1] = "Luis";
        arrayNames[2] = "Carlos";
        System.out.println("Array elements:");
        // Los arrays utilizan .length para obtener su tamaño.
        for (int i = 0; i < arrayNames.length; i++) {
            System.out.println(arrayNames[i]);
        }
        System.out.println();
        // ARRAYLIST
        // Un ArrayList puede aumentar o reducir su tamaño.
        ArrayList<String> arrayListNames = new ArrayList<>();
        // add() agrega nuevos elementos.
        arrayListNames.add("Ana");
        arrayListNames.add("Luis");
        arrayListNames.add("Carlos");
        // El ArrayList puede continuar creciendo.
        arrayListNames.add("Pedro");
        // set() modifica un elemento existente.
        arrayListNames.set(0, "Maria");
        // remove() elimina un elemento.
        arrayListNames.remove("Luis"); 
        System.out.println("ArrayList elements:");
        // Los ArrayList utilizan size() para obtener su tamaño
        // y get() para acceder a sus elementos.
        for (int i = 0; i < arrayListNames.size(); i++) {
            System.out.println(arrayListNames.get(i));
        }
    }
}