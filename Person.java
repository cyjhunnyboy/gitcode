package per.cyj.demo;


/**
 * @author chenyongjun
 * @apiNote Person类
 * @since 2019-10-03
 */
public class Person {

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String sex;

    /**
     * 无参构造函数
     */
    public Person(){
    	super();
    }

    /**
     * @param name 姓名
     * @param age 年龄
     * @param sex 性别
     */
    public Person(String name, Integer age, String sex) {
    
        this.name = name;
	this.age = age;
	this.sex =sex;
    }
}
