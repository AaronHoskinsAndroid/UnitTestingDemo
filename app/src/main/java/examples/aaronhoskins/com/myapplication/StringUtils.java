package examples.aaronhoskins.com.myapplication;

public class StringUtils {

    public String concatTwoStrings(String s1, String s2) {
        return s1.concat(s2);
    }

    public boolean stringProperLength(String s1) {
        int s1Length = s1.length();
        return s1Length >= 4;
    }

    public String getFullName(Person person) {
        return String.format("%s %s", person.getFirstName(), person.getLastName());
    }
}
