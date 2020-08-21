package com.rickyin.bigdata.java;

/**
 * Java中判断对象是否相等的方法: 重写 hashCode 和 equals
 */
public class Java14_ObjectEq {
    public static void main(String[] args) {
        User14 user1 = new User14();
        User14 user2 = new User14();
        System.out.println(user1.equals(null));
    }
}

class User14 {
    private int id;
    private String name;

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User14) {
            User14 otherUser = (User14) obj;
            return this.id == otherUser.id;
        } else {
            return false;
        }
    }
}
