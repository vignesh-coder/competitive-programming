class PriorityQueue<T extends Comparable<T>>{
    
    private final int MAX = (int) 1e6+5;
    private Object items[] = new Object[MAX];
    private int len = 0;
    
    private void swap(int i,int j){
        Object tmp = items[i];
        items[i]=items[j];
        items[j]=tmp;
    }
    
    private T item(int i){
        return (T)items[i];
    }
    
    private void heapify(int i){
        
        int left = i*2;
        int right = i*2 + 1;
        int largest = i;
        
        if(left<=len && item(left).compareTo(item(largest)) > 0){
            largest = left;
        }
        if(right<=len && item(right).compareTo(item(largest)) > 0){
            largest = right;
        }
        
        if(largest != i){
            
            swap(largest,i);
            heapify(largest);
        }
    }
    
    public T pop(){
        
        T obj = top();
        items[1]=item(len);
        len--;
        heapify(1);
        return obj;
    }
    
    public T top(){
        
        return item(1);
    }
    
    public void push(T item){
        
        items[++len] = item;
        int i = len;
        
        while(i>1 && item(i/2).compareTo(item(i)) < 0){ // compare with its parent
        
            swap(i,i/2);
            i/=2; //  go to its parent
        }
    }
    public boolean isEmpty(){
        return len==0;
    }
}
