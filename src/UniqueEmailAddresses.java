import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

    public static void main(String[] args) {
        String[] input = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        System.out.println(new UniqueEmailAddresses().numUniqueEmails(input));
    }

    private int numUniqueEmails(String[] emails) {
        Set<String> uniqEmailSet = new HashSet<>();

        for (String email : emails) {
            String domainName = email.split("\\@")[1];
            String localName = email.split("\\+")[0];

            System.out.println("Old Value: " + email);

            localName = localName.replaceAll("\\.", "");

            System.out.println("New Value: " + localName);

            String newEmail = localName + "@" + domainName;

            uniqEmailSet.add(newEmail);
        }

        System.out.println(uniqEmailSet);

        return uniqEmailSet.size();
    }

    private int numUniqueEmailsGood(String[] emails) {
        Set<String> seen = new HashSet();
        for (String email: emails) {
            int i = email.indexOf('@');
            String rest = email.substring(i);
            seen.add(rest);
        }
        return seen.size();
    }
}
