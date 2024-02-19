package _07_generic;

import java.util.ArrayList;

// 일반 클래스
class CustomList {
    ArrayList<String> list = new ArrayList<>();

    public void addElement(String element) {
        list.add(element);
    }

    public void removeElement(String element) {
        list.remove(element);
    }

    public String get(int i) {
        return list.get(i);
    }

    @Override
    public String toString() {
        return "CustomList = " + list;
    }
}

// 제네릭 클래스
class CustomListGeneric<T> {
    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element) {
        list.add(element);
    }

    public void removeElement(T element) {
        list.remove(element);
    }

    public T get(int i) {
        return list.get(i);
    }

    @Override
    public String toString() {
        return "CustomList = " + list;
    }
}

public class GenericEx1 {
    public static void main(String[] args) {
        // not using generic
        CustomList li = new CustomList();
        li.addElement("first element");
        li.addElement("second element");
        li.addElement("third element");
        System.out.println(li.toString()); // CustomList = [first element, second element, third element]

        li.removeElement("second element");
        System.out.println(li.toString()); // CustomList = [first element, third element]

        String str = li.get(1);
        System.out.println(str); // third element

        // using generic
        CustomListGeneric<Integer> genericLi = new CustomListGeneric<>();
        genericLi.addElement(3);
        genericLi.addElement(6);
        genericLi.addElement(9);
        System.out.println(genericLi.toString()); // CustomList = [3, 6, 9]

        genericLi.removeElement(6);
        System.out.println(genericLi.toString()); // CustomList = [3, 9]

        Integer el = genericLi.get(1);
        System.out.println(el); // 9

        CustomListGeneric<Character> genericLi2 = new CustomListGeneric<>();
        genericLi2.addElement('A');
        System.out.println(genericLi2.toString());
    }
}
