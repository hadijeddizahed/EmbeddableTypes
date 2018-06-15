package hadi.jeddizahed.sample.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Publisher {


    private String name;

    private String country;

    public Publisher(String name, String country) {
        this.name = name;
        this.country = country;
    }

    private Publisher() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}