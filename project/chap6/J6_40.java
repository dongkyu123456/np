package project.chap6;

//page 205 
class J6_40 {

            static { //클래스 초기화 블럭 
                System.out.println("static { }");
            }
          
            { // 인스턴스 초기화 블럭 
                System.out.println("{ }");
            }

            public J6_40() {
            System.out.println(" 생성자 ");
            }

            public static void main(String[] args) { 
            System.out.println("J6_40 bt = new J6_40(); "); 
            J6_40 bt = new J6_40();
            System.out.println("bt : "+bt);

            System.out.println("J6_40 bt2 = new J6_40(); "); 
            J6_40 bt2 = new J6_40();
            System.out.println("bt2 : "+bt2);
            }
        }
