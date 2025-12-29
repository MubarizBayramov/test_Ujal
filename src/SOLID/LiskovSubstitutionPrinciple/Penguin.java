package SOLID.LiskovSubstitutionPrinciple;

public class Penguin extends Bird{
    @Override
    void fly() { throw new UnsupportedOperationException(); }

    }

// Bird (quş) sinifi uçmağı təmsil edir, amma bütün quşlar uça bilmir (Penguin).