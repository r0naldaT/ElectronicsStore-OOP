# 📱 Electronics Store Management System

Dự án quản lý cửa hàng thiết bị điện tử được xây dựng bằng ngôn ngữ **Java**, áp dụng các kiến thức cốt lõi của lập trình hướng đối tượng (OOP).

## 🚀 Tính năng chính
- **Quản lý đa hình:** Hỗ trợ nhiều loại sản phẩm khác nhau (Laptop, Smartphone).
- **Tính toán thuế tự động:** Áp dụng mức thuế riêng biệt cho từng loại sản phẩm nhờ vào *Method Overriding*.
- **Bộ lọc thông minh:** Tìm kiếm sản phẩm nhanh chóng theo khoảng giá người dùng nhập vào.
- **Xử lý logic chặt chẽ:** Kiểm tra trùng lặp ID khi thêm mới và xác nhận trạng thái khi xóa sản phẩm.

## 🛠 Kiến thức OOP đã áp dụng
1. **Encapsulation (Đóng gói):** Sử dụng `private`/`protected` và Getter/Setter để bảo vệ dữ liệu.
2. **Inheritance (Kế thừa):** `Laptop` và `SmartPhone` kế thừa các đặc tính chung từ lớp cha `Product`.
3. **Polymorphism (Đa hình):** - Quản lý danh sách đối tượng bằng `List<Product>`.
   - Sử dụng *Dynamic Binding* để tính thuế mà không cần dùng nhiều câu lệnh `if-else`.
4. **Abstraction (Trừu tượng):** Định nghĩa hành vi nghiệp vụ thông qua `Interface IStoreManager`.



## 📂 Cấu trúc dự án
- `model/`: Chứa các lớp thực thể dữ liệu (Product, Laptop, SmartPhone).
- `service/`: Chứa Interface và lớp thực thi logic nghiệp vụ.
- `app/`: Chứa hàm Main và giao diện điều khiển Console.

## 💻 Cách chạy chương trình
1. Clone dự án về máy: 
   ```bash
   git clone <link-repo-cua-ban>
