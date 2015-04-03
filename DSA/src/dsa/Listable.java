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
public interface Listable extends Comparable<ListHouse> {
       
       ListHouse copy();
        public abstract int compareTo(ListHouse other);
    
       
        
}
