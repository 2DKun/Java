package pac;

public class UnfairWaitList <E> extends WaitList<E> {

    public UnfairWaitList() {
        super();
    }


    public void remove (E element){ //находит элемент по его значению
        boolean removed = false;
        for(int i = 0; i < components.size(); i++){
            E el = components.remove();
            if(!removed && el.equals(element)){
                removed = true;
            }else{
                components.add(el);
            }
        }
        if(removed){
            components.add(components.remove());
        }
    }


    public void moveToBack(E element){ //передвигает нужный элемент в конец списка
        int prevSize = components.size();
        remove(element);
        if(components.size() < prevSize){
            components.add(element);
        }

    }

}
