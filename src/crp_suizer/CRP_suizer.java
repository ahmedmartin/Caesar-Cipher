/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crp_suizer;

import java.util.Scanner;

/**
 *
 * @author Ahmed_Martin
 */
public class CRP_suizer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        IOfile io = new IOfile();
        
      /* //task one  (one step) 
        crypto cr = new crypto();
        io.write_file("out.txt", "hello world");
        String input = io.read_file("out.txt");
        System.out.println(input);
        String cyph =cr.incrypt(input);
        io.write_file("cyph.txt", cyph);
        String plain = cr.decrypt(cyph);
        io.write_file("plain.txt", plain);*/
      
        
       /* int key=call_key();
       // suizer_sipher suizer = new suizer_sipher();
          Monoalphabetic_Cipher mono = new Monoalphabetic_Cipher();
       // io.write_file("out.txt", "abcdefghijklmnopqrstuvwxyz");
       io.write_file("out.txt", "hello every body i love you very much ");
        String input = io.read_file("out.txt");
        System.out.println(input);
       // String cyph = suizer.encrypt(input,key);
        String cyph = mono.permutation_encrypt(input, key);
        io.write_file("cyph.txt", cyph);
       // String plain = suizer.decrypt(cyph,key);
        String plain = mono.permutation_decrypt(cyph, key);
        io.write_file("plain.txt", plain);
        System.out.println("encrypt : "+cyph);
        System.out.println("decrypt : "+plain);
       /* suizer_attack attack = new suizer_attack();
        String [] prpirtes = attack.attack(cyph);
        String s="";
        for(int i=0;i<26;i++){ 
            s+=i+"  "+prpirtes[i]+"\n";
        
            System.out.println( prpirtes[i]);
        }
        io.write_file("attack.txt",s);*/
       
       
       affine_cipher  af = new affine_cipher(17,2);
       io.write_file("out.txt", "abcdefghijklmnopqrstuvwxyz");
       String input =io.read_file("out.txt");
       
       String cyph = af.encrypt(input);
       io.write_file("cyph.txt", cyph);
       System.out.println(cyph);
       
       String plain = af.decrypt(cyph);
       io.write_file("plain.txt", plain);
       System.out.println(plain); 
        System.out.println(input);

        
    }
    
    static int call_key(){
      Scanner f = new Scanner(System.in);
        int key = f.nextInt();
        if(key>=1&&key<=26){
           return key;
        }else{
            System.out.println("key should be in a range 1...26");
            key=call_key();
        }
        return key;
    }
    
}
