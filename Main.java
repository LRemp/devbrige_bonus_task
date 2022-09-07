package com.exmaple.bonustask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File myObj = new File("data.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] nums = data.split("\\D+");
                for(int i = 0; i < nums.length; i++) {
                    if(!nums[i].equals("") && Integer.parseInt(nums[i]) >= 10) {
                        System.out.println(data);
                        break;
                    }
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
}
