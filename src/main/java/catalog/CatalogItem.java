package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogItem {

    private List<Feature> features = new ArrayList<>();
    private int price;
    private String registrationNumber;

    public List<Feature> getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public CatalogItem(String registrationNumber, int price, Feature... features) {
        this.registrationNumber = registrationNumber;
        this.price = price;
        this.features = Arrays.asList(features);
    }

    public boolean hasAudioFeature() {
        for (int i = 0; i < features.size(); i++) {
            if (features.get(i) instanceof AudioFeatures) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPrintedFeature() {
        for (int i = 0; i < features.size(); i++) {
            if (features.get(i) instanceof PrintedFeatures) {
                return true;
            }
        }
        return false;
    }

    public List<String> getContributors() {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < features.size(); i++) {
            result.addAll(features.get(i).getContributors());
        }
        return result;
    }

    public List<String> getTitles(){
        List<String> result = new ArrayList<>();
        for (int i = 0; i < features.size(); i++) {
            result.add(features.get(i).getTitle());
        }
        return result;
    }

    public int fullLengthAtOneItem() {
        int result = 0;
        for (Feature f : features) {
            if (f instanceof AudioFeatures) {
                result += ((AudioFeatures) f).getLength();
            }
        }
        return result;
    }

    public int numberOfPagesAtOneItem() {
        int result = 0;
        for (Feature f : features) {
            if (f instanceof PrintedFeatures) {
                result += ((PrintedFeatures) f).getNumberOfPages();
            }
        }
        return result;
    }
}
