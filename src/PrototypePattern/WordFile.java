/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrototypePattern;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class WordFile implements File{
    String name;
    int words;
    int size;
    
    WordFile(String n, int w,int s)
    {
        name=n;
        words=w;
        size=s;
    }
    
    //This function makes the same clone of the this typecasted attribute ie word file using the super functionality of clone
    public File makecopy()
    {
        try {
            return (WordFile) super.clone();
        } catch (CloneNotSupportedException ex) {
           ex.printStackTrace();
        }
        return null;
    }

    @Override
    public String getName() {
        return name;
        }
    
    @Override
    public void PrintInfo()
    {
        System.out.println("name: "+name);
        System.out.println("words: "+words);
        System.out.println("size: "+size+"kbs");
    }
    
    
}

