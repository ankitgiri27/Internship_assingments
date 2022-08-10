/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import java.io.*;


public class FileNotFound {
    public static void main(String[] args) {

        try {
            
            BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\asus\\OneDrive\\Desktop")));
        }
        //FileNotFoundException is a subclass of IOException.
        catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException caught!");
            
            e.printStackTrace();
        }
    }
}