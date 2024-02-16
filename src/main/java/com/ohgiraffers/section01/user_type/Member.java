//package com.ohgiraffers.section01.user_type;
//
//public class Member {
//    public static void main(String[] args) {
//
//
//        /*필기.
//         * 지금까지 우리는 클래스 내부에 메소드만 작성을 했었다.
//         * 하지만 클래스 내부에는 메소드를 작성하지 않고 바로 변수를 선언할 수 있다.
//         * 이것을 전역변수(필드 == 인스턴스변수 == 속성) 이라고 부른다.
//         * */
//
//
//        String id;
//        String pwd;
//        String name;
//        int age;
//        char gender;
//        String[] hobby;
//
//    }
//
//        public void test ( int i){
//            i = 10;
//        }
//
//        public void test ( int i){
//            i = 20;
//        }
//
//
//        /* 목차. 2. 사용자 정의의 자료형 사용하기 */
//        /* 목차. 2-1. 변수 선언 및 객체 생성 */
//
//        /* 필기.
//         * 자료형 변수명 = new 클래스명(); <- 지금까지 사용한 이 구문은 객체(instance)를 생성하는 구문
//         * 사용자 정의의 자료형인 클래스를 이용하기 위해서는 new 연산자로 heap 공간에 할당을 해야한다.
//         * 객체를 생성하게 되면 클래스에 정의한 필드와 메소드 대로 객체 (instance) 가 생성된다.
//         * 아이디, 비밀번호, 이름, 나이, 성별, 취미를 연속된 메모리 공간(주소) 에서 사용하도록 공간을 만들었다.
//         * 클래스에 작성한 내용대로 사용할 수 있다.
//         * */
//
//        Member member = new Member();
//
//        /* 목차. 2-2. 생성된 인스턴스의 초기값 확인하기 */
//        /* 필기.
//         * 이렇게 위에서처럼 객체를 생성하고 나면, 서로 다른 자료형들은 하나의 member 라는 변수명으로
//         * 관리할 수 있도록 공간을 생성한 것이다.
//         * heap 이라는 공간에 생성되기 때문에 jvm 이 제공하는 기본값들로 초기화 된다.
//         * */
//
//        /* 필기.
//         * 필드에 접근하기 위해서는 래퍼런스변수명. 필드명 <- 이렇게 접근한다.
//         * '.' 참조연산자 라고 하는데, 래퍼런스 변수가 참조하고 있는 주소로 접근한다 라는 의미
//         * 각 공간은 필드명으로 접근한다.
//         * */
//
//        System.out.println("member.id : " + member.id);
//        System.out.println("member.pwd : " + member.pwd);
//        System.out.println("member.name : " + member.name);
//        System.out.println("member.age : " + member.age);
//        System.out.println("member.gender : " + member.gender);
//        System.out.println("member.hobby : " + member.hobby);
//
//        /* 목차. 2-3. 필드에 접근해서 변수 사용하듯 사용해보기 */
//        member.id = "user01";
//        member.pwd = "pass01";
//        member.name = "조평훈";
//        member.age = 20;
//        member.gender = '남';
//        member.hobby = new String[]{"축구", "볼링", "테니스"};
//
//        System.out.println("변경 후 member.id : " + member.id);
//        System.out.println("변경 후 member.pwd : " + member.pwd);
//        System.out.println("변경 후 member.name : " + member.name);
//        System.out.println("변경 후 member.age : " + member.age);
//        System.out.println("변경 후 member.gender : " + member.gender);
//        System.out.println("변경 후 member.hobby : ");
//        for (int i = 0; i < member.hobby.length; i++) {
//            System.out.println(member.hobby[i] + " ");
//        }
//        System.out.println();
//    }
