package forms;

/**
 * @author Tigran.Mkrtchyan
 * @since 11/29/2016.
 */
public class UserForm {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "forms.UserForm{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
