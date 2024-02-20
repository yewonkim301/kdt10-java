package _07_generic;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class Prac1 {
    public static void main(String[] args) {
        Pair<String, Integer> var1 = new Pair<>("One", 1);
        System.out.println("Key: " + var1.getKey() + ", Value: " +  var1.getValue());
        Pair<Integer, String> var2 = new Pair<>(2, "Two");
        System.out.println("Key: " + var2.getKey() + ", Value: " +  var2.getValue());
    }
}
