package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void collects() {
        Address adrs1 = new Address("Saint-Petersburg", "blvr Trydyashihsa", 2, 100);
        Address adrs2 = new Address("Moscow", "Usacheva street", 1, 1);
        Profile prs1 = Profile.of(adrs1);
        Profile prs2 = Profile.of(adrs2);
        List<Profile> profiles = List.of(prs1, prs2);
        List<Address> expected = List.of(adrs1, adrs2);
        assertThat(new Profiles().collect(profiles), is(expected));
    }

    @Test
    public void collectsCutDups() {
        Address adrs1 = new Address("Saint-Petersburg", "blvr Trydyashihsa", 2, 100);
        Address adrs2 = new Address("Moscow", "Usacheva street", 1, 1);
        Profile prs1 = Profile.of(adrs1);
        Profile prs2 = Profile.of(adrs2);
        Profile prs3 = Profile.of(adrs1);
        Profile prs4 = Profile.of(adrs2);
        List<Profile> profiles = List.of(prs1, prs2, prs3, prs4);
        List<Address> expected = new ArrayList<>();
        expected.add(adrs1);
        expected.add(adrs2);
        expected.sort(Comparator.comparing(Address::getCity));
        assertThat(new Profiles().cutDups(profiles), is(expected));
    }
}