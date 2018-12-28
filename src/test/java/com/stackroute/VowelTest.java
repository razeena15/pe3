package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelTest {

    Vowel v=new Vowel();

    @Test
    public void vowelRemove()
    {
        String[] result= v.vowelRemover(new String[]{"India,United States, Germany,Egypt,czechoslovakia"});
        assertArrayEquals(new String[]{"Ind,Untd Stts,Grmny,Egypt,czchslvk"},result);
    }

    @Test
    public void vowelRemove1()
    {
        String[] result= v.vowelRemover(new String[]{" Germany,Egypt,czechoslovakia"});
        assertArrayEquals(new String[]{"Grmny,Egypt,czchslvk"},result);
    }

}
