package stringtype.registration;

public class UserValidator {
    public boolean isValisUsername(String username){
        return !"".equals(username);
    }

    public boolean isValidPassword(String password1, String password2){
        return password1.length() > 8 &&
        password1.equals(password2);
    }

    public boolean isValidEmail(String email){
        int kukac = email.indexOf('@');
        String domain = email.substring(kukac +1);
        int pont = domain.indexOf('.');
        return kukac > 0
                && pont > 0
                && pont < domain.length() - 1;
    }
}
