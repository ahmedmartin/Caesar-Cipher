/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crp_suizer;

/**
 *
 * @author Ahmed_Martin
 */
public class invers {
    
    
    int modInv(int a, int b) {
		int i = 1;
		while(gcd(a, b) == 1) {
			if((a * i++) % b == 1) {
				return i - 1;
			}
		}
		return 0;
	}
	int gcd(int a, int b) {
		if(a == 0 || b == 0)
			return 0;
		if(a == b)
			return a;
		if(a > b)
			return gcd(a - b, b);
		return gcd(a, b - a);
	}
	int lcm(int a, int b) {
		return (a * b)/gcd(a, b);
	}
	
    
}
