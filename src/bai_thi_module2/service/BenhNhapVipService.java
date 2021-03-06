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
        System.out.print("Nh???p m?? b???nh ??n: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_MA_BENH_AN, "L???i nh???p sai m?? b???nh ??n, M?? b???nh ??n ph???i ????ng ?????nh d???ng BA-XXX, v???i XXX l?? c??c k?? t??? s???.");
    }

    private String inputMaBenhNhan() {
        System.out.print("Nh???p m?? b???nh nh??n: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_MA_BENH_NHAN, "L???i nh???p sai m?? b???nh nh??n, M?? b???nh nh??n ph???i ????ng ?????nh d???ng BN-XXX, v???i XXX l?? c??c k?? t??? s???..");
    }

    private String inputTenBenhNhan() {
        System.out.print("Nh???p t??n b???nh nh??n: ");
        return scanner.nextLine();
    }


    private String inputLido() {
        System.out.print("Nh???p l?? do ra vi???n: ");
        return scanner.nextLine();
    }

    private String inputLoaiVip() {
        System.out.print("Nh???p lo???i Vip: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_VIP, "V???i b???nh ??n VIP th?? ph???n th??ng tin G??i VIP ch??? ???????c ch???n 1 trong 3 g??i: VIP I, VIP II, VIP III.");

    }

    @Override
    public void themMoi() {
        List<BenhNhanVip> benhNhanVipList = getBenhNhanVipList();
        int soThutu = inputSoThuTu(benhNhanVipList);
        String maBenhAn = inputMaBenhAn();
        String maBenhNhan = inputMaBenhNhan();
        String tenBenhNhan = inputTenBenhNhan();
        System.out.println("Nh??p l???n l?????t ng??y v??o v?? ng??y ra vi???n: ");
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
        System.out.print("Nh???p M?? b???nh ??n mu???n xo??: ");
        String maBenhAn = scanner.nextLine();
        boolean check = true;
        for (int i = 0; i < benhNhanVipList.size(); i++) {
            if (maBenhAn.equals(benhNhanVipList.get(i).getMaBenhAn())) {
                check = false;
                System.out.println("B???n c?? ch???c ch???n xo??!");
                System.out.println("1. Yes");
                System.out.println("2. No");
                int choice = 0;
                while (true) {
                    try {
                        choice = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("????y kh??ng ph???i l?? s???, xin nh???p l???i: ");
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
                throw new NotFoundMedicalRecordException("B???nh ??n kh??ng t???n t???i");
            } catch (NotFoundMedicalRecordException e) {
                e.printStackTrace();
            }
            System.out.println("Nh???n Enter ????? quay l???i menu ch??nh.");
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
