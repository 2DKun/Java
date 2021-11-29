package pac;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList <E> implements IWaitList<E>{

    protected ConcurrentLinkedQueue<E> components;

    public WaitList(){
        components = new ConcurrentLinkedQueue<>();
    }

    public WaitList(Collection<E> collection){
        components = new ConcurrentLinkedQueue<>(collection);
    }

    @Override
    public String toString() {
        return "WaitList{" + "components=" + components + '}';
    }

    //--------------------------------------------------------

    @Override
    public void add(E element) { //добавление в конец списка

        components.add(element);
    }

    @Override
    public E remove() { //"вытаскивает" первый элемент списка
        if(isEmpty()) {
            throw new IllegalStateException("Очередь пуста!");
        }
        return components.remove();
    }


    @Override
    public boolean contains(E element) {  //сравнение элемента в списке
        boolean res = false;
        for(int i = 0; i < components.size(); i++){
            E el = components.remove();
            if(el.equals(element)) res = true; //используется equals для сравнения содержания, а не ссылок
            components.add(el);
        }
        return res;
    }


    @Override
    public boolean containsAll(Collection<E> collection) { //сравнение элементов с коллекцией
        ArrayList<E> al = new ArrayList<>(collection);
        for(int i = 0; i < collection.size(); i++){
            boolean res = false;
            for(int j = 0; j < components.size(); j++){
                E el = components.remove();
                if(el.equals(al.get(i))) res = true;
                components.add(el);
            }
            if(!res) return false;
        }
        return true;
    }


    @Override
    public boolean isEmpty() {
        return components.isEmpty();
    }
}
