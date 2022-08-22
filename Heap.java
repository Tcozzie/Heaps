/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heapdriver;


/**
 *
 * @author tiegancozzie
 */
public class Heap {
    
    private int front;
    private int heap[];
    private int size=0;

    Heap(int x){
        heap=new int[x];
        front=1;
    }

    
    public void insert(int x){
        size++;
        heap[size]=x;
        int child=size;
        int parent;
        while(true){
            if(child==1){
                return;
            }else{
                if(child%2==1){
                    parent=child;
                    child=(child-1)/2;
                }else{
                    parent=child;
                    child=child/2;
                }
            }
            if(heap[parent]<heap[child]){
                int temp=heap[child];
                heap[child]=heap[parent];
                heap[parent]=temp;
            }
        }
    }
    
    public void remove(){
        heap[front]=heap[size];
        heap[size]=0;
        size--;
        int parent=1;
        while(true){
            int childL=parent*2;
            int childR=parent*2+1;
            if(parent==size){
                break;
            }else if(heap[childL]<heap[parent] && heap[childL]<heap[childR] && childL<=size){
                int temp=heap[parent];
                heap[parent]=heap[childL];
                heap[childL]=temp;
                parent=childL;
            }else if(heap[childR]<heap[parent] && childR<size){
                int temp=heap[parent];
                heap[parent]=heap[childR];
                heap[childR]=temp;
                parent=childR;
            }else{
                break;
            }
        }
    }
    
    public void print(){
        for(var i=1;i<size+1;i++){
            System.out.println(heap[i]);
        }
    }
    
    
}
