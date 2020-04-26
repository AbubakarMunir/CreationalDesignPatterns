/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrototypePattern;

/**
 *
 * @author hp
 */
public class main {
    public static void main(String[] args) {
        CloneFactory clonefactory=new CloneFactory();
        WordFile wf=new WordFile("abc.docx",1000,6);
        WordFile wfclone=(WordFile)clonefactory.getClone(wf);
        wf.PrintInfo();
        System.out.println();
        wfclone.PrintInfo();
    }
    
    
}
