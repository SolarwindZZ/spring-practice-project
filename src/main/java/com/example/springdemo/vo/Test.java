package com.example.springdemo.vo;

import lombok.Builder;

public class Test {
    public static void main(String[] args){
        //手动创建set方法
        User1 user1 = new User1();
        user1.setId(1);
        user1.setName("Aaron");

        //Builder注解后的链式写法
        User2 user2 = User2.builder().id(2).name("Solarwinds").build();
    }

    private static class User1{
        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    //@Builder注解
    @Builder
    private static class User2{
        private int id;
        private String name;
    }
}
