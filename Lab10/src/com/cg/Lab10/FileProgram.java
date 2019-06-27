package com.cg.Lab10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class FileProgram {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Enter source file path");
            File source_file = new File(br.readLine());
            
            System.out.println("Enter target file path");
            File target_file = new File(br.readLine());
            
            CopyDataThread thread = new CopyDataThread(new FileReader(source_file), new FileWriter(target_file));
            
            thread.start();
            
        }catch(IOException e){
            System.out.println("Wrong input given");
        }
    }
}
