import java.util.Scanner;
public class Main {
    private  final static Scanner scanner = new Scanner(System.in);

    private  final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        var option = -1;
        do{
            System.out.println("Escolha uma das opções");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastercer maquina de água");
            System.out.println("3 - Abastercer maquina de shampoo");
            System.out.println("4 - Verificar água");
            System.out.println("5 - Verificar shampoo");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na maquina ");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar maquina");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> petMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWaterAmount();
                case 5 -> verifyShampooAmount();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();  
                case 9 -> petMachine.wash();     
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida");
            }
        }while(option != 0);       
    }

    private static void setWater() {
        System.out.println("Tentando colocar agua na maquina");
        petMachine.addWater();
    }

    private static void setShampoo() {
        System.out.println("Tentando colocar shampoo na maquina");
        petMachine.addShampoo();
    }

    private static void verifyWaterAmount() {
        var amout = petMachine.getWater();
        System.out.println("A quantidade de agua é "+amout+" litros");
    }

    private static void verifyShampooAmount() {
        var amout = petMachine.getShampoo();
        System.out.println("A quantidade de shampoo é "+amout+" litros");
    }
    
    private static void checkIfHasPetInMachine() {
      var hasPet = petMachine.hasPet();
      System.out.println(hasPet ? "Tem pet na máquina" : "Não tem pet na máquina");
    }

    public static void setPetInPetMachine(){
        var name ="";
        while (name == null|| name.isEmpty()){
            System.out.println("Informe o nome do pet");
            scanner.nextLine();
            name = scanner.nextLine();
        }

        var pet = new Pet(name);
        petMachine.setPet(pet);
    }



}
