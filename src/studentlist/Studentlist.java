/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Studentlist;

/**
 *
 * @author dramb
 */
public class Studentlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] Studentlist = new Student[3];
        Student s1 = new Student();
        s1.setName("Dev Ambaliya");
        Student s2 = new Student();
        s2.setName("Dev ");
        Student s3 = new Student();
        s3.setName(" Ambaliya");
        Studentlist[0] = s1;
        Studentlist[1] = s2;
        Studentlist[2] = s3;
        
        for (Student s: Studentlist) {
            System.out.println(s.getName);
        }

        
    }
    
}
