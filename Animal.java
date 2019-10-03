package per.cyj.demo;

/**
 * @author chenyongjun
 * @apiNote Animal动物类
 * @since 2019-10-03
 */
public class Animal {

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

    private String gender;

    /**
     * 种类
     */
    private String species;

    /**
     * 颜色
     */
    private String color;

    /**
     * 无参构造函数
     */
    public Animal() {
    	super();
    }

    /**
     * 带全部参数的构造方法，初始化Animal
     * @param name 姓名
     * @param age 年龄
     * @param gender 性别
     * @param species 种类
     * @param color 颜色
     */
    public Animal(String name, Integer age, String gender, String species, String color) {
    	this.name = name;
	this.age = age;
	this.gender = gender;
	this.species = species;
	this.color = color;
    }

    public String getName() {
    	return this.name;
    }

    public String getSpecies() {
    	return this.species;
    }

    public String getColor() {
    	return this.color;
    }

    public Integer getAge() {
    	return this.age;
    }

    public String gender() {
    	return this.gender;
    }

    /**
     * 覆盖父类的toString方法，将对象格式化输出
     * @return 返回对象格式化字符串
     */
    public String toString() {
    	return "Animal(name=" + this.name + ",age=" + this.age + ",gender=" + this.gender + ",species=" + this.species + ",color=" + this.color + ")";
    }
}
