package com.pn.core.j8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * created by : pnema
 * on 7/8/2021
 */
public class DemoListStreaming {
    public static void main(String[] args) {
      /*  filteringList();
        System.out.println("----------------");
        removeDuplicatesUsingStream();
        System.out.println("----------------");
        useOfFlatMap();
        System.out.println("----------------");
        sortingListOfObjects();
        System.out.println("----------------");
        sortListOfObjectBasedOnItsStates();
        System.out.println("----------------");*/
        sortMapOfObjectBasedOnItsStates();
    }

    private static void sortMapOfObjectBasedOnItsStates() {
        Map<Employee, String> emp = getEmployeesMap();
        System.out.println("------- Sorted map using Key Objects Attribute -------------");
        Map<Employee, String> employeesbyName= emp.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName)))
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e1, LinkedHashMap::new));
        employeesbyName.forEach((k, v) -> System.out.println(k + " , " + v));

        System.out.println("------- Sorted map using value ---------------");
        Map<Employee, String> employeesbyCity = emp.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(
                        Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new)
                );

        employeesbyCity.forEach((k, v) -> System.out.println(k + " , " + v));
    }

    private static void sortListOfObjectBasedOnItsStates() {
        List<Employee> employees = getEmployeesList();

        employees.stream().sorted(Comparator.comparingInt(Employee::getId)).collect(Collectors.toList()).forEach(e -> System.out.println(e));
        System.out.println("----------------");
        List<Employee> employees2 = employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        employees2.forEach(e -> System.out.println(e));
    }

    private static void useOfFlatMap() {
        List<String> list = Stream.of("a", "b")
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        List<List<String>> lists = Arrays.asList(
                Arrays.asList("a"),
                Arrays.asList("b"));

        List<String> flatList = lists.stream().flatMap(Collection::stream).collect(Collectors.toList());

        list.forEach(l -> System.out.println(l));
        flatList.forEach(l -> System.out.println(l));
    }

    private static void removeDuplicatesUsingStream() {
        int arr[] = {5, 6, 3, 6, 5, 6, 4, 4, 5, 6};
       /* List<Integer> intList = new ArrayList<Integer>(arr.length);
        for (int i : arr)
        {
            intList.add(i);
        }*/

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));

        List<Integer> unique = list.stream().distinct().collect(Collectors.toList());

        for (int a : unique) {
            System.out.println(a);
        }
    }

    private static void sortingListOfObjects() {
        List<Employee> employees = getEmployeesList();

        employees = employees.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.id == o2.id) {
                    return o1.name.compareTo(o2.name);
                } else if (o1.id > o2.id) {
                    return 1;
                } else return -1;
            }
        }).collect(Collectors.toList());

        employees.forEach(e -> System.out.println(e.getId() + ":" + e.getName()));
    }

    private static List<Employee> getEmployeesList() {
        List<Employee> employees;
        Employee[] emp = {new Employee(3, "Nixon"), new Employee(1, "Parag"), new Employee(9, "Ayush"), new Employee(2, "Gaurav"), new Employee(5, "Vipul"), new Employee(2, "Priyanka")};
        employees = Arrays.asList(emp);
        return employees;
    }

    private static Map<Employee, String> getEmployeesMap() {
        Map<Employee, String> employeeMp = new HashMap<>();
        employeeMp.put(new Employee(3, "Nixon"), "Mumbai");
        employeeMp.put(new Employee(1, "Parag"), "Badlapur");
        employeeMp.put(new Employee(9, "Ayush"), "Vadgaon");
        employeeMp.put(new Employee(2, "Gaurav"), "Indore");
        employeeMp.put(new Employee(5, "Vipul"), "Banswara");
        employeeMp.put(new Employee(2, "Priyanka"), "Malad");
        return employeeMp;
    }


    private static void filteringList() {
        List<Integer> list = new ArrayList<>();
        int[] arr = {4, 6, 7, 1, 2, 3, 8, 10, 9, 5};
        //list= Arrays.stream(arr).boxed().filter(i-> i> 2).collect(Collectors.toList());
        list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        list = list.stream().filter(i -> i > 2).sorted().collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
