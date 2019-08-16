public class StringDemo {
    public static void main(String[] args) {

        // -------------Length-------------

        // strings have a method to determine length
        String ninja = "Coding Dojo is Awesome!";
        int length = ninja.length();
        System.out.println( "String Length is : " + length );
        // outputs 23

        // -------------Concatenate-------------

        // concatenating a string results in a new string
        String string1 = "My name is ";
        String string2 = "Michael";
        String string3 = string1.concat(string2);
        System.out.println(string3);
        // will output My name is Michael

        // use + to overload and concat also
        System.out.println("Welcome," + " ninja" + "!"); 
        // displays "Welcome, ninja!"

        // -------------Format-------------

        String ninjaJack = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.0);
        System.out.println(ninjaJack);
        // Will print out Hi Jack, you owe me $25.00 !
        // Where %s is expecting a string
        // And %.2f is expecting a float data type. The value 2 will just place two values to right of the decimal point.

        // -------------IndexOf-------------

        // The indexOf method searches left-to-right inside the given string for a "target" string. The indexOf() method returns the index number where the target string is first found or -1 if the target is not found.
        String ninjaDojo = "Welcome to Coding Dojo!";
        int a = ninjaDojo.indexOf("Coding"); // a is 11
        int b = ninjaDojo.indexOf("co"); // b is 3
        int c = ninjaDojo.indexOf("pizza"); // c is -1, "pizza" is not found
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);
        System.out.println("The value of c is " + c);

        // -------------Trim-------------

        // The trim() method removes any trailing or leading white spaces from the string.
        String sentence = "   spaces everywhere!   ";
        System.out.println(sentence.trim());

        // -------------Upper/Lowercase-------------

        // The String class provides methods to lowercase and uppercase strings.
        String d = "HELLO";
        String f = "world";
        System.out.println(d.toLowerCase()); // hello
        System.out.println(f.toUpperCase()); // WORLD

        // -------------Equality-------------

        // We can compare the equality of a string in two ways. Do they refer to the exact same object, or do they have the same exact sequence of characters.
        String x = new String("word");
        String y = new String("word");
        System.out.println(x == y); // false. not the same exact object.
        System.out.println(x.equals(y)); // true. same exact characters.
    }
}
