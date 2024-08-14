/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PKL_Latihan;

/**
 *
 * @author User
 */
public class HelloWorld {
    
    //instance variable
    Integer instanceVariable=10;
    static Integer staticVariable=30;
    
    // non static private modifier synchronized
    private synchronized void nonStaticTest(){
        //local variable
        Integer localVariable=20;
        System.out.println("Non static method");
    }
    // public modifier
    public static void staticTest(){
        System.out.println("static method");
    }
    public static void main(String[] args) {
        //variable instance
        HelloWorld helloWorldObject1 = new HelloWorld();
        helloWorldObject1.instanceVariable=20;
        HelloWorld helloWorldObject2 = new HelloWorld();
        helloWorldObject2.instanceVariable=40;
        
        // variable static
        HelloWorld.staticVariable=100;
        
        //print Hello World
        System.out.println("Hello World!!");
        //Non Static Method
        HelloWorld helloWorldObject = new HelloWorld();
        helloWorldObject.nonStaticTest();
        //Static Method
        staticTest();
    }
}
