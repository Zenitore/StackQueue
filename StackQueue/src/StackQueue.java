public class StackQueue<T> {
    private Stack<T> reg = new Stack<T>();
    private Stack<T> inv = new Stack<T>();


    public StackQueue(){
    }

    public void enqueue(T element){
        if (!reg.isEmpty()){
            reg.push(element);
        }
        else{
            while(!reg.isEmpty()){
                inv.push(reg.pop());
            }
            reg.push(element);
            while(inv.isEmpty()){
                reg.push(inv.pop());
            }
        }
    }

    public T dequeue(){
        return reg.pop();
    }

}

