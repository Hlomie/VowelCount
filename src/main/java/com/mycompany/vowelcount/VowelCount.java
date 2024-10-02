/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vowelcount;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class VowelCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        int vowelCount = countVowels(sentence);
        System.out.println("Number of vowels: " + vowelCount);
    }

    public static int countVowels(String sentence) {
        int vowelCount = 0;
        sentence = sentence.toLowerCase(); // convert to lowercase for simplicity
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }
        return vowelCount;
    }
}
    

