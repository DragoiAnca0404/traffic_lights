package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Semafor s=new Semafor();
        for(int i=1;i<=7;i++){
            System.out.println(s.toString());
            s.schimba();
//            System.out.println(s.toString());
        }
    }
}
