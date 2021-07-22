package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Singleton singleton = Singleton.getInstance();
        System.out.println("Singleton creado "+singleton);

    }
}
