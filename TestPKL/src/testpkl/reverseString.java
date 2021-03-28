/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpkl;


/**
 *
 * @author SAMSUNG
 */


public class ReverseString {

    public static void main(String[] args) {
        String str = "Ayo PKL" ;
        String reverse = ReverseString(str);
        System.out.println("The reversed string is: " + reverse);
    }

    public static String ReverseString(String str)
    {
        if (str.isEmpty())
            return str;
        //memanggil fungsi rekrusif
        return ReverseString(str.substring(1)) + str.charAt(0);
    }
}

