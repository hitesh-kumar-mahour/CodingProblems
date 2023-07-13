package LLD.DesignPatterns.Creational.Builder;

public class Student {

    String name;
    int rollNumber;
    String address;

    public Student(Builder builder) {
        this.rollNumber = builder.rollNumber;
        this.name = builder.name;
        this.address = builder.address;
    }

    public static Builder StudentBuilder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return this.rollNumber + " " + this.name + " " + this.address;
    }

    static class Builder {
        private String name;
        private int rollNumber;
        private String address;

        public Builder setRollNumber(int id) {
            this.rollNumber = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

    }

    public static void main(String[] args) {
        Student s = Student.StudentBuilder().setName("Hitesh").setRollNumber(7).setAddress("Delhi").build();
        System.out.println(s);
    }
}
