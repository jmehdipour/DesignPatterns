package creational.builder;

public class Person {
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String country;
    private int age;
    private double weight;
    private double height;
    private String fatherName;
    private String motherName;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getFatherName() {
        return this.fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return this.motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }


    private Person(Builder builder){
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.middleName = builder.middleName;
        this.fatherName = builder.fatherName;
        this.motherName = builder.motherName;
        this.weight = builder.weight;
        this.height = builder.height;
        this.country = builder.country;
    }

    

    public static class Builder {
        //required
        private int id;
        private String firstName;
        private String lastName;

        // Optional
        private String middleName;
        private String country;
        private int age;
        private double weight;
        private double height;
        private String fatherName;
        private String motherName;

        // pasing required parameters
        public Builder(int id, String  fisrtName, String lastName){
            this.id = id;
            this.firstName = fisrtName;
            this.lastName = lastName;
        }


        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Builder setCountry(String country){
            this.country = country;
            return this;
        }

        public Builder setFatherName(String fatherName){
            this.fatherName = fatherName;
            return this;
        }

        public Builder setMotherName(String motherName){
            this.motherName = motherName;
            return this;
        }

        public Builder setWeight(float weight){
            this.weight = weight;
            return this;
        }

        public Builder setHeight(float height){
            this.height = height;
            return this;
        }

        public Person build(){
            return new Person(this);
        }


    }




}