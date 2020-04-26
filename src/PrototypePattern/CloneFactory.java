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
public class CloneFactory {
    public File getClone(File f)
    {
        //As make copy is a function of File interface which is being implemented by both file types so it can be called using file which is passed as arg here
        return f.makecopy();
    }
}
