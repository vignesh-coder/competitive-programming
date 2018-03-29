import java.util.*;
class Heap{
    
    private int arr[];
    private int size;
    private int pos=1;
    
    Heap(int size){
        arr = new int[size+1];
        this.size=size;
    }
    Heap(int a[]){
        arr = new int[a.length+1];
        size=a.length;
        addItems(a);
    }
    void add(int item){
        if(pos<=size)
            arr[pos++]=item;
    }
    int get(int i){
        return (i<=size)?arr[i]:-1;
    }
    void buildHeap(){
        
        for(int i=size/2;i>=1;i--){
            maxHeapify(i); 
        }
    }
    void addItems(int a[]){
        for(int i : a){
            add(i);
        }
    }
    private void maxHeapify(int i){
        int left = 2*i;
        int right = 2*i +1;
        int largest;
        
        if(left<=size && arr[left]>arr[i])
            largest=left;
        else
            largest=i;
        if(right<=size && arr[right]>arr[largest])
            largest=right;
        
        if(largest!=i){
            //System.out.println(largest);
            swap(largest,i);
            maxHeapify(largest);
        }
    }
    
    void sort(){
        
        buildHeap();
        int tmp=size;
        //System.out.println(size);
        for(int i=size;i>1;i--){
            
            //System.out.println(arr[i]);
            swap(1,i);
            size--;
            maxHeapify(1);
        }
        size=tmp;
        System.out.println(Arrays.toString(arr));
        buildHeap();
    }
    
    private void swap(int i,int j){
        arr[j]=(arr[i]+arr[j])-(arr[i]=arr[j]);
    }
    
    //driver method
    public static void main(String...args){
        
        int arr[] = new int[]{8,6,3,5,1,2};
        Heap h = new Heap(arr);
        h.sort();
    }
}
