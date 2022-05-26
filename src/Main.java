import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        SuperList numeros = new SuperList();

        numeros.addElement(1);
        numeros.addElement(2);
        numeros.addElement(3);
        numeros.addElement(4);

        numeros.removeElement(3);

        numeros.showElements();

        numeros.showReversedElements();
    }
}
