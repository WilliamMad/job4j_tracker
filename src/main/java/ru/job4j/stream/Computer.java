package ru.job4j.stream;

public class Computer {

    private String computerName;
    private String cpu;
    private String motherboard;
    private String videoCard;
    private String hardDisc;
    private byte ram;

    @Override
    public String toString() {
        return "Computer:"
                + System.lineSeparator()
                + "Computer Name = " + computerName
                + System.lineSeparator()
                + "CPU = " + cpu
                + System.lineSeparator()
                + "Motherboard = " + motherboard
                + System.lineSeparator()
                + "Video Card = " + videoCard
                + System.lineSeparator()
                + "Hard Disc = " + hardDisc
                + System.lineSeparator()
                + "RAM (GB) = " + ram;
    }

    static class Builder {
        private String computerName;
        private String cpu;
        private String motherboard;
        private String videoCard;
        private String hardDisc;
        private byte ram;

        Builder buildComputerName(String computerName) {
            this.computerName = computerName;
            return this;
        }

        Builder buildCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        Builder buildMotherboard(String motherboard) {
            this.motherboard = motherboard;
            return this;
        }

        Builder buildVideoCard(String videoCard) {
            this.videoCard = videoCard;
            return this;
        }

        Builder buildHardDisc(String hardDisc) {
            this.hardDisc = hardDisc;
            return this;
        }

        Builder buildRam(byte ram) {
            this.ram = ram;
            return this;
        }

        Computer build() {
            Computer user = new Computer();
            user.computerName = computerName;
            user.cpu = cpu;
            user.motherboard = motherboard;
            user.videoCard = videoCard;
            user.hardDisc = hardDisc;
            user.ram = ram;
            return user;
        }

        public static void main(String[] args) {
            Computer user = new Builder().buildComputerName("Gaming PC")
                    .buildCpu("Intel Core i7-11700K(F)")
                    .buildMotherboard("GIGABYTE Z590 GAMING X")
                    .buildVideoCard("GIGABYTE GeForce RTX 3080 GAMING")
                    .buildHardDisc("1024GB HYPERPC M.2")
                    .buildRam((byte) 64)
                    .build();
            System.out.println(user);
        }
    }
}
