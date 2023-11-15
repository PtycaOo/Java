import java.util.List;
import java.util.Objects;

public class Cat {
    String name;
    String owner;
    String breed;
    int age;
    double weigth;
    List<String> heal;

    public Cat(String name, String owner, String breed, int age, double weigth) {
        this.name = name;
        this.owner = owner;
        this.breed = breed;
        this.age = age;
        this.weigth = weigth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Double.compare(weigth, cat.weigth) == 0 && Objects.equals(name, cat.name) && Objects.equals(owner, cat.owner) && Objects.equals(breed, cat.breed);
    }

    @Override
    public int hashCode() {
        return 11 * age + (int) weigth + 13 * name.hashCode() + 2 * owner.hashCode() + 6 * breed.hashCode();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name= '" + name + '\'' +
                ", owner= '" + owner + '\'' +
                ", breed= '" + breed + '\'' +
                ", age= " + age +
                ", weigth= " + weigth +
                '}';
    }
}
