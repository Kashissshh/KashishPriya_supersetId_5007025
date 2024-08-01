package designpattern_and_principles;

public class BuilderPatternTest {
public static void main(String[] args) {
        
        Computer basicComputer = new Computer.Builder()
                .CPU("Intel i3")
                .RAM("8GB")
                .storage("256GB SSD")
                .build();
        System.out.println("Basic Computer: " + basicComputer);

        
        Computer gamingComputer = new Computer.Builder()
                .CPU("Intel i9")
                .RAM("32GB")
                .storage("1TB NVMe SSD")
                .GPU("NVIDIA RTX 3080")
                .operatingSystem("Windows 10")
                .build();
        System.out.println("Gaming Computer: " + gamingComputer);

        
        Computer customComputer = new Computer.Builder()
                .CPU("AMD Ryzen 7")
                .RAM("16GB")
                .GPU("AMD Radeon RX 6700 XT")
                .build();
        System.out.println("Custom Computer: " + customComputer);
    }

}
