package lesson6Homework.task01;
/*Задание 1
        Реализовать односвязный (или двусвязный) список.
        Класс Связного списка должен реализовать следующие интерфейсы:
        List и его методы:
        add(Object obj, int index); - добавляет объект на указанную позицию (index)
        remove(int index); - удаляет элемент с указанной позиции (index)
        get(int index); - находит и возвращает элемент по индексу (index)
        int size(); - возвращает размер списка

        Stack и его методы:
        push(Object obj); - добавляет объект в конец списка
        pop(); - удаляет элемент из конца списка

        Queue и его методы:
        shift(Object obj); - добавляет объект в начало списка
        unshift(); - удаляет элемент из начала списка*/

public class LinkedList implements List,Stack,Queue {
    Node first = null;
    Node last = null;

    public void linkfirst(Object object) {
        Node newNode = new Node(null, object, first);
        first = newNode;
        if (first == null) {
            last = newNode;
        }else {
            newNode.befor = first;
            Node.size++;
        }

    }
    public void linkLast(Object object){
        Node newNode = new Node(last,object,null);
        last = newNode;
        if(last == null){
            first = newNode;
        }else {
            newNode.next = last;
            Node.size++;
        }
    }
    public Object razedinit(Node x){
        Node next = x.next;
        Node before = x.befor;
        if(before == null){
            first = next;
        }else {
            before.next = next;
            x.next =null;
        }
        x = null;
        Node.size--;
        return x.object;
    }
    public boolean position(int index){
        return index >= 0 && index <= Node.size;
    }

    @Override
    public void add(Object object, int index) {
        position(index);
        if(index == Node.size){
            linkLast(object);
        }else {
           linkfirst(object);
        }
    }


    @Override
    public Object remove(int index) {
        position(index);
        Node x = null;
        if(index>(Node.size >> 1)){
             x = first;
            for (int i = 0; i < index; i++){
                x = x.next;
                return x;
            }
            }else {
             x = last;
            for (int i = Node.size - 1; i > index; i--)
                x = x.befor;
            return x;
        }
        return razedinit(x);
    }

    @Override
    public Object get(int index) {
        position(index);
        Node x = null;
        if(index>(Node.size >> 1)){
            x = first;
            for (int i = 0; i < index; i++){
                x = x.next;
                return x;
            }
        }else {
            x = last;
            for (int i = Node.size - 1; i > index; i--)
                x = x.befor;
            return x;
        }
        return x.object;
    }

    @Override
    public int size() {
        return size();
    }

    @Override
    public void shift(Object object) {

    }


    @Override
    public void unshift() {

    }

    @Override
    public void push(Object object) {
        linkfirst(object);
    }


    @Override
    public Object pop() {
        return null;
    }
    static  class Node{
        Object object;
        Node next;
        Node befor;
        static int size = 0;
        Node(Node befor,Object object, Node next){
            this.befor = befor;
            this.object = object;
            this.next = next;
            size = 0;
        }

    }

}
