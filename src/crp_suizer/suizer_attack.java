/*
 attack Caesar Cipher  by prute force attack
 */
package crp_suizer;


public class suizer_attack {
    
    String[] attack(String message){
       String result[] = new String[26];
       suizer_sipher suiz = new suizer_sipher();
       // iterate and get all result for this cipher text
       for(int key=1,j=0;key<=26;key++,j++){
           String s_result=suiz.decrypt(message, key);
          result[j] = s_result;
       }
       return result;
    }
    
}
