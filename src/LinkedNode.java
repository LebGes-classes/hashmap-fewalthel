
public class LinkedNode { //лист из нодов
    public HashMap.Node head; //голова листа
    public HashMap.Node tale; //хвост листа
    public int hash; //хэш код листа

    LinkedNode () {;} //создание пустого листа

    public void addNode(HashMap.Node node) { //добавление элемента в конец листа
        if (head == null) {
            head = node;
        } else {
            head.next = node;
            head = node;
        }
    }

}
