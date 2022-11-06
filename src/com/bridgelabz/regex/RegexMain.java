package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain
{
    static Pattern pattern = Pattern.compile("");
        public static void main(String[] args)
        {
        // Valid  1aBb23a => [0-9A-Za-z]{0,7}*,  bcc => [a-z]{3}+ ,1AAA => [0-9A-Z]{0,4}+ , 12abc => [0-9a-z]{5}
        // Invalid  111 => [1]{3} ,1a1aab => [0-9a-z]{6} , aa11 => [a-z0-9]{4}
        Matcher matcher = pattern.matcher("[a-z]");
        if(matcher.matches())
            System.out.println(true);
        else
            System.out.println(false);
    }
}
