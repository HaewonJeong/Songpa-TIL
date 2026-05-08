package com.hw1.view;
import com.hw1.controller.LibraryManager;
import com.hw1.model.dto.Member;
import java.util.Scanner;

public class LibraryMenu {
    LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
//        // 이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("나이: ");
        int age = sc.nextInt();
        System.out.print("성별: ");
        char sex = sc.next().charAt(0);
        sc.next();
        Member member = new Member(name,age,sex);

//       // LibraryManager의 insertMember() 메소드에 전달
        lm.insertMember(member);
//        ==== 메뉴 ==== // 무한 반복 실행
//        1. 마이페이지 // LibraryManager의 myInfo() 호출하여 출력
//        2. 도서 전체 조회 // LibraryMenu의 selectAll() 호출
//        3. 도서 검색 // LibraryMenu의 searchBook() 호출
//        4. 도서 대여하기 // LibraryMenu의 rentBook() 호출
//        0. 프로그램 종료하기
        while(true){
            int keyboard = sc.nextInt();

            switch (keyboard){
                case 1 :
                        lm.myInfo();
                        break;
                case 2 :
                        lm.selectAll();
                        break;
                case 3 :
                        System.out.print("검색할 책 키워드 입력: ");
                        String keyword = sc.next();
                        lm.searchBook(keyword);
                        break;
                case 4 :
                        System.out.print("대여할 책 대여 번호 입력: ");
                        int bnum = sc.nextInt();
                        lm.rentBook(bnum);
                        break;
                case 0 :
                    System.out.println("프로그램을 종료합니다.");
                        return;
            }
        }
    }

    public void selectAll(){}
    public void searchBook(){}
    public void rentBook(){}
}
