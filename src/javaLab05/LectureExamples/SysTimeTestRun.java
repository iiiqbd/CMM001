/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLab05.LectureExamples;

/**
 *
 * @author Uche
 */
public class SysTimeTestRun {
	
	public static void main (String[] args) {
		
		long t1 = System.currentTimeMillis();
		for(int i = 1; i <= 100000; i++) {
			System.out.println(i);
		}
		
		long t2 = System.currentTimeMillis();
		System.out.println((t2 - t1) + " millisec = ");
		System.out.print((double)(t2 - t1) / 1000 + " sec");
		
	}
}