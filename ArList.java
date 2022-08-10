
package validintern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArList {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList();
        //adding in a list
        li.add(6);
        li.add(7);
        li.add(9);
        System.out.println(li);
        li.add(10);
        System.out.println(li);
        //adding in a particular position
        li.add(2,88);
        li.add(4, 44);
        System.out.println(li);
        //add all the element of newlist to list
        List<Integer> nl = new ArrayList();
        nl.add(79);
        nl.add(69);
        nl.add(77);
        
        li.addAll(nl);
        System.out.println(li);
        //geting an element from arraylist
        System.out.println(li.get(4));
        //remove element from the arraylist
        System.out.println(li.remove(0));
        System.out.println(li.remove(Integer.valueOf(69)));
        //iterate in list using iterator
        Iterator<Integer> it = li.iterator();
        while(it.hasNext()){
            System.out.println("iterator : "+it.next());
        }
        for(Integer e:li){
            System.out.println(e);}
        //check element is present in arraylist or not
        System.out.println(li.contains(29));
        
        
    }
}
