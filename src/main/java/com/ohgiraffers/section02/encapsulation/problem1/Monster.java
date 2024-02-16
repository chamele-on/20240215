package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {

    String kinds; //몬스터 이름
    int hp; // 몬스터 체력

    public void setHp(int 매개변수) {

        if(매개변수 > 0) {
            System.out.println("양수의 값이 입력되어서 정상적으로 변경 되었습니다.");
            this.hp = 매개변수;
        } else {
            this.hp = 0;
        }

    }

    public String getInfo() {


    }

}
