package QUESTION_4;

public class persion {
	 private String name;
	    private int age;

	    public persion(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Setters
	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    // Getters
	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    // Override toString method
	    @Override
	    public String toString() {
	        return "Name: " + name + ", Age: " + age;
	    }
	

}
