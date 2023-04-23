package org.example;

import org.example.model.Employee;

import java.util.HashMap;
import java.util.Map;

/**
 * Interview Question : can we use user defined or custom java object as key in Map
 * Answer: Yes we can, but we have to override hashCode() and equals() and provide our own logic.
 * Note: if two objects are equal(), then their hashcode() should be equal as well!
 *
 * OUTPUT of below program:
 *
 * Employee{name='Siba', age=36}=>ESB Team
 * Employee{name='OMS', age=49}=>ESB Team
 * Employee{name='Prabhat', age=34}=>ESB Team
 * Is Key: Employee{name='Prabhat', age=34} available => true
 *
 */
public class UserDefinedObjectUseAsMapKey {

    public static void main(String[] args) {
        Map<Employee,String> empMap = new HashMap<>();
        empMap.put(new Employee("Prabhat",34),"ESB Team");
        empMap.put(new Employee("Siba",36),"ESB Team");
        empMap.put(new Employee("OMS",49),"ESB Team");

        System.out.println();

        empMap.forEach((k,v)-> System.out.println(k+"=>"+v));

        Employee emp1 = new Employee("Prabhat",34);
        System.out.println("Is Key: "+emp1+" available => "+empMap.containsKey(emp1));
    }
}
