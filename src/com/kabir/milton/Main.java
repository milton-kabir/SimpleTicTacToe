package com.kabir.milton;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter cells:");
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        System.out.println("---------");
        System.out.println("| "+st.charAt(0)+" "+st.charAt(1)+" "+st.charAt(2)+" |");
        System.out.println("| "+st.charAt(3)+" "+st.charAt(4)+" "+st.charAt(5)+" |");
        System.out.println("| "+st.charAt(6)+" "+st.charAt(7)+" "+st.charAt(8)+" |");

        System.out.println("---------");
    }
}
