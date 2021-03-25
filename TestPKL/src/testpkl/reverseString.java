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
public class reverseString {
    public static void main(String[] args){
        String r = reverse("Hi, get well soon");
        System.out.println(r);
    }
    public static String reverse(String s){
        char[] letters = new char[s.length()];
        
        int letterIndex = 0;
        for(int i = s.length() - 1; i>= 0; i--){
            letters[letterIndex] = s.charAt(i);
            letterIndex++;
        }
        
        String reverse = "";
        for(int i = 0; i < s.length(); i++){
            reverse = reverse + letters[i];
        }
        return reverse;
    }
}
