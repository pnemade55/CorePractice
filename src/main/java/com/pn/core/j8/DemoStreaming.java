package com.pn.core.j8;

import java.util.*;
import java.util.stream.Collectors;

/**
 * created by : pnema
 * on 7/8/2021
 */
public class DemoStreaming {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        int[] arr = {4, 6, 7, 1, 2, 3, 8, 10, 9, 5};
        //list= Arrays.stream(arr).boxed().filter(i-> i> 2).collect(Collectors.toList());
        list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        list = list.stream().filter(i -> i > 2).sorted().collect(Collectors.toList());
        list.forEach(System.out::println);

        List<Employee> employees = new ArrayList<>();
        Employee[] emp = {new Employee(3, "e3"), new Employee(1, "e1"), new Employee(9, "e9"), new Employee(2, "e12"), new Employee(5, "e5"), new Employee(2, "e2")};
        employees = Arrays.asList(emp);

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
}
