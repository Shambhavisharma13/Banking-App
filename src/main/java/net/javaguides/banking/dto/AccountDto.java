package net.javaguides.banking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import net.javaguides.banking.entity.Account;

@Data
@AllArgsConstructor
public class AccountDto extends Account {
    private Long id;
    private String accountHolderName;
    private double balance;
}
