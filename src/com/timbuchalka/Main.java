package com.timbuchalka;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        // demo();

        // firstChallenge1();

        // firstChallenge2();

        // firstChallenge4();

        // firstChallenge5();

        // firstChallenge6();

        firstChallenge7();

    }

    /**
     * Write the string literal regular expression that will match the following String. User the String.matches()
     * method to verify your answer
     *
     * String challenge1 = "I want a bike."
     *
     */

    public static void firstChallenge1() {
        String patternString = "I want a bike.";
        String challenge1 = "I want a bike.";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());
    }

    /**
     * Now write a regular expression that will match "I want a bike." and "I want a ball." Verify your answer
     * using the matches() method
     *
     * Match two strings beginning with "I want a "
     *
     */

    public static void firstChallenge2() {
        String challenge1 = "I want a bike.";
        String challenge2 = "I want a ball.";

        // \w will match 0-9 a-z and underscore "_" * is a quantifier that means zero or more
        // . means any other character

        String patternString = "^I want a \\w+.$";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());
        matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches());
        // this means to match everything that starts with I want a followed by group (bike or ball) continued by any other character
        String regExp1= "^I want a (bike|ball).$";
        pattern = Pattern.compile(regExp1);
        matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());
        matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches());
    }

    /**
     * Replace all occurrences of blank with an underscore for the following string. Print out the resulting string.
     * String challenge4 = "Replace all blanks with underscores.";
     *
     */

    public static void firstChallenge4() {
        System.out.println("Replace all blanks with underscores.".replaceAll("\\s", "_"));
    }

    /**
     * Write a regular expression that will match the following string in its entirety. Use the String.matches() method
     * to verify your answer.
     *
     * String challenge5 = "aaabccccccccdddefffg";
     *
     */

    public static void firstChallenge5() {
        // String regex = "^[abcdefg]*";
        // String regex = "^[a-g]+";
        String regex = "^(a|b|c|d|e|f|g)*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("aaabccccccccdddefffg");
        System.out.println(matcher.matches());
    }

    /**
     * Write a regular expression that will only match the challenge 5 string in its entirety.
     *
     * String challenge5 = "aaabccccccccdddefffg";
     *
     */

    public static void firstChallenge6() {
        // String regex = "^[abcdefg]*";
        // String regex = "^[a-g]+";
        // String regex = "^(a|b|c|d|e|f|g){20}";
        // three a followed by b followed by 8 c followed by 3 d followed by e followed by 3 f followed by g
        String regex = "^a{3}bc{8}d{3}ef{3}g";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("aaabccccccccdddefffg");
        System.out.println(matcher.matches());
        System.out.println("aaabccccccccdddefffg".replaceAll(regex, "REPLACED"));
    }

    /**
     * Write a regular expression that will match a string that starts with a series of letters.
     * The letters must be followed by a period. After the period there must be a series of digits. The string
     * "kjisl.22" would match. The string "f5.12a" would not. Use this string to test your regular expression.
     *
     * String challenge7 = "abcd.135";
     *
     */

    public static void firstChallenge7() {

        String challenge7 = "abcd.135";
        // String regex = "^[a-zA-Z]+.[0-9]+$";
        // String regex = "^[a-zA-Z]+\\.[0-9]+$";
        String regex = "^[a-zA-Z]+\\.\\d+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(challenge7);
        System.out.println(matcher.matches());

    }

    public static void demo() {
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
        // this will replace "abcDeee" at the start of the string with "YYY"
        System.out.println(secondString.replaceAll("^abcDeee", "YYY"));
        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println(alphanumeric.matches("^abcDeeeF12Ghhiiiijkl99z"));

        // create a replacement if string ends with ...
        // this will replace "ijkl99z" at the end of the string with "YYY"
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
        // String h2Pattern = ".*<h2>.*";
        // it looks for all occurrences of <h2>
        String h2Pattern = "h2";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        /**
         * start method returns an index of first character in match and end returns index of a character
         * that occurs after the last character in the match
         *
         * You can only use the matcher once, because matcher has internal state that updates so that we have to
         * reset the matcher before we want to use it again.
         *
         */

        matcher.reset();

        int count = 0;
        while(matcher.find()) {
            count++;
            System.out.println("Occurence " + count + " : " + matcher.start() + " to " + matcher.end());
        }

        // String h2GroupPattern = "(<h2>)";
        // we want the opening tag, the closing tag and everything in between including potential <h2></h2> tags
        // String h2GroupPattern = "(<h2>.*</h2>)";
        // lazy quantifier for seperate occurrences of <h2> - it groups <h2>Something in between</h2> in seperate groups
        // so every occurrence of <h2>Something in between</h2> is printed out
        String h2GroupPattern = "(<h2>.*?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        /**
         * Group 0 is entire character sequence, group 1 is "<h2>"
         *
         *
         */

        while(groupMatcher.find()) {
            System.out.println("Occurrence: " + groupMatcher.group(1));
        }

        String h2TextGroups = "(<h2>)(.+?)(</h2>)"; // entire text in group 0 <h1> group 1 (.+?) group 2 </h2> group 3
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while(h2TextMatcher.find()) {
            System.out.println("Occurence: " + h2TextMatcher.group(2));
        }

        // "abc" "a" and "b" and "c"
        // [Hh]arry
        System.out.println("harry".replaceAll("[H|h]arry", "Larry"));
        System.out.println("Harry".replaceAll("[H|h]arry", "Larry"));

        // [^abc] all characters except abc
        String tvTest = "tstvtkt";
        // this means that we want to match all occurrences of "t" that are followed by something that isn't "v"
        // this includes only where there is some occurrence after "t"
        // String tNotVRegExp = "t[^v]";
        // this means that we wan't "t" that isn't followed by "v" -- also includes where nothing is after "t"
        String tNotVRegExp = "t(?!v)";
        Pattern tNotVPattern = Pattern.compile(tNotVRegExp);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);

        count = 0;
        while(tNotVMatcher.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
        }

        // t(?=v) all matches of "t" followed by "v" but we don't want to include "v" in the match
        /**
         * The line has to start with "(" - we have to escape it with "\"
         * {1} quantifier that indicates 1 opening parentheses
         *
         */
        // ^([\(]{1}[0-9]{3}[\)]{1}[ ]{1}[0-9]{3}[\-]{1}[0-9]{4})$
        String phone1 = "1234567890"; // Shouldn't match
        String phone2 = "(123) 456-7890"; // match
        String phone3 = "123 456-7890"; // Shouldn't match
        String phone4 = "(123)456-7890"; // Shouldn't match

        System.out.println("phone1 = " + phone1.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone2 = " + phone2.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone3 = " + phone3.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone4 = " + phone4.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));

        // ^4[0-9]{12}([0-9]{3})?$
        /**
         * This should start with 4, followed by 12 occurrences of 0-9 followed by
         * 3 optional characters in 0-9 (which are put into a group)
         *
         */
        String visa1 = "4444444444444"; // Should match
        String visa2 = "5444444444444"; // Shouldn't match
        String visa3 = "4444444444444444"; // Should match
        String visa4 = "4444"; // Shouldn't match

        System.out.println("visa1 = " + visa1.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa2 = " + visa2.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa3 = " + visa3.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa4 = " + visa4.matches("^4[0-9]{12}([0-9]{3})?$"));
    }
}

























