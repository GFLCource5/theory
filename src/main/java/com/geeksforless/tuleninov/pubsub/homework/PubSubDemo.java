package com.geeksforless.tuleninov.pubsub.homework;

public class PubSubDemo {

    public static void main(String[] args) {
        Subscriber sub1 = new SocialSubscriber("1", Topic.MATHEMATICS);
        Subscriber sub2 = new SocialSubscriber("2", Topic.PHYSIC);
        Subscriber sub3 = new SocialSubscriber("3", Topic.MATHEMATICS);
        Subscriber sub4 = new SocialSubscriber("4", Topic.MATHEMATICS, Topic.CHEMISTRY);
        Subscriber sub5 = new SocialSubscriber("5", Topic.MATHEMATICS);

        Publisher mathPublisher = new SocialPublisher(Topic.MATHEMATICS);
        Publisher physicPublisher = new SocialPublisher(Topic.PHYSIC);
        Publisher chemPublisher = new SocialPublisher(Topic.CHEMISTRY);

        Message newAlgorithm = new Message("New algorithm");
        Message kineticEnergy = new Message("Kinetic energy");
        Message tableOfElements = new Message("Table of elements");

        mathPublisher.notifySubscribers(newAlgorithm);
        physicPublisher.notifySubscribers(kineticEnergy);
        chemPublisher.notifySubscribers(tableOfElements);

        sub5.unRegisterSubscriber(Topic.MATHEMATICS);

        System.out.println();
        System.out.println("After drop - " + sub5);
        System.out.println();

        mathPublisher.notifySubscribers(newAlgorithm);
        physicPublisher.notifySubscribers(kineticEnergy);
        chemPublisher.notifySubscribers(tableOfElements);
    }
}
