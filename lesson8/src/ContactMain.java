public class ContactMain {
    public static void main(String[] args) {
        Contact person = new Contact("Алексей", "Бабушкин", "03");
        person.print();
        System.out.println();
        person.setPhone("02");
        String phone1 = person.getPhone();
        System.out.println(phone1);
    }
}
