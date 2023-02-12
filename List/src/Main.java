public class Main {
    public static void main(String[] args) {
        List<Integer> List = new List<>(-5);
        List.add(10);
        List.add(20);
        List.add(30);
        List.add(80);
        List.add(50);
        List.add(60);
        List.add(70);
        List.add(80);
        List.add(90);

        System.out.print("Number of elements in the array: " + List.size());
        System.out.print("Array Capacity: " + List.getCap());
        System.out.print("value at the entered index: " + List.get(1));
        System.out.print("deleted value : " + List.remove(4));
        System.out.print("After replacing the element in the index : " + List.set(2, 500));
        System.out.print("My list: " + List.toString());
        System.out.print("index of entered data in array " + List.indexOf(90));
        System.out.print("last index of: " + List.lastIndexOf(80));
        System.out.print(List.isEmpty());

        Object[] array = List.toArray();
        System.out.println(array[0]);

        System.out.println(List.subList(1, 3));
        System.out.println(List.contains(8));
        System.out.println(List.contains(80));

        List.clear();
        System.out.println("Number of elements in the array: " + List.size());
        System.out.println("Array Capacity: " + List.getCap());
        System.out.println("My List: " + List.toString());
    }
}