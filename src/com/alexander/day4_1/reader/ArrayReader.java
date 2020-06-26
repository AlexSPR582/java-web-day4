package com.alexander.day4_1.reader;

import com.alexander.day4_1.exception.ArrayException;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.util.Scanner;

public class ArrayReader {
    private final String defaultPath = "resourse/array.txt";

    public String readFromFile(String filename) throws ArrayException {
        if (filename == null) {
            throw new ArrayException("Invalid filename");
        }
        File file = new File(filename);
        if (!file.exists()) {
            filename = defaultPath;
        }
        String strArr = null;
        try (FileReader fr = new FileReader(filename);
             BufferedReader reader = new BufferedReader(fr)) {
            strArr = reader.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strArr;
    }

    public String readFromConsole() {
        Scanner sc = new Scanner(System.in);
        String strArr = sc.nextLine();
        sc.close();
        return strArr;
    }
}
