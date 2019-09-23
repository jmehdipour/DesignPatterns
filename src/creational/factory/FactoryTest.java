package creational.factory;

public class FactoryTest {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "6 GB", "2.4 GHz", "500 TB");
        Computer server = ComputerFactory.getComputer("server", "16 GB", "2.9 GHz", "1 TB");

        System.out.println("Factory pc config::" + pc);
        System.out.println("Factory server config::"+ server);
    }
}