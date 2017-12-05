/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.managers.file;

import java.io.FileWriter;
import java.io.PrintWriter;
import me.max.tester.managers.error.ErrorOutput;

/**
 * @author Max
 */
public class LFileWriter  {
    private final ErrorOutput output = new ErrorOutput();
    
    public void writeToFile(String text, String filename, boolean append) { // false will clear file, true will append
        FileWriter writeObject;
        PrintWriter printObject;
        String my_dir = System.getProperty("user.dir") + "\\src\\me\\max\\tester\\textfiles\\" + filename + ".txt";
        try {
            writeObject = new FileWriter(my_dir, append);
            printObject = new PrintWriter(writeObject);
            /*if (text.contains("\n")) {
                printObject.println();
                text = text.replace("\n", "");
            }*/
            printObject.print(text);
            printObject.println();
            printObject.close();
        } catch (Exception ex) {
            output.error(ex);
        }    
    }
}
