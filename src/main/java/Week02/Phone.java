package Week02;

public class Phone {
    private String type;
    private int mem;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMem() {
        return mem;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }


    public Phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("Samsung",16);
        Phone phone2 = new Phone("Apple",8);
    }
}
