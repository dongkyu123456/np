package project;

// 머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다. 
//피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때, 
//n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를 
//return 하도록 solution 함수를 완성해보세요.
//page 
//슬라이스가 사람수보다 많도록 만들어야한다
//구하는 건 시켜야할 판수
// slice * i >= n을 만족시키는 함수를 완성하라
//포문을 사용해서 결과값이 1이 될 때까지 판수를 추가

public class J0_1 {
    public static void main(String[] args) {
        int slice = 7;
        int n = 100;
        int need = n / slice;
        if(n%slice!=0)
        need++;
        System.out.println(need);
    }
}
