package lk.ijse.computershop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class RepairDTO {
    private String code;
    private String customerId;
    private String employeeId;
    private String details;
    private LocalDate gettingDate;
    private LocalDate acceptingDate;
}
