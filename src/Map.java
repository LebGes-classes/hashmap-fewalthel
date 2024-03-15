interface Map <K, V> {
    //Вставляет пару ключ-значение в HashMap
    void put(K key, V value);

    //Извлекает значение, связанное с указанным ключом
    V get(K key);

    //Проверяет, содержит ли HashMap указанный ключ
    boolean containsKey(K key);

    //Проверяет, содержит ли HashMap указанное значение
    boolean containsValue(V value);

    //Удаляет пару ключ-значение, связанную с указанным ключом
    void remove(K key);

    //Возвращает количество пар ключ-значение в HashMap
    int size();

    //Проверяет равенство двух объектов
    boolean equals(K key1, K key2);

    //Метод создания хэш-кода
    int hashCode(V value);
}
