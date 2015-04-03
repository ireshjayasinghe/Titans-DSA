/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dsa;

/**
 *
 * @author Damitha
 */
public class ListHouse implements Listable {
    public int LOTNUMBER;
    private String FIRSTNAME;
    private String LASTNAME;
    private int PRICE;
    private int SQUAREFEET;
    private int NUMBEROFBEDROOMS;
    
    
        public ListHouse(){
            
            //cOn
        
    }
    
        public ListHouse(int lotNumber, String firstName,String lastName,int price, int squareFeet, int bedRooms) {
       
        this.LOTNUMBER = lotNumber;
        this.FIRSTNAME = firstName;
        this.LASTNAME = lastName;
        this.PRICE = price;
        this.SQUAREFEET = squareFeet;
        this.NUMBEROFBEDROOMS = bedRooms;
    }
    
    
    
}
