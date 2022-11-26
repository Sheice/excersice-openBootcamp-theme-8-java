public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setAge(15);
        person.setName("Juan");
        person.setPhone(14562378);

        System.out.println("Usted de se llama " + person.getName() +
                        " y tiene " + person.getAge() + " años, lo llamaremos al teléfono: " + person.getPhone()
               );

    }

    static class Person {
        private int age;
        private String name;
        private int phone;

        // GETTER AND SETTERS


        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPhone() {
            return phone;
        }

        public void setPhone(int phone) {
            this.phone = phone;
        }
    }
}