public class Queue {
    int queue[]=new int[3];
   
    public void push(int value){
        if(queue[0]==0){
            queue[0]=value;
            System.out.println("MENAMBAHKAN "+queue[0]);
        }else if(queue[1]==0){
            queue[1]=value;
            System.out.println("MEMASUKKAN "+queue[1]);
        }else if(queue[2]==0){
            queue[2]=value;
            System.out.println("MEMASUKKAN "+queue[2]);
        }else{
            isFull();
        }
       
    }
    public void isFull(){
        System.out.println("QUEUE IS FULL");
    }
    public void pop(){
        if(queue[0]!=0){
            System.out.println("MENGHAPUS "+queue[0]);
            queue[0]=0;
        }else if(queue[1]!=0){
            System.out.println("MENGHAPUS "+queue[1]);
            queue[1]=0;
        }else if(queue[2]!=0){
            System.out.println("MENGHAPUS "+queue[2]);
            queue[2]=0;
        }else{
            isEmpty();
        }
    }
    
    public void isEmpty(){
        System.out.println("QUEUE IS EMPTY");
    }
    public void clear(){
        queue[0]=0;
        queue[1]=0;
        queue[2]=0;
        System.out.println("Queue is clear");
    }
    public void cetak(){
        System.out.println("-------------Print--------------");
        for(int i=0;i<queue.length;i++){
            if(queue[i]!=0){
            System.out.println(queue[i]+" ");
            }
        }
        System.out.println("--------------------------------");
    }
    public static void main(String[] args) {
        Queue s=new Queue();
        s.push(5);
        s.push(3);
        s.push(2);
        s.cetak();
        s.pop();
        s.cetak();
        s.clear();
    }
}