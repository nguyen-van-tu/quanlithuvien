import java.util.ArrayList;
import java.util.Scanner;

public class ListBook {
    Scanner scanner = new Scanner(System.in);
    Book book = new Book();

    public ArrayList<Book> bookArrayList;

    public ListBook() {
        bookArrayList = new ArrayList<>();
    }

    public ArrayList<Book> getBookArrayList() {
        return bookArrayList;
    }

    public void addBook() {

        Book book = new Book();

        System.out.print("Nhập tên sách: ");
        book.setName(scanner.nextLine());
        System.out.print("Nhập tên tác giả: ");
        book.setOuthor(scanner.nextLine());
        System.out.print("Nhập giá cuốn sách: ");
        book.setPrice(Integer.parseInt(scanner.nextLine()));
        System.out.print("Nhập số lượng sản phẩm: ");
        book.setNumber(Integer.parseInt(scanner.nextLine()));
        System.out.print("Nhập khối lượng: ");
        book.setWeight(Integer.parseInt(scanner.nextLine()));

        bookArrayList.add(book);
    }

    public void showBook() {
        for (Book e : bookArrayList) {
            System.out.println(e.toString());
        }
    }

    public void deleteBook() {
        System.out.println(" nhập tên cuốn sách cần xóa");
        String m = scanner.nextLine();
        int index = 0;
        for (int i = 0; i < getBookArrayList().size(); i++) {
            if (m.equals(getBookArrayList().get(i).getName())) {
                System.out.println(" thông tin cuốn sách đã xóa: " + getBookArrayList().get(i).toString());
                getBookArrayList().remove(getBookArrayList().get(i));
                index++;
            }
        }
        if (index == 0) {
            System.out.println(" không tìm thấy cuốn sách ! ");
        }

    }
    public void repairBook () {
        System.out.println("nhập tên cuốn sách cần sửa");
        String id = scanner.nextLine();
        int a = 0;
        for (int i = 0; i < getBookArrayList().size(); i++) {
            if (id.equals(getBookArrayList().get(i).getName())) {
                System.out.println("Nhập lại thông tin cuốn sách mới");
                System.out.print("Nhập tên cuốn sách :");
                String name = scanner.nextLine();
                getBookArrayList().get(i).setName(name);
                System.out.print("Nhập tên tác giả :");
                String tacgia = scanner.nextLine();
                getBookArrayList().get(i).setOuthor(tacgia);
                System.out.print("nhập giá cuốn sách :");
                int gia = Integer.parseInt(scanner.nextLine());
                System.out.print("nhập số lượng :");
                int soluong = Integer.parseInt(scanner.nextLine());
                System.out.print("nhập khối lượng ");
                int khoiluong = Integer.parseInt(scanner.nextLine());

                System.out.println("thông tin cuốn sách đã sửa thành công!"
                        + "\n  Tên cuốn sách: " + getBookArrayList().get(i).getName() +
                        " Tác giả: " + getBookArrayList().get(i).getOuthor() +
                        " Giá: " + getBookArrayList().get(i).getPrice() +
                        " Số lượng: " + getBookArrayList().get(i).getNumber() +
                        " Khối lượng: " + getBookArrayList().get(i).getWeight()
                );
                a++;
            } else if (a == 0) {
                System.out.println("Không tìm thấy cuốn sách");
                break;
            }
        }
    }


    public void totalPrice (){
            System.out.println(book.getPrice()*book.getNumber());
    }
}

