/*
 * object:
 * Тип данных Object – «всему голова»
    Упаковка – любой тип можно положить в переменную типа Object
    Распаковка – преобразование Object-переменной в нужный тип
    Иерархия типов – любой тип «ниже» Object’а
 * Иерархия коллекций. List
 * List – пронумерованный набор элементов.
    Пользователь этого интерфейса имеет точный контроль над тем,
    где в списке вставляется каждый элемент.
    Пользователь может обращаться к элементам по их целочисленному
    индексу (позиции в списке) и искать элементы в списке.
    URL
    ArrayList, LinkedList (Vector, Stack – устаревшие)
 * «Удобный массив»
    Разные способы создания
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<>();
    ArrayList<Integer> list3 = new ArrayList<>(10);
    ArrayList<Integer> list4 = new ArrayList<>(list3);
 * Коллекции.Функционал
 * add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
    get(pos) – возвращает элемент из списка по указанной позиции
    indexOf(item) – первое вхождение или -1
    lastIndexOf(item) – последнее вхождение или -1
    remove(pos) – удаление элемента на указанной позиции и его возвращение
    set(int pos, T item) – gjvtoftn значение item элементу, который находится
    на позиции pos
    void sort(Comparator) – сортирует набор данных по правилу
    subList(int start, int end) – получение набора данных от позиции start до end
    ------------------------------------------------------------------------------
 *  clear() – очистка списка
    toString() – «конвертация» списка в строку
    Arrays.asList – преобразует массив в список
    containsAll(col) – проверяет включение всех элементов из col
    removeAll(col) – удаляет элементы, имеющиеся в col
    retainAll(col) – оставляет элементы, имеющиеся в col
    toArray() – конвертация списка в массив Object’ов
    toArray(type array) – конвертация списка в массив type
    List.copyOf(col) – возвращает копию списка на основе имеющегося
    List.of(item1, item2,...) – возвращает неизменяемый список
 *  Итератор
 * Получение итератора с целью более гибкой работы с данными URL
    Интерфейс Iterator<E>. Итератор коллекцией. Iterator занимает место
    Enumeration в Java Collections Framework. Итераторы отличаются от
    перечислений двумя способами:
    Итераторы позволяют вызывающей стороне удалять элементы из
    базовой коллекции во время итерации с четко определенной
    семантикой.
    hasNext(), next(), remove()
    ListIterator<E> URL
    hasPrevious(), E previous(), nextIndex(), previousIndex(), set(E e), add(E e)
 */


package Lecture_3;

public class Lecture_3 {
    public static void main(String[] args) {
        Object o = 1; GetType(o); // java.lang.Integer
        o = 1.2; GetType(o); // java.lang.Double
    }
    static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
        System.out.println(Sum(1, 2));
        System.out.println(Sum(1.0, 2));
        System.out.println(Sum(1, 2.0));
        System.out.println(Sum(1.2, 2.1));
    }
    static Object Sum(Object a, Object b) {
        if (a instanceof Double && b instanceof Double) {
            return (Object)((Double) a + (Double) b);
        } else if(a instanceof Integer && b instanceof Integer) {
            return (Object)((Integer) a + (Integer) b);
        } else return 0;

    }
}
