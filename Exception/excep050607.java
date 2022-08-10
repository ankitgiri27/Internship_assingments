/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
5. Write a program to throw exception with your own message
6. Write a program to create your own exception
7. Write a program with finally bloc
 */
class myex extends Exception{
@Override
public String toString(){
return "i am toString";
}
@Override
public String getMessage(){
    return super.getMessage()+" i am getMessage";
}
}
public class excep050607 {
    public static void main(String[] args) {
        int a=8;
        if(a<99){
            try{
            throw new myex();}
            catch(Exception e){
                System.out.println(e.getMessage());
                 System.out.println(e.toString());
            }
            
            finally{
                System.out.println("i am finally"); 
           
                    }
        }
        }
    }
   

