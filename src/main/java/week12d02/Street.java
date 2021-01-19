package week12d02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Street {

    private List<Site> sites = new ArrayList<>();

    public void sellSite(Site site) {
        sites.add(site);
    }

    public int lastSold() {
        int even = 0;
        int odd = -1;

        for (Site s : sites) {
            if (s.getSide() == 0) {
                even += 2;
            } else {
                odd += 2;
            }
        }
        if (sites.get(sites.size() - 1).getSide() == 0) {
            return even;
        } else {
            return odd;
        }
    }

    public int[] fenceStatistic() {
        int[] result = new int[3];
        for (Site s : sites) {
            result[s.getFence().getValue()]++;
        }
        return result;
    }

    public List<FenceTypes> fenceStatistic2() {
        int[] result = new int[3];
        for (Site s : sites) {
            result[s.getFence().getValue()]++;
        }
        return Arrays.asList(new FenceTypes(result[0], Fence.PERFECT), new FenceTypes(result[1], Fence.NEED_UPGRADE), new FenceTypes(result[2], Fence.NO_FENCE));
    }

    public static void main(String[] args) {
        Street street = new Street();
        street.sellSite(new Site(0,10,Fence.PERFECT));
        street.sellSite(new Site(0,7,Fence.NEED_UPGRADE));
        street.sellSite(new Site(1,12,Fence.NEED_UPGRADE));
        street.sellSite(new Site(0,9,Fence.PERFECT));
        street.sellSite(new Site(0,11,Fence.NO_FENCE));
        street.sellSite(new Site(1,13,Fence.PERFECT));

        System.out.println(street.fenceStatistic2().toString());
    }

}
