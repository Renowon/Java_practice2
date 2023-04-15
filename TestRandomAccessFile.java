/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EE3206_test2_prep;

import java.io.*;

/**
 *
 * @author Renn
 */
public class TestRandomAccessFile {
    
    public static void main(String[]args) throws IOException{   // You must add throws IOException!!
        // Create a ramdom access file
        RandomAccessFile inout = new RandomAccessFile("inout.dat", "rw");
        
        // Clear the file to destroy the old contents if exists
        inout.setLength(0);
        
        // Write new integers to the file
        for(int i = 0; i < 200; i++) {
            inout.writeInt(i);
        }
        
        // Display the current length of the file
        System.out.println("Current file length is " + inout.length());
        
        // Retrieve the first number
        inout.seek(0);  // Move the file pointer to the beginning
        System.out.println("The first number is " + inout.readInt());
        
        // Retrieve the second number
        inout.seek(1 * 4);    // Move the file pointer to the second number. 4byte (int size) move and read
        System.out.println("The second number is " + inout.readInt());
        
        // Retrieve the tenth number
        inout.seek(9 * 4);  // 36 bytes move. So It becomes 10th number.
        System.out.println("The tenth number is " + inout.readInt());
        
        //modify the eleventh number
        inout.writeInt(555);
        
        // Append a new number
        inout.seek(inout.length()); //move the file pointer to the end
        inout.writeInt(999);    //as write 999, the length would be increased 1
        
        //Display the new length
        System.out.println("The new length is " + inout.length());
        
        //Retrieve the new eleventh number
        inout.seek(10 * 4); // Move the file pointer to the eleventh number 
        System.out.println("The eleventh number is " + inout.readInt());
        
        inout.seek(200 * 4);
        System.out.println("The 201th number is " + inout.readInt());
        
        inout.close();
          
    }
    
    /** Output
     * 
     * Current file length is 800   -> As assign 200 integers by using for loop, the file length refers to the byte size
     * The first number is 0        -> seek(0) refers to the first number
     * The second number is 1       -> seek(1 * 4) refers to 1 * 4 byte location is pointed
     * The tenth number is 9        -> seek(9 * 4) refers to 9 * 4 byte location is pointed
     * The new length is 804        -> as write 999 as 201st number
     * The eleventh number is 555   -> seek(10 * 4) refers to 10 * 4 byte location is pointed
     * The 201st number is 999      -> 201st number is 999. 
     * 
     * RandomAccessFile 클래스는 파일을 무작위로 읽고 쓸 수 있도록 지원하는 클래스입니다. 이 클래스의 생성자는 파일 이름과 파일 모드를 인자로 받습니다.

     *RandomAccessFile inout = new RandomAccessFile("inout.dat", "rw");
     *위 코드는 "inout.dat" 파일을 생성하거나, 이미 존재하면 해당 파일을 열어서 inout 변수에 할당합니다. "rw"는 파일 모드를 나타내며, 읽기(read)와 쓰기(write) 모두 가능합니다. 따라서 inout 객체를 사용하여 파일에 데이터를 쓰거나 읽을 수 있습니다.

파일 모드에는 "r", "w", "rw", "rws", "rwd" 등이 있으며, 각각 다음과 같은 의미를 가집니다.

"r" : 읽기 모드(read-only)
"w" : 쓰기 모드(write-only), 파일이 이미 존재하면 파일의 내용이 삭제됩니다.
"rw" : 읽기 및 쓰기 모드(read-write), 파일이 이미 존재하면 파일의 내용이 유지됩니다.
"rws" : 동기(sync) 읽기 및 쓰기 모드, 파일 내용과 메타데이터가 동기화됩니다.
"rwd" : 동기 읽기 및 쓰기 모드, 파일 내용만 동기화됩니다.
RandomAccessFile 클래스는 자바에서 파일을 다룰 때 매우 유용한 클래스 중 하나이며, 파일 내용을 빠르고 효율적으로 읽고 쓸 수 있습니다.
     */
    
}
