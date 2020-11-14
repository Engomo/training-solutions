package week03;

public class PhoneParser {

    public Phone parse(String phoneNumber){
       int kotojel = phoneNumber.indexOf("-");
       String prefix = phoneNumber.substring(0, kotojel);
       String number = phoneNumber.substring(kotojel + 1);
       Phone phone = new Phone(prefix, number);
       return phone;
    }
}
