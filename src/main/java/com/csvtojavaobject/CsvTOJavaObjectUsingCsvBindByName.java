package com.csvtojavaobject;

import POJO.CsvUsersUsingBindByNameAnnotation;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class CsvTOJavaObjectUsingCsvBindByName {
    private static final String SAMPLE_CSV_FILE_PATH = "CsvData/users.csv";

    public static void main(String[] args) throws IOException {
        try (
                Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
        ) {
            CsvToBean csvToBean = new CsvToBeanBuilder(reader)
                    .withType(CsvUsersUsingBindByNameAnnotation.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            Iterator<CsvUsersUsingBindByNameAnnotation> csvUserIterator = csvToBean.iterator();

            while (csvUserIterator.hasNext()) {
                CsvUsersUsingBindByNameAnnotation csvUser = csvUserIterator.next();
                System.out.println("Name : " + csvUser.getName());
                System.out.println("Email : " + csvUser.getEmail());
                System.out.println("PhoneNo : " + csvUser.getPhoneNo());
                System.out.println("Country : " + csvUser.getCountry());
                System.out.println("==========================");
            }
        }
    }
}
