package CaseStudy.services.implement;

import CaseStudy.models.Booking;
import CaseStudy.models.Contract;
import CaseStudy.services.ContractService;
import CaseStudy.util.ContractComparator;

import java.util.*;

public class ContractServiceImpl implements ContractService {
    //Khi tạo hợp đồng chỉ cho phép tạo hợp đồng theo thứ tự ngày bắt đầu booking sớm nhất được tạo hợp đồng trước,
    // booking trễ hơn phải tạo hợp đồng sau.
    //==>Dùng Queue

    //list hợp đồng, dùng ArrayList để dễ truy cập
    static Scanner scanner = new Scanner(System.in);
    static Set<Contract> contractList = new TreeSet<>(new ContractComparator());

    //thêm mới hợp đồng
    @Override
    public void addNew() {
        //hiển thị thông tin người dùng và booking để làm hợp đồng
        Queue<Booking> bookingQueue = new LinkedList<>();
        //lấy danh sách booking lên booking list
        Set<Booking> bookingSet = new BookingServiceImpl().bookingListSetToQueue();

        //chuyển dữ liệu từ Set List qua Queue list
        //vì Booking Set List đã được sắp xếp sẵn theo ngày tháng, nên chỉ cần add vào Queue theo thứ tự để FIFO
        bookingQueue.addAll(bookingSet);

        try {
            //làm hợp đồng cho đến khi hết danh sách booking thì thôi
            while (!(bookingQueue.isEmpty())) {

                //lấy phần tử có ngày booking sớm nhất ra và xoá
                Booking booking = bookingQueue.poll();
                System.out.println("\n-----CREATING A CONTRACT for: " + booking.toStringDisplay() + "-----");

                int idContract = 1;
                if (!(contractList.isEmpty())) {
                    idContract = contractList.size() + 1;
                }

                int idBooking = booking.getIdBooking();

                //tiền cọc
                System.out.print("Enter Deposit(tiền cọc): ");
                double deposit = Double.parseDouble(scanner.nextLine());

                //nhập cho đến khi tổng tiền lớn hơn số tiền cọc
                double totalMoney = 0;
                while (totalMoney < deposit) {
                    System.out.print("Enter total money: ");
                    totalMoney = Double.parseDouble(scanner.nextLine());
                }

                String idCustomer = booking.getCustomer().getId();

                Contract contract = new Contract(idContract, idBooking, deposit, totalMoney, idCustomer, booking.getStartDate(), booking.getEndDate());

                //thêm vào list hợp đồng
                contractList.add(contract);
                System.out.println("-----Create Contract Success-----");

                //hiển thị booking và hợp đồng
                System.out.println(booking.toStringDisplay());
                System.out.println(contract.toStringDisplay());
                System.out.println("------------------------------");
            }

            //xoá hết dữ liệu list Booking bộ nhớ đệm
            BookingServiceImpl.bookingListSetBuffer.clear();
            return;
        } catch (NumberFormatException e) {
            System.err.println("Input not Number, Please re-input!");
            e.printStackTrace();
        }
        return;
    }

    //hiển thị list hợp đồng
    @Override
    public void display() {
        System.out.println("\n----------Contract List----------");
        for (Contract contract : contractList) {
            System.out.println(contract.toStringDisplay());
        }
    }

    //cập nhật dữ liệu hợp đồng
    @Override
    public void edit() {
        //hiển thị lại list contract để chọn ID contract cần edit
        display();

        System.out.print("\nEnter Id Contract Edit: ");
        try {
            int idContract = Integer.parseInt(scanner.nextLine());
            for (Contract contract : contractList) {
                if (contract.getIdContract() == idContract) {

                    //hiển thị thông tin trước khi edit
                    System.out.println("Contract before edit: " + contract.toStringDisplay());

                    try {
                        //chỉ thay đổi được tiền thuê và tổng tiền
                        //tiền cọc
                        System.out.print("Enter Deposit(tiền cọc): ");
                        double deposit = Double.parseDouble(scanner.nextLine());

                        //nhập cho đến khi tổng tiền lớn hơn số tiền cọc
                        double totalMoney = 0;
                        while (totalMoney < deposit) {
                            System.out.print("Enter total money: ");
                            totalMoney = Double.parseDouble(scanner.nextLine());
                        }

                        //trả lại đối tượng xoá để edit
                        contractList.remove(contract);
                        //tiền hành edit
                        contractList.add(new Contract(contract.getIdContract(), contract.getIdBooking(), deposit, totalMoney, contract.getIdCustomer(), contract.getStartDateFacility(), contract.getEndDateFacility()));
                        return;

                    } catch (NumberFormatException e) {
                        System.err.println("Input not Number, Please re-input!");
                        e.printStackTrace();
                    }
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Input not Number, Please re-input!");
            e.printStackTrace();
        }
    }
}
