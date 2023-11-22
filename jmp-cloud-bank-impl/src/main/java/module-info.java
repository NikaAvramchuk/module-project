import com.bank.Bank;
import com.bank.impl.BankImpl;

module jmp.bank.impl {
    requires transitive bank.api;
    requires jmp.dto;
    provides Bank with BankImpl;
}
