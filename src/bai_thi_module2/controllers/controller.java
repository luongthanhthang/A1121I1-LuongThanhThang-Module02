package bai_thi_module2.controllers;

import bai_thi_module2.service.BenhNhanService;
import bai_thi_module2.service.BenhNhanThuongService;
import bai_thi_module2.service.BenhNhapVipService;

import java.util.Scanner;

public class controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BenhNhanService benhNhanThuongService = new BenhNhanThuongService();
        BenhNhanService benhNhanVipService = new BenhNhapVipService();
        boolean check = true;
        while (check) {
            System.out.println("\n-----CHƯƠNG TRÌNH QUẢN LÝ BỆNH ÁN-----");
            System.out.println("1. Thêm mới\n" +
                    "2. Xóa\n" +
                    "3. Xem danh sách các bệnh án\n" +
                    "4. Thoát\n" +
                    "Chọn chức năng:");
            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Đây không phải là số, vui lòng nhập lại số !");
                e.printStackTrace();
            }

            switch (choice) {
                case 1:
                    System.out.println("-----Lựa chọn bình thường hay vip-----");
                    System.out.println("1. Bệnh án thường");
                    System.out.println("2. Bệnh án Vip");
                    int choice1 = 0;
                    try {
                        choice1 = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Đây không phải là số, vui lòng nhập lại số !");
                        e.printStackTrace();
                    }
                    switch (choice1) {
                        case 1:
                            benhNhanThuongService.themMoi();
                            break;
                        case 2:
                            benhNhanVipService.themMoi();
                            break;
                        default:
                            System.out.println("NOT FOUND!");
                    }
                    break;

                case 2:
                    System.out.println("-----Lựa chọn bình thường hay vip-----");
                    System.out.println("1. Bệnh án thường");
                    System.out.println("2. Bệnh án Vip");
                    int choice2 = 0;
                    try {
                        choice2 = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Đây không phải là số, vui lòng nhập lại số !");
                        e.printStackTrace();
                    }
                    switch (choice2) {
                        case 1:
                            benhNhanThuongService.xoa();
                            break;
                        case 2:
                            benhNhanVipService.xoa();
                            break;
                        default:
                            System.out.println("NOT FOUND!");
                    }
                    break;

                case 3:
                    System.out.println("-----List bệnh án thường-----");
                    benhNhanThuongService.hienThi();
                    System.out.println();
                    System.out.println("-----List bệnh án vip-----");
                    benhNhanVipService.hienThi();
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("NOT FOUND!");
            }
        }
    }
}
