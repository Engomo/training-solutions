package week12d02;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreetTest {

    Street street = new Street();


    @Test
    void lastSoldTest() {
        street.sellSite(new Site(0,10,Fence.PERFECT));
        street.sellSite(new Site(0,7,Fence.NEED_UPGRADE));
        street.sellSite(new Site(1,12,Fence.NEED_UPGRADE));
        street.sellSite(new Site(0,9,Fence.PERFECT));
        street.sellSite(new Site(0,11,Fence.NO_FENCE));
        street.sellSite(new Site(1,13,Fence.PERFECT));

        assertEquals(3, street.lastSold());
    }

    @Test
    void fenceStatistic() {
        street.sellSite(new Site(0,10,Fence.PERFECT));
        street.sellSite(new Site(0,7,Fence.NEED_UPGRADE));
        street.sellSite(new Site(1,12,Fence.NEED_UPGRADE));
        street.sellSite(new Site(0,9,Fence.PERFECT));
        street.sellSite(new Site(0,11,Fence.NO_FENCE));
        street.sellSite(new Site(1,13,Fence.PERFECT));

//        assertEquals(3,);
//        assertEquals(2,);
//        assertEquals(1,);
        assertEquals("[3, 2, 1]", Arrays.toString(street.fenceStatistic()));
    }
}