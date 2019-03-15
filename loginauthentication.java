/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.HashMap;

/**
 *
 * @author Nourena Nabil
 */
public class loginauthentication {

    public loginauthentication(HashMap usersDictionary) {
        this.usersDictionary = usersDictionary;
    }
    
    HashMap<String,String> usersDictionary;
    public loginauthentication(){
        usersDictionary=new HashMap();
        usersDictionary.put("nourena","5510");
        
    }
    public boolean validate(String username){
        boolean validationResult=false;
        String fetchedpassword= usersDictionary.get("nourena");
        if(fetchedpassword!=null)
        {
 
            validationResult=fetchedpassword.equals(username);
        }
        
        return validationResult;
    }
    
    
}
