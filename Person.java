package per.cyj.demo;


/**
 * @author chenyongjun
 * @apiNote Person类
 * @since 2019-10-03
 */
public class Person {

    private String name;
    private Integer age;
    private String sex;

    public Person(){
    	super();
    }

    public Person(String name, Integer age, String sex) {
    
        this.name = name;
	this.age = age;
	this.sex =sex;
    }
}
