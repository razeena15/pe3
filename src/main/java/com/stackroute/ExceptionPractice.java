package com.stackroute;

/*
Create a class with a main( ) that throws an object of class Exception inside a try block.
*/

public class ExceptionPractice {

    /*public String main() {
        try {
            throw new Exception("Throw Exception");
        } catch (Exception e) {
            return "Exception caught";

        }
    }*/


    private int[] variable = new int[3];
    public boolean main(int[] var){
        try{
            variable = var;
            if(variable == var){
                throw new ArrayIndexOutOfBoundsException("Throw Exception");
            }
           else{
               return false;
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            return true;
        }

    public String main(){






        return null;
    }

}
