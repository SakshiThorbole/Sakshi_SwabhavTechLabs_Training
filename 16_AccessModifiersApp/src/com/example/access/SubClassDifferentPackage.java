package com.example.access;

import com.example.modifiers.TestModifiers;

public class SubClassDifferentPackage extends TestModifiers {
    public static void main(String[] args) {
        SubClassDifferentPackage sdp = new SubClassDifferentPackage();
        sdp.accessMembers();
    }

    public void accessMembers() {
        // System.out.println(privateMember);     // Not accessible
        // System.out.println(defaultMember);    // Not accessible
        System.out.println(protectedMember);    // Accessible
        System.out.println(publicMember);      // Accessible
    }
}
