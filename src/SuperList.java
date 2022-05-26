import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class SuperList extends ListManager {

    public SuperList() {

    }

    @Override
    public void addElement(Object element) {
        list.add(0,element);
    }

    @Override
    public Object removeElement(int position) {
        int elementoEliminar = position;
        list.remove(elementoEliminar);
        return elementoEliminar;
    }

    @Override
    public void showElements() {
        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            Integer numeros = it.next();
            System.out.println(numeros + "\n");
        }
    }


    @Override
    public void showReversedElements() {

        for (int i = 0; i < list.size() / 2; i++) {
            Integer temp = (Integer) list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, temp);
            System.out.println(list);
        }
    }
}
