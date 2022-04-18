package bai_thi_module2.utils;

public class NotFoundMedicalRecordException extends Exception {
    public NotFoundMedicalRecordException() {
    }

    public NotFoundMedicalRecordException(String message) {
        super(message);
    }
}
