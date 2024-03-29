package no.kristiania.person;

public class Person {
    private long id;
    private Object firstName;
    private String lastName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(Object firstName) {
        this.firstName = firstName;
    }

    public Object getFirstName() {
        return firstName;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName=" + firstName + '\'' +
                '}';
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
}
