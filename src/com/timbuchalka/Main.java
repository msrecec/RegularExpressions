package com.timbuchalka;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String string = "I am a string. Yes, I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        // create a replacement for the entire string
        System.out.println(alphanumeric.replaceAll(".", "Y"));

        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));

        String secondString = "abcDeeeF12GhhabcDeeeiiiijkl99z";
        // create a replacement if string starts with ...
        System.out.println(secondString.replaceAll("^abcDeee", "YYY"));
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

        String thirdAlphaNumericString = "abcDeeeF12Ghhiiiijkl99z";
        // {3} indicates the number of preceding characters - in this case "eee"
        System.out.println(thirdAlphaNumericString.replaceAll("^abcDe{3}", "YYY"));
        // + indicates to replace the rest of "e"'s that come in a sequential order
        System.out.println(thirdAlphaNumericString.replaceAll("^abcDe+", "YYY"));
        // * indicates zero or more instances of the preceding character
        System.out.println(thirdAlphaNumericString.replaceAll("^abcDe*", "YYY"));
        // indicates a between 2 and 5 occurrences of a specific character
        System.out.println(thirdAlphaNumericString.replaceAll("^abcDe{2,5}", "YYY"));
        // one or more "h" with zero or more "i" followed by "j"
        System.out.println(thirdAlphaNumericString.replaceAll("h+i*j", "Y"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading </h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary</p>");

        // there can be anything before and anything after <h2>
        String h2Pattern = ".*<h2>.*";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

    }
}
