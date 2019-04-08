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
public class crypto {
    
    String incrypt (String message){
        String result="";
      for(int i=0;i<message.length();i++){
          char c =message.charAt(i);
        if(((int)c >=(int)'A'&&(int)c <(int)'Z')||((int)c >=(int)'a'&&(int)c <(int)'z'))
           result+=++c;
        else {
           switch ((int)c){
           case (int)'Z': c='A'; result+=c; break;
           case (int)'z': c='a'; result+=c; break;
           default: result+=c; break;
           }
        }
            
      }
      return result;
    }
    
    String decrypt (String key){
        String result="";
      for(int i=0;i<key.length();i++){
          char c =key.charAt(i);
        if(((int)c >(int)'A'&&(int)c <=(int)'Z')||((int)c >(int)'a'&&(int)c <=(int)'z'))
           result+=--c;
        else {
           switch ((int)c){
           case (int)'A': c='Z'; result+=c; break;
           case (int)'a': c='z'; result+=c; break;
           default: result+=c; break;
           }
        }
            
      }
      return result;
    }
    
}
