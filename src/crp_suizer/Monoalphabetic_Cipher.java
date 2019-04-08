/*
   permute all caracter in string then do Caesar Cipher 
 */
package crp_suizer;



public class Monoalphabetic_Cipher {
    suizer_sipher suiz = new suizer_sipher(); ;
    
    
    // permute string then do encrypt Caesar Cipher
   String permutation_encrypt(String message,int key){
       String result = "";
       String s="";
       String []st= message.split(" "); // split every word in message text to encrypt every word
       // encrypt every word and do permutation shift character right
       for(int i=0;i<st.length;i++){
         s = suiz.encrypt(st[i], key); // call Caesar Cipher to encrypt
         
         String temp;
         if(i!=0)
            temp =" ";
         else
            temp="";
         
         for(int j=s.length()-1;j>=0;j--){  // do permutation
             temp+=s.charAt(j);
         }
         result+=temp;
       }
       return result;
   }
    
   // permute string then do decrypt Caesar Cipher
   String permutation_decrypt(String message,int key){
      String result = "";
      String []st= message.split(" ");    // split every word in message text to decrypt every word 
      // decrypt every word and do permutation shift character left
      for(int i=0;i<st.length;i++){
         String s = suiz.decrypt(st[i], key);
         
         String temp;
         if(i!=0)
            temp =" ";
         else
            temp="";
         
         for(int j=s.length()-1;j>=0;j--){  // do permutation
             temp+=s.charAt(j);
         }
         result+=temp;
       }
       return result;
   
   }
   
}
