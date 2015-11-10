/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cc150.practice;

/**
 *
 * @author runzhuowang
 */
public class Permutation {
    public static void main(String[] args){
        String s1 = "aacd";
        String s2 = "aacd";
        boolean result = checkPermutation(s1, s2);
        System.out.println(result);
    }
    
    private static boolean checkPermutation(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        } else {
            int[] base = new int[256];
            
            for (char c : s1.toCharArray()){
                base[c]++;
            }
            
            for (char c : s2.toCharArray()){
                if(--base[c] < 0){
                    return false;
                }
            }
            return true;
        }
    }
}
