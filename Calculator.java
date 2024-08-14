/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PKL_Latihan;

/**
 *
 * @author User
 */
public class Calculator {
    public Integer add (Integer arg1, Integer arg2){
        arg1=100;
        Integer result= arg1+arg2;
        return result;
    }
    public Integer add (Integer arg1, Integer arg2, Integer arg3){
        Integer result= arg1+arg2+arg3;
        return result;
    }
    
    public static void main(String[] args) {
        Calculator cal = new Calculator();
       int arg1=10;
       int arg2=30;
       int arg3=40;
       System.out.println("Printing arg1 before passing it by value");
       Integer result = cal.add(arg1, arg2);
       System.out.println("Printing arg1 after passing it by value to add method "+arg1);
       System.out.println("Hasilnya adalah : "+result);
       
       Integer resultFromNewAddMethod = cal.add(arg1, arg2, arg3);
        System.out.println("Result from new add method "+resultFromNewAddMethod);
    }
    
}
