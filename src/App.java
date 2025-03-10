public class App {
    public static void main(String[] args) throws Exception {


        Directions direction = Directions.SOUTH; // Creating an object of the enum and assigning it a specific constant SOUTH
        System.out.println(direction); // Printing that constant. The result will be the same as above

        // Demonstration of the different enum methods 
        System.out.println(direction.toString()); // Prints the name of the constant
        System.out.println(direction.name()); // Prints the name of the constant
        System.out.println(direction.ordinal()); // Prints the index of the constant, which here is 1, as everything starts from 0
        System.out.println(direction.getClass()); // Prints the class of the constant, which is the enum Directions
        System.out.println(direction.getDeclaringClass()); // Prints the class of the constant, which is the enum Directions
        System.out.println(direction.hashCode()); // Prints the hashcode of the constant
        System.out.println(direction.compareTo(Directions.SOUTH)); // Compares the constant with another constant. If they are the same, it will return 0
        System.out.println(direction.equals(Directions.NORTH)); // Compares the constant with another constant. If they are the same, it will return true



        System.out.println(EnumExample.Days.FRIDAY); // Accessing the constant FRIDAY from the enum Days that is inside the class EnumExample

        System.out.println(EnumExample.Books.ALICE_IN_WONDERLAND); // Same as above but with the enum Books
        
        System.out.println(EnumExample.Books.ALICE_IN_WONDERLAND.getAuthor());

        // OR

        EnumExample.Books alice = EnumExample.Books.ALICE_IN_WONDERLAND; // Creating an object of the enum Books and assigning it a specific constant THE_ADVENTURES_OF_HUCK_FINN
        System.out.println(alice.getAuthor());
        System.out.println(alice.getPages());
        System.out.println(alice.getPrice());
        
        

    }
}
