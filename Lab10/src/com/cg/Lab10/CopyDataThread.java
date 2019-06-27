package com.cg.Lab10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread extends Thread {

    FileReader reader;
    FileWriter writer;

    public CopyDataThread(FileReader reader, FileWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    @Override
    public void run() {
        int element;
        int count = 0;
        try {
            while ((element = reader.read()) != -1) {
                writer.write(element);
                count++;
                if (count == 10) {
                    count = 0;
                    System.out.println("10 characters are copied");
                    sleep(10000);
                }
            }
            System.out.println("File copied successfully");
        } catch (IOException | InterruptedException ex) {
            System.out.println("Error in reading and writing file");
        } finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException ex) {
                System.out.println("Error in reading and writing file");
            } catch (NullPointerException e) {
                System.out.println("One of the given file does not exist.");
            }

        }

    }

}
