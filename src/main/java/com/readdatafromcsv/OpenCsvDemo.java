package com.readdatafromcsv;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class OpenCsvDemo {
    private static final String CSV_FILE_PATH = "CsvData/users.csv";

    static void readSingleRecordsInCsv() throws IOException {
        try (
                Reader reader = Files.newBufferedReader(Paths.get(CSV_FILE_PATH));
                CSVReader csvReader = new CSVReader(reader);
        ) {
            // Reading Records One by One in a String array
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                System.out.println("============SingleRecords==============");
                System.out.println("Name : " + nextRecord[0]);
                System.out.println("Email : " + nextRecord[1]);
                System.out.println("Phone : " + nextRecord[2]);
                System.out.println("Country : " + nextRecord[3]);
                System.out.println("============SingleRecords End==============");

            }
        }
    }

    static void readAllRecordsInCsv() throws IOException {
        try (
                Reader reader = Files.newBufferedReader(Paths.get(CSV_FILE_PATH));
                CSVReader csvReader = new CSVReader(reader);
        ) {
            // Reading All Records at once into a List<String[]>
            List<String[]> records = csvReader.readAll();
            for (String[] record : records) {
                System.out.println("============MultipleRecords==============");
                System.out.println("Name : " + record[0]);
                System.out.println("Email : " + record[1]);
                System.out.println("Phone : " + record[2]);
                System.out.println("Country : " + record[3]);
                System.out.println("============MultipleRecords End==============");
            }
        }
    }

    static void skipHeaderNamesInCsv() throws IOException {
        try (
                Reader reader = Files.newBufferedReader(Paths.get(CSV_FILE_PATH));
                //Skip Header Row
                CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
        ) {

            // Reading All Records at once into a List<String[]>
            List<String[]> records = csvReader.readAll();
            for (String[] record : records) {
                System.out.println("============Skip Header Names Records==============");
                System.out.println("Name : " + record[0]);
                System.out.println("Email : " + record[1]);
                System.out.println("Phone : " + record[2]);
                System.out.println("Country : " + record[3]);
                System.out.println("============Skip Header Names Records Ends==============");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        readSingleRecordsInCsv();
        readAllRecordsInCsv();
        skipHeaderNamesInCsv();
    }
}
