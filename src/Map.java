public interface Map<K, V> {
    //Вставляет пару ключ-значение в HashMap
    void put(K key, V value);

    //Извлекает значение, связанное с указанным ключом
    void get(K key);

    //Проверяет, содержит ли HashMap указанный ключ
    void containsKey(K key);

    //Проверяет, содержит ли HashMap указанное значение
    void containsValue(V value);

    //Удаляет пару ключ-значение, связанную с указанным ключом
    void remove(K key);

    //Возвращает количество пар ключ-значение в HashMap
    void size();

    //метод создания хэш-кода
    int hashCode();

    //проверяет равенство двух объектов
    void equals();
}
