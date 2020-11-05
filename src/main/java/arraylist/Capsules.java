package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
List<String> capsule = new ArrayList<>();

    public List<String> getColor() {
        return capsule;
    }

    public void addLast(String color){
        capsule.add(color);
    }

    public void addFirst(String color){
        capsule.add(0, color);
    }

    public void removeLast(){
        capsule.remove(capsule.size() - 1);
    }

    public void removeFirst(){
        capsule.remove(0);
    }

    public static void main(String[] args) {
        Capsules capsules = new Capsules();

        capsules.addLast("fekete");
        capsules.addLast("fehér");
        capsules.addLast("piros");
        System.out.println(capsules.getColor());

        capsules.addFirst("kék");
        System.out.println(capsules.getColor());

        capsules.removeFirst();
        System.out.println(capsules.getColor());

        capsules.removeLast();
        System.out.println(capsules.getColor());
    }
}
