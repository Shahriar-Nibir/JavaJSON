package com.shahriar;

public class UserClass {
    String name;
    String email;
    String password;
    String fullName;
    String phoneNumber;

    Address address = new Address();



    public void createProfile(String name1, String email1, String password1,
                                                   String fullName1, String phoneNumber1, String street1, String city1,
                                                   String district1, String country1, String postCode1){
        this.name = name1;
        this.email = email1;
        this.password = password1;
        this.fullName = fullName1;
        this.phoneNumber = phoneNumber1;
        address.street = street1;
        address.city = city1;
        address.district = district1;
        address.country = country1;
        address.postalCode = postCode1;
    }
}
