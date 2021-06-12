package com.company;

public class Main {
    static String arr[] = { "Now", "is", "the", "time",
            "for", "all", "good", "men", "to", "come", "to", "the", "aid",
            "of", "their", "country" };

    public static void main(String[] args) {
	// write your code here

        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i].compareTo(arr[j]) < 0) {
                    String t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
            System.out.println(arr[j]);
        }

       String s1 = "java";
       char ch[] = {'s', 't', 'r', 'i'};

       String s2 = new String(ch);
       String s4 = new String(ch).intern();
       String s3 = new String("Exampele");

       System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s3.length());

        Integer int1 = 2;
        Integer int2 = 2;

        String str1 = new String("Car");
        String str2 = new String("Car1");

        if(int1 == int2) {
            System.out.println("Number are equal");
        } else {
            System.out.println("Number are not equal");
        }

        if(str1.equals(str2)) {
            System.out.println("string are equal");
        } else {
            System.out.println("string are not equal");
        }

        String s5 = "Hello";
        String s6 = "Hello1";
        String s7 = "Hello2";

        System.out.println(s5.compareTo(s6));
        System.out.println(s5.compareTo(s7));
        System.out.println(s7.compareTo(s5));

        String strConcat = s6.concat(s7);

        System.out.println(s6.isEmpty());

        // trim() // toLowerCase() toUpperCase() // valueOf // replace('s', 't')
        System.out.println(String.valueOf(int1));

        System.out.println(s5.contains("llo"));

        String s8="hello";
        String s9="HELLO";
        String s10="hi";
        System.out.println(s1.equalsIgnoreCase(s2)); // returns true
        System.out.println(s1.equalsIgnoreCase(s3)); // returns false

        String helloStr= "Hello world";

        char[] ch1 = helloStr.toCharArray();
        byte[] by = helloStr.getBytes();

        for(int i = 0; i < ch1.length; i++) {
            System.out.println(ch1[i]);
        }

        for(int i = 0; i < by.length; i++) {
            System.out.println(by[i]);
        }


        // endWith(".com")

        System.out.println(helloStr.charAt(3));
        System.out.println(helloStr.substring(3));
        System.out.println(helloStr.substring(3, 7));

        String email = "abc@gmail.com";

        int atPosition = email.indexOf("@");

        System.out.println("atPostion " + atPosition);
        System.out.println(email.substring(0, atPosition));
        System.out.println(email.substring(atPosition + 1));

        String numberAsString = "true";
        boolean b = Boolean.parseBoolean(numberAsString);
        System.out.println("Convert using Boolean.parseBoolean() :: " + b);


        boolean b1 = Boolean.valueOf(numberAsString);
        System.out.println("Convert using Boolean.valueOf() :: " + b1);

        Boolean longObject = new Boolean(numberAsString);
        boolean b3 = longObject.booleanValue();
        System.out.println("Convert using new Long(String).longValue() :: " + b3);


        String str = "153.25";
        double number = Double.parseDouble(str);
        System.out.println("The number is: " + number);

        double number1 = Double.valueOf(str);
        System.out.println("The number is: " + number1);

        // Convert using new Double(String).doubleValue()
        Double doubleObject = new Double(str);
        double number2 = doubleObject.doubleValue();
        System.out.println("The number is: " + number2);


        String str9 = "1234";
        int number3 = Integer.parseInt(str9);
        System.out.println("Convert using Integer.parseInt() : " + number);

//        // Convert using Integer.valueOf()
//        int number8 = Integer.valueOf(str);
//        System.out.println("Convert using Integer.valueOf() : " + number1);
//
//        // Convert using new Integer(String).intValue()
//        int number5 = new Integer(str).intValue();
//        System.out.println("Convert using new Integer(String).intValue() : " + number2);

        charAtExample1();

        String myStr = "Hello";
        int result = myStr.codePointAt(0);
        System.out.println("codePointAt :: " + result);

        String s11 = "Hello World";
        String s12 = "Hello World";
        String s13 = "Java";
        String s14 = "Guides";
        System.out.println(s11.compareTo(s12)); // 0 because both are equal
        System.out.println(s11.compareTo(s13));
        System.out.println(s11.compareTo(s14));


        String strx = "javaguides";
        String subStr = "javaguides";

        boolean isContentEquals = strx.contentEquals(subStr);
        System.out.println("isContentEquals :: " + isContentEquals);

//        String str = "javaguides";
//        String str1 = "javaguides";
//        String str3 = "javatutorial";
//        boolean equal = str.equals(str1);
//        System.out.println(" Is both string are equal :: " + equal);


        String stry = "javaguides";
        String newStr = new String("javaguides");
        System.out.println(newStr.intern().equals(str));

        String strx1 = "javaguides";
        int x = 10;
        System.out.println(strx1.toString());

        String javaStr = "java,guides.net";
        String[] strArray = javaStr.split(",");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

        strArray = javaStr.split(",", 0);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

    }

    public static void charAtExample1() {
        String str = "Welcome to string handling guide";
        char ch1 = str.charAt(0);
        char ch2 = str.charAt(5);
        char ch3 = str.charAt(11);
        char ch4 = str.charAt(20);
        System.out.println("Character at 0 index is: " + ch1);
        System.out.println("Character at 5th index is: " + ch2);
        System.out.println("Character at 11th index is: " + ch3);
        System.out.println("Character at 20th index is: " + ch4);
    }

    // IndexOutOfBoundsException - if the index argument is negative or not less
    // than the length of this string.
    public static void charAtExample2() {
        String str = "Java Guides";
        char ch1 = str.charAt(str.length() + 1);
        System.out.println("character :: " + ch1);
    }

    // How to get first and last chanracter of the string
    public static void charAtExample3() {
        String str = "Java Guides";
        int strLength = str.length();
        // Fetching first character
        System.out.println("Character at 0 index is: " + str.charAt(0));
        // The last Character is present at the string length-1 index
        System.out.println("Character at last index is: " + str.charAt(strLength - 1));
    }





}

// java.lang.String
