import model.Laptop;
import model.Product;
import model.SmartPhone;
import service.StoreManagerImpl;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StoreManagerImpl manager = new StoreManagerImpl();
    while (true){
        System.out.println("MOI NHAP LUA CHON: 1.Them san pham| 2.Xoa san pham| 3.Liet ke san pham| 4.Hien tong thue | 5. Hien thi san pham| 6.Thoat Chuong trinh");
        int q = sc.nextInt();
        sc.nextLine();

        if (q == 1){
            System.out.println("Nhap thong tin san pham | 1.Laptop | 2. Smartphone");
            int k = sc.nextInt(); sc.nextLine();
            System.out.print("Nhap id: "); String id = sc.nextLine();
            System.out.print("Nhap ten: "); String name = sc.nextLine();
            System.out.print("Nhap Gia: "); double price = sc.nextDouble(); sc.nextLine();
            System.out.print("Nhap Thuong Hieu: "); String brand = sc.nextLine();
            if (k == 1){
                System.out.print("Nhap ram: "); int ramSize = sc.nextInt(); sc.nextLine();
                System.out.print("Nhap processor: "); String processor = sc.nextLine();
                manager.addProduct(new Laptop(id, name, price, brand, ramSize, processor));
            }
            else if (k == 2){
                System.out.print("Nhap he dieu hanh: "); String os = sc.nextLine();
                System.out.println("Neu may co 5g nhap so 1, Neu khong thi nhap so khac 1."); int c = sc.nextInt(); sc.nextLine();
                boolean has5g = false;
                if (c == 1) {
                     has5g = true;
                }
                manager.addProduct(new SmartPhone(id , name, price, brand, os, has5g));
            }
        }
        else if (q == 2){
            System.out.println("Nhap id can xoa: "); String id = sc.nextLine();
            if (manager.removeProduct(id)) {
                System.out.println("=> Đã xóa sản phẩm thành công!");
            } else {
                System.out.println("=> Lỗi: Không tìm thấy ID sản phẩm để xóa.");
            }
        }
        else if (q == 3){
            System.out.println("Nhap gia nho nhat: "); double minVal = sc.nextDouble();
            System.out.println("Nhap gia lon nhat: "); double maxVal = sc.nextDouble();
            sc.nextLine();
            manager.filterByPrice(minVal, maxVal);
        }
        else if (q == 4){
            System.out.println("Tổng thuế của tất cả sản phẩm là: " + manager.showTotalTax());        }
        else if (q == 5){
            manager.displayAll();
        }
        else if (q == 6){
            System.out.println("Cảm ơn bạn đã sử dụng phần mềm. Tạm biệt!");
            System.exit(0);
        }
        else {
            System.out.println("Lua chon khong hop le!");
        }

    }
}
