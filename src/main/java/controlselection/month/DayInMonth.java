package controlselection.month;

public class DayInMonth {

    public int honapnapjai(int év, String honap) throws IllegalAccessException {
        switch (honap.toLowerCase()){
            case "január":
            case "március":
            case "május":
            case "július":
            case "augusztus":
            case "október":
            case "december":
                return 31;

            case "április":
            case "június":
            case "szeptember":
            case "november":
                return 30;

            case "február":
                if(((év / 4) == 0 && (év / 100) != 0) || év / 400 == 0){
                    return 29;
                }
                else {
                    return 28;
                }

        default:
            throw new IllegalAccessException("Nem ismert hónap: " + honap);
    }
}

    public static void main(String[] args) {

    }
}
