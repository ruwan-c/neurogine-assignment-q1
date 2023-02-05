import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question01 {
    public static void main(String[] args) {

        /***********      Question 01 Part a      ***************/
        /** Convert string to uppercase and join them with comma(,) **/
        System.out.println("-------- Question 01 , part a ---------");

        //sample list
        List<String> sampleList = Arrays.asList("apple", "banana", "mango", "pineapple", "grape", "lemon");

        //print input list in console
        System.out.println("Input List:" + sampleList);

        //process the list
        String output = sampleList.stream() //convert list to a stream
                .map(str -> str.toUpperCase()) //convert list string object to upper case string using map function
                .collect(Collectors.joining(",")); // collect the map output as comma separated string

        //print the output
        System.out.println("Output String: " + output);

        /***********      Question 01 Part b      ***************/
        /** Create a List with String more than 2 characters and count number of String which starts with “a” and count empty string. **/
        System.out.println("\r\n-------- Question 01 , part b ---------");

        //sample list
        List<String> sampleList2 = Arrays.asList("abc", "an", "", "apple", "bcd", "","jk");

        //print input list in console
        System.out.println("Input List:" + sampleList2);

        //process the list to generate a new list of string length more than 2
        List<String> moreThan2CharList = sampleList2.stream() //convert list to a stream
                .filter(str->str.length()>2)
                .collect(Collectors.toList());

        //print the output
        System.out.println("Output list with item having more than two characters : " + moreThan2CharList);

        //process the list to get count of empty strings
        long startWithACount = sampleList2.stream() //convert list to a stream
                .filter(str -> str.startsWith("a"))
                .count();

        //print the output
        System.out.println("Count of items starts with 'a' : " + startWithACount);

        //process the list to get count of empty strings
        long emptyStringCount = sampleList2.stream() //convert list to a stream
                .filter(str -> str.isEmpty())
                .count();

        //print the output
        System.out.println("Count of empty strings : " + emptyStringCount);

    }
}
