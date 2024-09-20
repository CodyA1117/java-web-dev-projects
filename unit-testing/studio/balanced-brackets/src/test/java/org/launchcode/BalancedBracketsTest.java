package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void singBracketsAroundOtherCharachters(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void launchBracketCodeBracket(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void openBracketClosingBracketCharachter(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void openOpenCloseClose(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
    @Test
    public void openCharacter(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void closeClose(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
    }
    @Test
    public void openOpen(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }
    @Test
    public void openCloseThreeOpenThreeCloseThree(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][][[[]]]"));
    }
    @Test
    public void charClosingCharOpen(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void StringNoBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }






}
