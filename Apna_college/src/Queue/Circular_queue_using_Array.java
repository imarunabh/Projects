package Queue;

public class Circular_queue_using_Array {
    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;
        static int front=-1;

        Queue(int n){
            arr=new int[n];
            this.size=n;
        }
        public static boolean isEmpty(){
            return rear==-1&&front==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }

        //enqueue
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        //dequeue
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int result=arr[front];
            //single element condition
            if(rear==front){
                rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }
            return  result;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q= new Queue(5);
        q.add(3);
        q.add(3);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
