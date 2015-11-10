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
public class UniqueCharacter {
    public static void main(String[] args){
        String test = "runzhuo";
        boolean result = findAllUniqueCharacter(test);
        System.out.println(result);
    }
    
    private static boolean findAllUniqueCharacter(String s){
        if (s.length() > 256){
            return false; 
        } else if (s.length()==0) {
            return true;
        } else {
            boolean[] base = new boolean[256]; //inital will be false;
            for (char c : s.toCharArray()){
                if (base[c]){
                    return false;
                } else {
                    base[c] = true;
                } 
            }
            return true;
        }
    }
}
