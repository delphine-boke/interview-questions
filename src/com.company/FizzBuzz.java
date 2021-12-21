package com.company;


import java.util.ArrayList;
import java.util.List;

/**Given an integer n, return a string array answer(1-indexed) where
 * answer[i] = "FizzBuzz" if i is divisibe by 3 and 5
 * answer[i] = "Fizz" if is divisibe by 3
 * answer[i] = "Buzz" if i is divisibe by 5
 * answer[i] = i if none of the above conditions is true
 */
public class FizzBuzz {
    public List<String> FizzBuzz(int n) {
        List<String> li = new ArrayList<String>();
        for (int i =1; i<=n; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0){
                    li.add("FizzBuzz");  //print 3 and 5
                }
            } else {
                li.add("Fizz");  //print only 3
            }
            else{
            if (i % 5 == 0) {
                li.add("Buzz"); //print only 5
            }
            else {
                li.add(Integer.toString(i)); //print the number itself
                }
            }
        return li;
    }
}


