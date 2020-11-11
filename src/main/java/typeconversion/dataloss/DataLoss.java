package typeconversion.dataloss;

public class DataLoss {
    public static final int MAX_NUMBER_OF_LOSS = 3;

    public void dataloss() {
        long original = 0;
        for(long conuter = 0; conuter < MAX_NUMBER_OF_LOSS; ) {
            long converted = (long) (float) original;
            if(converted != original) {
                System.out.println("Original :" + original + " in binary: " + Long.toBinaryString(original));
                System.out.println("Converted :" + converted + " in binary: " + Long.toBinaryString(converted));
                conuter++;
            }
            original++;

        }
    }

    public static void main(String[] args) {
        new DataLoss().dataloss();
    }
}
