/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication42;

/**
 *
 * @author pupil
 */
public class JavaApplication42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String phrase = "hello world";
        
        int counter = 0;
        
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        
        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < phrase.length(); j++) {
                 if (alphabet[i] == phrase.charAt(j)) {
                      counter++;
                      break;
                 }
            }
        }
        if (counter == 26) {
           System.out.println("Строка является панграммой");
        }else{
            System.out.println("Строка не является панграммой");
        }
}
    
}
