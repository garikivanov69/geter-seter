package cat;

/**
 * This class represents a cat. That allows us to create cats with a particular name which is passed through a constructor.
 * If we use the constructor without parameters, name will be set "default".
 * We can change the name of a Cat if it equals "default". Otherwise changing names is forbidden.
 */
public class Cat {
    /**
     * This field stores a name of a CAT
     */
    private String name;

    /**
     * Constructor recieves a parameter "name" and saves it in the name field
     * @param name - name of a Cat
     */
    public Cat(String name) {
        this.name = name;
    }

    /**
     * Constructor create an object of Cat and assigns name equal "default"
     */
    public Cat() {
        this.name = "default";
    }

    /**
     * This method returns a name of Cat
     * @return name of Cat
     */
    public String getName() {
        return name;
    }

    /**
     * This method recieves name of Cat and sets one if a current name of Cat equal "default"
     * @param name - name of Cat
     */
    public void setName(String name) {
        if (this.name == "default") {
            this.name = name;
        }
    }
}
