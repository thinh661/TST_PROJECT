import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Test {

    public static void case1() {
        Scanner sc =  new Scanner(System.in);
        TernarySearchTree tst = new TernarySearchTree();
        String[] words = tst.ReadFile();
        for (String word : words) {
            tst.insert(word);
        }
        System.out.print("Mời Nhập Từ Cần Kiểm Tra : ");
        String prefix = sc.nextLine();
        System.out.println(tst.search(prefix));
    }
    public static void  case2() {
        TernarySearchTree tst = new TernarySearchTree();
        String[] words = tst.ReadFile();
        for (String word : words) {
            tst.insert(word);
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Mời Nhập Tiền Tố Của Từ Cần Kiếm : ");
        String prefix = input.nextLine();
        List<String> result = tst.prefixSearch(prefix);
        System.out.println("Kết Quả Tìm Kiếm : \"" + prefix + "\": " + result);
    }
    public static void main(String[] args) throws InputMismatchException {

        Scanner sc = new Scanner(System.in);
        int choice =1;
        try {
            while (choice == 1) {
                System.out.println("==========DICTIONARY=========");
                System.out.println("Option : ");
                System.out.println("1.Kiểm Tra Chính Tả");
                System.out.println("2.Tìm Kiếm Từ Theo Tiền Tố");
                System.out.println("3.Thoát");
                System.out.print("Mời Chọn : ");

                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        case1();
                        break;
                    case 2:
                        case2();
                        break;
                    case 3:
                        choice = 2;
                        break;
                    default:
                        System.out.println("Hãy Chọn 1,2 hoặc 3. Mời Chọn Lại : ");
                        break;
                }

            }
        } catch (InputMismatchException ex) {
            System.out.println("Please Try Again.Enter the number!");
        }

    }
}



