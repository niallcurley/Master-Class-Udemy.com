package com.company;

public class Main {

    public static void main(String[] args) {

        ChurchMember churchMember = new ChurchMember();
        churchMember.name = "Terry Hogg";
        churchMember.age = 45;
        churchMember.address = "Deerpark Cottages, Randalstown";
        churchMember.martialStatus = "Married";
        churchMember.noOfDependents = 40;

        System.out.println(churchMember.name);
        System.out.println(churchMember.age);
        System.out.println(churchMember.address);
        System.out.println(churchMember.martialStatus);
        System.out.println(churchMember.postcode);
        System.out.println(churchMember.noOfDependents);

        churchMember.sing();
        churchMember.teach();
        churchMember.drive();


        System.out.println(churchMember.getAge());
        System.out.println(churchMember.getAddress());
        System.out.println(churchMember.noOfDependents);
        System.out.println(churchMember.martialStatus);


    }
}
