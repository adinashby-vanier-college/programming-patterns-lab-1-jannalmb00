package com.prog2.labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author adinashby
 *
 */

public class LabSix {

	/**
	 * Write your test code below in the main (optional).
	 *
	 */
	public static void main(String[] args) {
//            String input = "5\n5 41 77 74 22 44\n1 12\n4 37 34 36 52\n0\n3 20 22 33\n5\n1 3\n"
//				+ "3 4\n3 1\n4 3\n5 5";
//            System.out.println(arrayListProblem(input));
            
		
	}

	/**
	 * Please refer to the README file for question(s) description
	 */

	public static String arrayListProblem(String input) {
            
            String result= "";

             ArrayList<ArrayList<String>> numberInput = new ArrayList<>();
             ArrayList<ArrayList<String>> queries = new ArrayList<>();

             List<String> lists = Arrays.asList(input.split("\n"));
             
             for (int inputRow = 0;inputRow <= Integer.parseInt(lists.get(0))  ; inputRow ++){
                 numberInput.add(new ArrayList<>(Arrays.asList(lists.get(inputRow).split(" "))));
            
            }
             for(int inputQuery = Integer.parseInt(lists.get(0)) +1; inputQuery < lists.size(); inputQuery++ ){
                queries.add(new ArrayList<>(Arrays.asList(lists.get(inputQuery).split(" "))));
              
            }
             
            for(int row =1 ; row < queries.size(); row++){
                int queryX =Integer.parseInt(queries.get(row).get(0));
                int queryY = Integer.parseInt(queries.get(row).get(1));
                
                if(queryX < numberInput.size()){
                    if(queryY <= Integer.parseInt(numberInput.get(queryX).get(0))){
                        result += numberInput.get(queryX).get(queryY)+"\n";
                    //System.out.println(numberInput.get(queryX).get(queryY));
                    }else{
                    //System.out.println("ERROR");
                        result += "ERROR!\n";
                    }
                 }else{
                    result += "ERROR!\n";
                }
            }
		return result.trim();
	}
}
