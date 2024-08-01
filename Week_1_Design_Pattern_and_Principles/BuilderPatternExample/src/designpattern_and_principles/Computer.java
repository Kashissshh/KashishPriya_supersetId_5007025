package designpattern_and_principles;

public class Computer {
	private String CPU;
    private String RAM;
    private String storage;
    private String GPU;
    private String operatingSystem;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.GPU = builder.GPU;
        this.operatingSystem = builder.operatingSystem;
    }

    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private String GPU;
        private String operatingSystem;

        public Builder CPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder RAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder GPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder operatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", GPU='" + GPU + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}



