package com.company;

public class CustomerApplication {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.setFirstName("Matt");
        customer.setLastName("Enos");
        customer.setEmail("me@me.com");
        customer.setPhoneNumber("6785959595");
        customer.setRewardsMember(true);

        Address shippingAddress = new Address();
        shippingAddress.setStreet("123 rosemary street");
        shippingAddress.setCity("Knoxville");
        shippingAddress.setState("TN");
        shippingAddress.setState("30215");

        customer.setShippingAddress(shippingAddress);

        Address billingAddress = new Address();
        billingAddress.setStreet("321 hollywood blvd");
        billingAddress.setCity("hollywood");
        billingAddress.setState("CA");
        billingAddress.setZip("54547");

        customer.setBillingAddress(billingAddress);

        System.out.println("you have created a new account");
        System.out.println(customer);
    }
}
