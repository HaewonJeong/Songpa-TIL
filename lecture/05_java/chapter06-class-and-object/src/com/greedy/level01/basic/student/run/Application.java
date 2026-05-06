package com.greedy.level01.basic.student.run;

import com.greedy.level01.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

/*최대 10명의 학생 정보를 기록할 수 있게
객체 배열을 할당하고
반복문을 사용하여 키보드로 학생 정보를
입력 받도록 구현
3명의 학생 정보를 입력 받아, 각 객체에
저장, 현재 기록된 학생들의 정보와 각 학
생의 평균 점수를 출력
*/
public class Application {
    public static void main(String[] args) {

        // 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
        StudentDTO[] studentDTOS = new StudentDTO[10];
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        // while문을 사용하여 학생들의 정보를 계속 입력 받고
        while(true){
            studentDTOS[cnt] = sc.next();
            System.out.print("계속 추가할 겁니까 ? (y/n)");

            char iskeepAdd = 'y';
            sc.next(String.valueOf(iskeepAdd));
            if(iskeepAdd == 'n') {
                break;
            }else {
                //
            }
            cnt++;
        }
        // 한 명씩 추가 될 때마다 카운트함
        // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
        // 3명 정도의 학생 정보를 입력 받아 각 객체에 저장함
        // 현재 기록된 학생들의 각각의 점수 평균을 구함
        // 학생들의 정보를 모두 출력 (평균 포함)


    }
}
