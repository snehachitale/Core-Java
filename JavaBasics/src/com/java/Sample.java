package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Sample
{
    public static void main(String[] args)
    {
        // 1.Check if "name" is part of below string
        // 2.Print the number of words in the below string
        String str="My Name is John";
        
      
        System.out.println(str.toLowerCase().contains("name"));

        
        //3.Can there be a different way for initializing a list at the time of declaration
        //4.Check if "ghi" is part of below list using streams api
        List<String> list= Arrays.asList(new String[]{"abc", "def", "ghi"});
        
        Optional<String> string = list.stream().filter(l -> "ghi".equals(l)).findAny();
        System.out.println(string);
        
        //5. What would be the Output for the below statements and why
        System.out.println(100 + 100 +"Fyndna");
        System.out.println("Fyndna" + 100 + 100);

        //6.There are 2 tables
        // employee{id,name,department_id}
        // department{id,name}
        // Write a query to get the name of departments where the number of employees is greater than 15
        //select name from department where id = (select department_id from employee having count(department_id) > 15);
    }
}