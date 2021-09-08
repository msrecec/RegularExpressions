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
    }
}
