package bai_thi_module2.service;

import CaseStudy.util.ReadAndWrite;
import bai_thi_module2.models.BenhNhanThuong;
import bai_thi_module2.models.BenhNhanVip;
import bai_thi_module2.utils.NotFoundMedicalRecordException;
import bai_thi_module2.utils.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhNhapVipService implements BenhNhanService {
    private static final String PATH = "D:\\CodeGym\\Module 2\\src\\bai_thi_module2\\data\\benh_nhan_vip.csv";
    private static final String HEADER = "soThuTu, maBenhAn, maBenhNhan,tenBenhNhan, ngayNhapVien, ngayRaVien, liDo, loaiVip";
    private static final String REGEX_MA_BENH_AN = "(BA)[-][\\d]{3}";
    private static final String REGEX_MA_BENH_NHAN = "(BN)[-][\\d]{3}";
    private static final String REGEX_NGAY = "^(?:(?:31(/)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(/)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(/)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(/)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    private static final String REGEX_VIP = "(VIP) (I|II|III)";

    ReadAndWrite<BenhNhanVip> benhNhanVipReadAndWrite = new ReadAndWrite<>();
    Scanner scanner = new Scanner(System.in);

    public List<BenhNhanVip> getBenhNhanVipList() {
        List<BenhNhanVip> benhNhanVipList = new ArrayList<>();
        List<String> stringList = benhNhanVipReadAndWrite.readFromFile(PATH);
        for (String benhNhanVip : stringList) {
            String[] stringArray = benhNhanVip.split(",");
            benhNhanVipList.add(new BenhNhanVip(Integer.parseInt(stringArray[0]), stringArray[1], stringArray[2], stringArray[3], stringArray[4], stringArray[5], stringArray[6], stringArray[7]));
        }
        return benhNhanVipList;
    }

    private Integer inputSoThuTu(List<BenhNhanVip> list) {
        int soThuTu = 1;
        if (!(list.isEmpty())) {
            int idEnd = list.size() - 1;
            soThuTu = list.get(idEnd).getSoThuTu() + 1;
        }
        return soThuTu;
    }

    private String inputMaBenhAn() {
        System.out.print("Nhập mã bệnh án: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_MA_BENH_AN, "Lỗi nhập sai mã bệnh án, Mã bệnh án phải đúng định dạng BA-XXX, với XXX là các kí tự số.");
    }

    private String inputMaBenhNhan() {
        System.out.print("Nhập mã bệnh nhân: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_MA_BENH_NHAN, "Lỗi nhập sai mã bệnh nhân, Mã bệnh nhân phải đúng định dạng BN-XXX, với XXX là các kí tự số..");
    }

    private String inputTenBenhNhan() {
        System.out.print("Nhập tên bệnh nhân: ");
        return scanner.nextLine();
    }


    private String inputLido() {
        System.out.print("Nhập lí do ra viện: ");
        return scanner.nextLine();
    }

    private String inputLoaiVip() {
        System.out.print("Nhập loại Vip: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_VIP, "Với bệnh án VIP thì phần thông tin Gói VIP chỉ được chọn 1 trong 3 gói: VIP I, VIP II, VIP III.");

    }

    @Override
    public void themMoi() {
        List<BenhNhanVip> benhNhanVipList = getBenhNhanVipList();
        int soThutu = inputSoThuTu(benhNhanVipList);
        String maBenhAn = inputMaBenhAn();
        String maBenhNhan = inputMaBenhNhan();
        String tenBenhNhan = inputTenBenhNhan();
        System.out.println("Nhâp lần lượt ngày vào và ngày ra viện: ");
        String[] ngayString = RegexData.regexNgay(scanner.nextLine(), scanner.nextLine(), REGEX_NGAY);
        String ngayVao = ngayString[0];
        String ngayRa = ngayString[1];
        String liDo = inputLido();
        String loaiVip = inputLoaiVip();
        benhNhanVipList.add(new BenhNhanVip(soThutu, maBenhAn, maBenhNhan, tenBenhNhan, ngayVao, ngayRa, liDo, loaiVip));
        benhNhanVipReadAndWrite.writeToFile(benhNhanVipList, PATH, HEADER);
    }

    @Override
    public void xoa() {
        List<BenhNhanVip> benhNhanVipList = getBenhNhanVipList();
        System.out.print("Nhập Mã bệnh Án muốn xoá: ");
        String maBenhAn = scanner.nextLine();
        boolean check = true;
        for (int i = 0; i < benhNhanVipList.size(); i++) {
            if (maBenhAn.equals(benhNhanVipList.get(i).getMaBenhAn())) {
                check = false;
                System.out.println("Bạn có chắc chắn xoá!");
                System.out.println("1. Yes");
                System.out.println("2. No");
                int choice = 0;
                while (true) {
                    try {
                        choice = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Đây không phải là số, xin nhập lại: ");
                    }
                }
                switch (choice) {
                    case 1:
                        benhNhanVipList.remove(i);
                        benhNhanVipReadAndWrite.writeToFile(benhNhanVipList, PATH, HEADER);
                        hienThi();
                        break;
                    default:
                        return;
                }
            }
        }

        if (check) {
            try {
                throw new NotFoundMedicalRecordException("Bệnh án không tồn tại");
            } catch (NotFoundMedicalRecordException e) {
                e.printStackTrace();
            }
            System.out.println("Nhấn Enter để quay lại menu chính.");
            scanner.nextLine();
            return;
        }
    }

    @Override
    public void hienThi() {
        List<BenhNhanVip> benhNhanVipList = getBenhNhanVipList();
        for (BenhNhanVip benhNhanVip : benhNhanVipList) {
            System.out.println(benhNhanVip.toStringDisplay());
        }
    }
}
