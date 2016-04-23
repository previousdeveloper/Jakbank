package model;


import com.flextrade.jfixture.JFixture;
import lib.model.AtmRecord;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AtmRecordTests {

    private AtmRecord atmRecord;

    @Before
    public void setUp() throws Exception {

        JFixture fixture = new JFixture();
        atmRecord = fixture.create(AtmRecord.class);

    }

    @Test
    public void city_should_not_be_null() {

        assertThat(atmRecord.getCity()).isNotEmpty();
    }

    @Test
    public void address_should_not_be_null() {

        assertThat(atmRecord.getAddress()).isNotEmpty();
    }

    @Test
    public void deviceType_should_not_be_null() {

        assertThat(atmRecord.getDeviceType()).isNotEmpty();
    }

    @Test
    public void district_should_not_be_null() {

        assertThat(atmRecord.getDistrict()).isNotEmpty();
    }

    @Test
    public void latitude_should_not_be_null() {

        assertThat(atmRecord.getLatitude()).isNotEmpty();
    }

    @Test
    public void longitude_should_not_be_null() {

        assertThat(atmRecord.getLongitude()).isNotEmpty();
    }

    @Test
    public void name_should_not_be_null() {

        assertThat(atmRecord.getName()).isNotEmpty();
    }

    @Test
    public void isExchangeAvailable_should_not_be_null() {

        assertThat(atmRecord.isExchangeAvailable());
    }
}
