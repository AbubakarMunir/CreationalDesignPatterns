/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrototypePattern;

//In this case we ll have two types of files ie pdf and wordFiles 
//We are going to clone each of them by overriding makecopy accordingly 

//extends cloneable because we ave to make clone in makecopy function in the classes implementing this interface
public interface File extends Cloneable {
   File makecopy();
   String getName();
   void PrintInfo();
}


