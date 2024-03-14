public class HashMap<K, V> implements Map{
    int hash; //хэш-код элемента
    public K key;
    public V value;
    public HashMap<K, V> next;

    HashMap () {;} ////создание пустой коллекции

    @Override
    public void put(K key, V value) {
        int hash = hashCode();
    }

    @Override
    public void get(K key) {

    }

    @Override
    public void containsKey(K key) {

    }

    @Override
    public void containsValue(V value) {

    }

    @Override
    public void remove(K key) {

    }

    @Override
    public void size() {

    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public void equals() {

    }
}
