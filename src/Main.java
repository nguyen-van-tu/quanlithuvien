import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ListBook listBook = new ListBook();
        Book book = new Book();
        Scanner scanner = new Scanner(System.in);

        int input;
        do {
            System.out.println("-----MENU-----");
            System.out.println("1: Thêm sách");
            System.out.println("2: Hiển thị thư viện");
            System.out.println("3: Xóa sách");
            System.out.println("4: Sửa sách");
            System.out.println("5: Tổng giá");
            System.out.println("6: Tổng khối lượng");
            System.out.println("0: Exit");
            System.out.println("---Mời chọn chức năng");
            input = Integer.parseInt(scanner.nextLine());
            switch (input) {
                case 1:
                    do {
                        listBook.addBook();
                        System.out.println("1: Thêm sách");
                        System.out.println("0: Quay lại menu");
                    } while (Integer.parseInt(scanner.nextLine()) == 1);

                    break;
                case 2:
                    listBook.showBook();
                    break;
                case 3:
                    listBook.deleteBook();
                    break;
                case 4:
                    listBook.repairBook();
                    break;
                case 5:
                    listBook.totalPrice();
                    break;
            }
        }
        while (input != 0);

    }
}
