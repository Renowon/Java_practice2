/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EE3206_test2_prep;

import java.io.File;

/**
 *
 * @author Renn
 */
public class TestFileCLass {

    public static void main(String[] args) {
        File file = new File("image/us.gif");
        System.out.println("Absolute path is " + file.getAbsolutePath());
        System.out.println("Relative path is " + file.getPath());
        System.out.println("Last modified on " + new java.util.Date(file.lastModified()));
        System.out.println("Does it exist? " + file.exists());
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written? " + file.canWrite());
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("Is it a file? " + file.isFile());
        System.out.println("Is it hidden? " + file.isHidden());        
    }
}
