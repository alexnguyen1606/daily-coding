package com.designpattern.builder;

/**
 * @author:Nguyen Anh Tuan
 *     <p>10:31 AM ,July 20,2021
 */
public class Customer {

  private String fullName;
  private String identifierNumber;
  private String address;

  private Customer(Builder builder) {
    fullName = builder.fullName;
    identifierNumber = builder.identifierNumber;
    address = builder.address;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {

    private String fullName;
    private String identifierNumber;
    private String address;

    public Customer build() {
      return new Customer(this);
    }

    public Builder fullName(String fullName) {
      this.fullName = fullName;
      return this;
    }

    public Builder identifierNumber(String identifierNumber) {
      this.identifierNumber = identifierNumber;
      return this;
    }

    public Builder address(String address) {
      this.address = address;
      return this;
    }
  }

  public String getFullName() {
    return fullName;
  }

  public String getIdentifierNumber() {
    return identifierNumber;
  }

  public String getAddress() {
    return address;
  }

  @Override
  public String toString() {
    return "Customer{"
        + "fullName='"
        + fullName
        + '\''
        + ", identifierNumber='"
        + identifierNumber
        + '\''
        + ", address='"
        + address
        + '\''
        + '}';
  }

  public static void main(String[] args) {
    Customer customer =
        Customer.builder()
            .fullName("Nguyễn Anh Tuấn")
            .identifierNumber("145732267")
            .address("Hưng yên")
            .build();
    System.out.println(customer.toString());
  }
}
