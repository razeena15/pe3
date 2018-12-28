package com.stackroute;

/*Write a program to find out if a series of 7 digits are consecutive numbers.
To make this easier, assume the digits are a string and use split()

        Input: 98,96,95,94,93
        Output: 98,96,95,94,93 non consecutive numbers

        Input: 54,53,52,51,50,49,48
        Output : 54,53,52,51,50,49,48 are consecutive numbers

        Input: 1,2,3,4,5,6,6
        Output: 1,2,3,4,5,6,6 non consecutive numbers*/


public class ConsecutiveNumber {

    String checkConsecutiveNumber(String arg){
        String[] splittedString = arg.split(",| ");
        int[] intValue = new int[splittedString.length];
        int flag=0;
        for(int i=0; i<splittedString.length; i++)
        {
           intValue[i] = Integer.parseInt(splittedString[i]);
        }

        if(intValue[0]>intValue[1])         //decreasing order
        {
            for(int i=0; i<(intValue.length-1); i++)
            {
                if( intValue[i] == (intValue[i+1]+1) )
                {
                    flag = 1;
                }
                else{
                    flag = 0;
                    break;
                }
            }
        }
        else if(intValue[0]<intValue[1])    //increasing order
        {
            for(int i=0; i<(intValue.length-1); i++)
            {
                if( (intValue[i]+1) == intValue[i+1] )
                {
                   flag=1;
                }
                else{
                    flag = 0;
                    break;
                }
            }
        }
        else{
            flag = 0;
        }

        if(flag == 1)
        {
            return "consecutive number";
        }
        else {
            return "non consecutive number";
        }
    }

}
