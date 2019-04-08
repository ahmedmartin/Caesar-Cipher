/*
 algorithm is shift every character in message from (0......25) 
 */
package crp_suizer;

/**
 *
 * @author Ahmed_Martin
 */
public class suizer_sipher {
      
    
    
    String encrypt(String message,int key){
        String result="";
        message = message.toLowerCase();
       // iterate to every character on message text
         for(int i=0;i<message.length();i++){
             char p =message.charAt(i);  // plain character
             
                result+=(char)((((p-'a')+key)%26)+'a'); // do shift 
              
         }
       
        
        return result;
    }
    
    
    String decrypt(String message,int key){
       String result = "";
       // iterate to every character on message text
       for(int i=0;i<message.length();i++){
          char c = message.charAt(i);    // cipher character
                int val = ((c-'a')-key)%26;  // character value
                if(val<0){  // check character value <0 make shiftt from the last
                   val=26+val;
                }
                result+=(char)(val+'a');  // put new character in result
          
       }
       return result;
    }
    
}
