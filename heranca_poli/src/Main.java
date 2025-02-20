public class Main {
    public static void main(String[] args) throws Exception {
        Employee employee = new Employee();
        Manager manager = new Manager();

        manager.setLogin("joao");;
        manager.setPassword("123");;


        System.out.println(manager.getLogin());
        System.out.println(manager.getPassword());
    }
}
