package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author taoyr
 */
public class TestStream {

    public static void main(String[] args) {
        Student zhb = new Student("zhb", 18);
        Student zhb2 = new Student("bb", 18);
        Student zhb3 = new Student("aa", 18);
        Student zhb1 = new Student("zh", 19);
        List<Student> studentList = new ArrayList<>();
        studentList.add(zhb);
        studentList.add(zhb1);
        studentList.add(zhb2);
        studentList.add(zhb3);
        List<String> collect = studentList.stream().filter(index ->
                index.getAge() == 18
        ).map(index -> index.getName()).collect(Collectors.toList());
        studentList.forEach(index -> {
            index.setSex("男");
        });
        System.out.println(studentList);
        Map<Student,String> map=new HashMap<>();
        map.put(new Student("zhb", 18),"11");
        map.put(new Student("zhb", 18),"12");
        map.put(new Student("zhb", 18),"13");
        Iterator<Map.Entry<Student, String>> iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext()){
            Map.Entry<Student, String> next = iterator1.next();
            Student key = next.getKey();
            System.out.println(key.getName());
        }



    }
}
