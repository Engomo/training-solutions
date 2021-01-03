package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem item) {
        catalogItems.add(item);
    }

    public double averagePageNumberOver(int limit) {
        if (limit < 1) {
            throw new IllegalArgumentException("Page number must be positive");
        }
        int pieces = 0;
        int sum = 0;

        for (CatalogItem c : catalogItems) {
            if (c.numberOfPagesAtOneItem() > limit) {
                sum += c.numberOfPagesAtOneItem();
                pieces++;
            }
        }
        if (pieces == 0) {
            throw new IllegalArgumentException("No page");
        }
        return sum / pieces;
    }

    public void deleteItemByRegistrationNumber(String rn) {
        for (int i = 0; i < catalogItems.size(); i++) {
            if (catalogItems.get(i).getRegistrationNumber().equals(rn)) {
                catalogItems.remove(catalogItems.get(i));
            }
        }
    }

    public int getAllPageNumber() {
        int result = 0;
        for (CatalogItem c : catalogItems) {
            result += c.numberOfPagesAtOneItem();
        }
        return result;
    }

    public int getFullLength() {
        int result = 0;
        for (CatalogItem c : catalogItems) {
           result += c.fullLengthAtOneItem();
        }
        return result;
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem c : catalogItems) {
            if (c.hasAudioFeature()) {
                result.add(c);
            }
        }
        return result;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem c : catalogItems) {
            if (c.hasPrintedFeature()) {
                result.add(c);
            }
        }
        return result;
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem c : catalogItems) {
            if (isContains(searchCriteria.getTitle(), c.getTitles()) || isContains(searchCriteria.getContributor(), c.getContributors())) {
                result.add(c);
            }
        }
        return result;
    }

    private boolean isContains(String str, List<String> list) {
        for (String s : list) {
            if (str.equals(s)) {
                return true;
            }
        }
        return false;
    }
}
