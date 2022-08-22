/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heapdriver;

/**
 *
 * @author tiegancozzie
 */
public class HeapDriver {

    
    
    public static void main(String[] args) {
        Heap run=new Heap(25);
        run.insert(15);
        run.insert(5);
        run.insert(8);
        run.insert(4);
        run.insert(9);
        run.insert(22);
        run.insert(17);
        run.insert(16);
        run.insert(14);
        run.print();
        System.out.println("***********************");
        run.remove();
        run.remove();
        run.print();
        System.out.println("***********************");
        run.insert(18);
        run.insert(12);
        run.print();
        System.out.println("*************************");
        run.remove();
        run.remove();
        run.remove();
        run.print();
    }
    
}
