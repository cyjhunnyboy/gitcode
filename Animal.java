package per.cyj.demo;

public class Animal {

    private String name;

    private String species;

    private String color;

    private Integer age;

    private String gender;

    public Animal() {
    	super();
    }

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

    public String toString() {
    	return "Animal(name=" + this.name + ",age=" + this.age + ",gender=" + this.gender + ",species=" + this.species + ",color=" + this.color + ")";
    }
}
