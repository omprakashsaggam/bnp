import com.bnp.dto.AccountDTO;
import com.bnp.service.AccountService;
import com.bnp.service.AccountServiceImpl;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account holder name");
        String name = scanner.nextLine();
        System.out.println("Enter account holder email");
        String email = scanner.nextLine();
        System.out.println("Enter account holder phone");
        String phone = scanner.nextLine();
        System.out.println("Enter account type");
        String accountType = scanner.nextLine();

        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setAccountHolderName(name);
        accountDTO.setAccountHolderEmail(email);
        accountDTO.setAccountHolderPhone(phone);
        accountDTO.setAccountType(accountType);


        AccountServiceImpl accountService = new AccountServiceImpl();
//        accountService.createAccount(new AccountDTO());
        System.out.println(accountService.createAccount(accountDTO));

        System.out.println("get list of account/n"+accountService.getAccounts());

    }
}