package lab06;

public class Lab06_4 {
    public static void main(String[] args) {
        String url = "https://google.com";
        if (url.contains("https:"))
            System.out.println("The protocol is https");
        else if (url.contains("http:"))
            System.out.println("The protocol is http");

        int indexDomainName = url.indexOf("//") + 2;
        String domainName= url.substring(indexDomainName, url.length());
        System.out.println("Domain name is: " + domainName);

        int indexExtension = url.indexOf(".");
        String extension= url.substring(indexExtension, url.length());
        System.out.println("Extension is: " + extension);
    }
}
