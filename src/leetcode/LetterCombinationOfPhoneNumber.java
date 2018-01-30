//Given a digit string, return all possible letter combinations that the number could represent.
package leetcode;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinationOfPhoneNumber {
	private static String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno",
	                                   "pqrs", "tuv", "wxyz"};
	
	public static List<String> letterCombinations(String digits) {
    	List<String> results = new LinkedList<>();
        if (digits.length() == 0) return results;
        
    	results.add("");
        for (char d : digits.toCharArray()) {
        	List<String> temp = new LinkedList<>();
        	for (String s : results) {
        		for (char c : mapping[(d - '0')].toCharArray()) {
        			temp.add(s + c);
        		}
        	}
        	results = temp;
        }
        return results;
    }
    
	public static void main(String[] args) {
    	System.out.println(LetterCombinationOfPhoneNumber.letterCombinations(""));
    	System.out.println(LetterCombinationOfPhoneNumber.letterCombinations("2"));
    }
}
