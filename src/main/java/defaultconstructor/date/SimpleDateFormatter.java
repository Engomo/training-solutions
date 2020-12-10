package defaultconstructor.date;

public class SimpleDateFormatter {

    public String str = "-";
    private CountryCode defaultCountry;

    public SimpleDateFormatter() {
        this.defaultCountry = CountryCode.HU;
    }

    public String formatDateString(SimpleDate simpleDate) {
        return formatDateStringByCountryCode(defaultCountry,simpleDate);
    }

    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate) {
        if (countryCode == CountryCode.HU) {
            return simpleDate.getYear() + str + simpleDate.getMonth() + str + simpleDate.getDay();
        }
        if (countryCode == CountryCode.EN) {
            return simpleDate.getDay() + str + simpleDate.getMonth() + str + simpleDate.getYear();
        } else {
            return simpleDate.getMonth() + str + simpleDate.getDay() + str + simpleDate.getYear();
        }
    }
}
