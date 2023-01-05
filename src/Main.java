public class Main {
    //varargs means variable arguments. allows for multiple argument numbers of same
    public static void main(String... args) {  //String...  (varargs formant) vs String[] means that Java will take zero, one or many Strings
        // and create an array with which to process them. The array will be called 'args' of type String

        System.out.println("Hello World again");

        String[] splitStrings = "Hello World again".split(" "); //'regex' indicates the character or characters where
        //the split should take place and is non-inclusive in that the regex will not be part of the groupings created
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello"); //printText accepts single String

        System.out.println("_".repeat(20));
        printText("Hello", "World", "again"); //accepts multiple Strings

        System.out.println("_".repeat(20));
        printText();

        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",", sArray)); //accepts array of strings
    }

    private static void printText(String... textList) { //varargs format can only be used as method parameter when
        // there is only one variable argument in a method (no multiple varargs of say one for strings and one for doubles)
        //variable argument must be the last argument (not sure what this means?)
            //.join method uses a vararg as last argument which mandates the delimeter

        for (String t : textList) {
            System.out.println(t);
        }
    }
}