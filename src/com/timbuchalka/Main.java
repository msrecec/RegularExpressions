package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        String string = "I am a string. Yes, I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        // create a replacement for the entire string
        System.out.println(alphanumeric.replaceAll(".", "Y"));

        System.out.println(alphanumeric.replaceAll("^abcDee", "YYY"));

        String secondString = "abcDeeeF12GhhabcDeeeiiiijkl99z";
        // create a replacement if string starts with ...
        System.out.println(secondString.replaceAll("^abcDee", "YYY"));
        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println(alphanumeric.matches("^abcDeeeF12Ghhiiiijkl99z"));

        // create a replacement if string ends with ...
        System.out.println(alphanumeric.replaceAll("ijkl99z$", "THE END"));
        System.out.println(alphanumeric.replaceAll("[aei]", "X"));
        System.out.println(alphanumeric.replaceAll("[aei]", "I replaced a letter here"));
        // create a replacement if one of the letters "aei" is followed by "Fj"
        System.out.println(alphanumeric.replaceAll("[aei][Fj]","X"));

        // replaces a string that contains "H" or "h" at the start and ends with "arry"
        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));

        String newAlphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        // all occurrences that are not "e" and "j"
        System.out.println(newAlphanumeric.replaceAll("[^ej]", "X"));
        // replaces all occurrences that are "abcdef345678"
        System.out.println(newAlphanumeric.replaceAll("[abcdef345678]", "X"));
        // replaces the occurrences of letters a-f, A-F, 3-8
        System.out.println(newAlphanumeric.replaceAll("[a-fA-F3-8]", "X"));
        // replaces the occurrences of letters a-f, A-F, 3-8 case insensitive -- ?i for ASCII ?iu for unicode
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[0-9]", "X"));
        // "\\d" is meant for digits so we don't have to put [0-9]
        System.out.println(newAlphanumeric.replaceAll("\\d", "X"));
        // "\\D" is meant for all non digits
        System.out.println(newAlphanumeric.replaceAll("\\D", "X"));

        String hasWhiteSpace = "I have blanks\ta tab, and also a newline\n";
        System.out.println(hasWhiteSpace);
        // "\\s" is meant for all spaces
        System.out.println(hasWhiteSpace.replaceAll("\\s",""));
        // "\t" is meant for tab character
        System.out.println(hasWhiteSpace.replaceAll("\t", "X"));
        // "\\S" is meant for all non white space characters
        System.out.println(hasWhiteSpace.replaceAll("\\S",""));
        // \\w matches a-z 0-9 and underscore _
        System.out.println(newAlphanumeric.replaceAll("\\w", "X"));
        // white space characters are not replaced
        System.out.println(hasWhiteSpace.replaceAll("\\w", "X"));
        // this matches word boundaries where X is replaced by start and end of each word seperated by whitespace
        System.out.println(hasWhiteSpace.replaceAll("\\b", "X"));

    }
}
