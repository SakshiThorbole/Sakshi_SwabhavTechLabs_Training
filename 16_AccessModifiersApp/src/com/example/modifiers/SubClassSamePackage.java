package com.example.modifiers;

public class SubClassSamePackage extends TestModifiers {
    public static void main(String[] args) {
        SubClassSamePackage ssp = new SubClassSamePackage();
        ssp.accessMembers();
    }

    public void accessMembers() {
        // System.out.println(privateMember);  // Not accessible
        System.out.println(defaultMember);    // Accessible
        System.out.println(protectedMember);  // Accessible
        System.out.println(publicMember);     // Accessible
    }
}
