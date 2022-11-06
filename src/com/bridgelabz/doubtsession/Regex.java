package com.bridgelabz.doubtsession;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex
{
      public static void main(String[] args)
    {
        Pattern pattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
        Matcher matcher = pattern.matcher("Nagraj.Subhash.Panchal@gmail.com");
        Pattern pattern1 = Pattern.compile("^([a-zA-Z0-9]+[@][a-z]+[\\.][a-z]{2,3})$");
        Matcher matcher1 = pattern1.matcher("Nagraj@gmail.com");
        Pattern pattern2 = Pattern.compile("^([a-zA-Z0-9]{3}[\\.]{2})$");
        Matcher matcher2 = pattern2.matcher("aB1..");
        Pattern pattern3 = Pattern.compile("^([a-z]*[A-Z]{1})$");
        Matcher matcher3 = pattern2.matcher("aA");

        boolean matchFound = matcher.find();
        if(matchFound)
        {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        // min 4 char name
//@symbol
//and .com and .in extension
//    [a-z]*[@]+[\.]+[a-z]{0-3}

        //US Phone Number
//    [0-9]{10}
    }

}
/* <dependencies>
        <!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.31</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api -->
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
<version>5.9.1</version>
            <scope>test</scope>
        </dependency>
        <!-- https://mvnrepository.com/artifact/junit/junit -->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>test</scope>
        </dependency>

    </dependencies> */

