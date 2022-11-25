//package com.bridgelabz.csvfilereader;
//
//import com.opencsv.CSVReader;
//import com.opencsv.exceptions.CsvValidationException;
//
//import java.io.File;
//import java.io.IOException;
//import java.io.Reader;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
//public class OpenCSVExample
//{
//    static String CSV_FILE_PATH = "./addresses.csv";
//    public static void main(String[] args) throws IOException
//    {
//        Path path = Paths.get(CSV_FILE_PATH);
//        Reader reader = Files.newBufferedReader(path);
//        CSVReader csvReader = new CSVReader(reader);
//        String[] individualRecord;
//        try
//        {
//            while((individualRecord = csvReader.readNext()) != null)
//            {
//                System.out.println("Value1 : "+individualRecord[0]);
//                System.out.println("Value2 : "+individualRecord[1]);
//                System.out.println("Value3 : "+individualRecord[2]);
//                System.out.println("Value4 : "+individualRecord[3]);
//                System.out.println("Value5 : "+individualRecord[4]);
//                System.out.println("Value6 : "+individualRecord[5]);
//            }
//        }
//        catch(CsvValidationException e)
//        {
//            System.out.println(e);
//        }
//    }
//}
