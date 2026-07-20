package net.javaguides.banking.mapper;

import net.javaguides.banking.dto.AccountDto;
import net.javaguides.banking.entity.Account;

public class AccountMapper {
    public static Account mapToAccount(AccountDto accountDto){
    Account account=new Account(
            accountDto.getId(),
            accountDto.getAccountHolderName(),
            accountDto.getBalance()

    );
    return account;
  }
  public static Account mapToAccountDto(Account account){
        Account accountDto=new AccountDto(
            account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return accountDto;
  }
}
