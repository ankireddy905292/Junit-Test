package com.junit;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
public class UserRegistrationTest {
    UserRegistration user = new UserRegistration();
    @Test
    public void firstName(){
        String fName = "Anki";
        boolean chek = user.firstNameCheck(fName);
        assertTrue( chek);
    }

    @Test
    public void lastName(){
        String lName = "reddy";
        boolean chek = user.lastNameCheck(lName);
        assertTrue( chek);
    }

    @Test
    public void email(){
        String eMail = "abc.xyz@bl.co.in";
        boolean chek = user.email(eMail);
        assertTrue( chek);
    }

    @Test
    public void mobileNum(){
        String mobile = "91 9052824862";
        boolean chek = user.mobileNum(mobile);
        assertTrue( chek);
    }

    @Test
    public void passWordRule1(){
        String pass = "Ankireddy";
        boolean chek = user.passWordRule1(pass);
        assertTrue( chek);
    }

    @Test
    public void passWordRule2(){
        String pass = "Ankireddy";
        boolean chek = user.passWordRule2(pass);
        assertTrue( chek);
    }


    @Test
    public void passWordRule3(){
        String pass = "Ankireddy1";
        boolean chek = user.passWordRule3(pass);
        assertTrue( chek);
    }

    @Test
    public void passWordRule4(){
        String pass = "Ankireddy1#";
        boolean chek = user.passWordRule4(pass);
        assertTrue( chek);
    }


}

