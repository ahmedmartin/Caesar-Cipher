/*
  choose (a,b) number from 0 to 25 and must be coprime gcd(a,b)=1
  then do the algorithm :  p:plain text   , c:cipher text  
  decrypt  P= (a^-1 *(c-b))%26   a , b are keys  
  encrypt  c=(aP +b ) mod 26   a,b are keys
 */
package crp_suizer;

/**
 *
 * @author Ahmed_Martin
 */




public class affine_cipher {

    int a = 17;
    int b =  3;
    int inv_a;
    
    public affine_cipher(int a,int b) {
        this.a=a;
        this.b=b;
        invers inv = new invers();  // class to get inverse a mod 26
        inv_a= inv.modInv(a, 26);
       
    }
    
    public affine_cipher() {
        invers inv = new invers();
        inv_a= inv.modInv(a, 26);
        System.out.println(inv_a);
    }
    
    
    
    
    String encrypt(String message){
        String result="";
        message = message.toLowerCase();
        // iterate in message and make the encryption by a,b
        for(int i=0;i<message.length();i++){
             char p =message.charAt(i);  // plain character
             
                result+=(char)(( ( ( (p-'a') *a) +b) %26)+'a');  // do encryption and put new char in result
              
         }
        return result;
    }
    
    
    String decrypt(String message){
       String result="";
       // iterate in message and make the decryption by a,b
       for(int i=0;i<message.length();i++){
          char c = message.charAt(i);   // cipher character
          
                int val = ( (inv_a*( (c-'a') -b ) ) %26 );  //// do decryption and put new char in val
                if(val<0){  // check value of character <0  do shift from the last
                 val=26+val;
                }
                result+=(char)(val +'a');  //put new char in result
          
       }
       return result;
    }
    
}
