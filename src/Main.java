import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //ARRAY
        // An array has a fixed size.
        String[] arrayNames = new String[3];
        // the array elements are assigned using an index.
        arrayNames[0] = "Ana";
        arrayNames[1] = "Luis";
        arrayNames[2] = "Carlos";
        System.out.println("Array elements:");
        // the arrays use the .lenght method to get the size
        for (int i = 0; i < arrayNames.length; i++) {
            System.out.println(arrayNames[i]);
        }
        System.out.println();
        // ARRAYLIST
        // An arrayList can increase or reduce their size
        ArrayList<String> arrayListNames = new ArrayList<>();
        // The add() method add a new element to the array.
        arrayListNames.add("Ana");
        arrayListNames.add("Luis");
        arrayListNames.add("Carlos");
        // the array list can keep increasing
        arrayListNames.add("Pedro");
        // the set() method modifies an element that is already in the array
        arrayListNames.set(0, "Maria");
        //the remove() method delete an element in the array.
        arrayListNames.remove("Luis");
        System.out.println("ArrayList elements:");
        // The arryList use the size() method to know how many element has it
        // and the get() method is used to access the array elements
        for (int i = 0; i < arrayListNames.size(); i++) {
            System.out.println(arrayListNames.get(i));
        }
    }
}