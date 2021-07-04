package com.kabir.milton;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter cells:");
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        int xx=0,oo=0,yy=0;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='X'){
                xx++;
            }
            else if(st.charAt(i)=='O'){
                oo++;
            }
            else{
                yy++;
            }
        }
        System.out.println("---------");
        System.out.println("| "+st.charAt(0)+" "+st.charAt(1)+" "+st.charAt(2)+" |");
        System.out.println("| "+st.charAt(3)+" "+st.charAt(4)+" "+st.charAt(5)+" |");
        System.out.println("| "+st.charAt(6)+" "+st.charAt(7)+" "+st.charAt(8)+" |");
        System.out.println("---------");
        int x=0, O=0;
        if(st.charAt(0)=='X'&&st.charAt(1)=='X'&&st.charAt(2)=='X'){
            x=1;
        }
        else if(st.charAt(3)=='X'&&st.charAt(4)=='X'&&st.charAt(5)=='X'){
            x=1;
        }
        else if(st.charAt(6)=='X'&&st.charAt(7)=='X'&&st.charAt(8)=='X'){
            x=1;
        }
        else if(st.charAt(0)=='X'&&st.charAt(3)=='X'&&st.charAt(6)=='X'){
            x=1;
        }
        else if(st.charAt(1)=='X'&&st.charAt(7)=='X'&&st.charAt(4)=='X'){
            x=1;
        }
        else if(st.charAt(2)=='X'&&st.charAt(5)=='X'&&st.charAt(8)=='X'){
            x=1;
        }
        else if(st.charAt(0)=='X'&&st.charAt(4)=='X'&&st.charAt(8)=='X'){
            x=1;
        }
        else if(st.charAt(6)=='X'&&st.charAt(2)=='X'&&st.charAt(4)=='X'){
            x=1;
        }

        if(st.charAt(0)=='O'&&st.charAt(1)=='O'&&st.charAt(2)=='O'){
            O=1;
        }
        else if(st.charAt(3)=='O'&&st.charAt(4)=='O'&&st.charAt(5)=='O'){
            O=1;
        }
        else if(st.charAt(6)=='O'&&st.charAt(7)=='O'&&st.charAt(8)=='O'){
            O=1;
        }
        else if(st.charAt(0)=='O'&&st.charAt(3)=='O'&&st.charAt(6)=='O'){
            O=1;
        }
        else if(st.charAt(1)=='O'&&st.charAt(7)=='O'&&st.charAt(4)=='O'){
            O=1;
        }
        else if(st.charAt(2)=='O'&&st.charAt(5)=='O'&&st.charAt(8)=='O'){
            O=1;
        }
        else if(st.charAt(0)=='O'&&st.charAt(4)=='O'&&st.charAt(8)=='O'){
            O=1;
        }
        else if(st.charAt(6)=='O'&&st.charAt(2)=='O'&&st.charAt(4)=='O'){
            O=1;
        }



        if (Math.abs(xx-oo)>1){
            System.out.println("Impossible");
        }
        else if((x==0&&O==0)&&(yy!=0)){
            System.out.println("Game not finished");
        }
        else if(x==0&&O==0){
            System.out.println("Draw");
        }
        else if(x==1&&O==1){
            System.out.println("Impossible");
        }
        else if(x==1){
            System.out.println("X wins");
        }
        else if(O==1){
            System.out.println("O wins");
        }


    }
}
