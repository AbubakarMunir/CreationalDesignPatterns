/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrototypePattern;


public class PDFFile implements File{
    String name;
    int pages;
    int contents;
    
    PDFFile(String n, int p,int c)
    {
        name=n;
        pages=p;
        contents=c;
    }
    
    public File makecopy()
    {
        //This function makes the same clone of the this typecasted attribute which is pdf using the super functionality of clone
        try {
            return (PDFFile) super.clone();
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
        System.out.println("Pages: "+pages);
        System.out.println("Contents: "+contents);
    }
    
}
