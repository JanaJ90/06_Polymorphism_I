package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();

        pollObj(queen);
        pollObj(worker);
        pollObj(drone);
        
        HonyBee bee = new HonyBee(); // Superklasse //
        pollObj(bee);
    }
    // Overloding method for polymorphism //
   private static void pollObj(HonyBee obj) {
    output(obj.doYourJob());
        output(obj.fly());
        output("-------------");
    }
    // Overloding method for polymorphism //
    // private static void pollObj(Worker obj) {
    //     output(obj.doYourJob());
    //         output(obj.fly());
    //         output("-------------");
    //     }
    // // Overloding method for polymorphism //
    //     private static void pollObj(Drone obj) {
    //         output(obj.doYourJob());
    //             output(obj.fly());
    //             output("-------------");
    //         }


    private static void output(String outputStr) {
        System.out.println(outputStr);
    }








}

