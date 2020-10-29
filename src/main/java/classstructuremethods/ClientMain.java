package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("Sanyi");
        client.setYear(1987);
        client.setAdress("6000 Kecskemét Petőfi Sándor u. 48");
        System.out.println(client.getName() + "\n" + client.getYear() + "\n" + client.getAdress());

        client.migrate("6000 Kecskemét Új u. 111");
        System.out.println("Az új címe: " + client.getAdress());
    }
}
