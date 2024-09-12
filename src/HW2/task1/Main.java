package HW2.task1;

//створити клас, який би описував подібні об'єкти виклористовуючи композицію/агрегацію
//https://jsonplaceholder.typicode.com/users/1


    public class Main {

        public static void main(String[] args) {
            User user = new User(
                    "Max",
                    "Popov",
                    "admin@gmail.com",
                    new Address("street", "suit", "city", "303000", "03254", "4444"),
                    "0265444555555",
                    "www.com",
                    new Company("Apple", "A1", "A2")
            );

            System.out.println(user);
        }
    }
