package com.loan.calculator.loan_calculator.controller;

import com.loan.calculator.loan_calculator.entity.Loan;
import com.loan.calculator.loan_calculator.entity.LoanResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loan")
public class Loan_calculator {
    @PostMapping("/count")
    public LoanResult emi_count(@RequestBody Loan loan) {
        double loanAmount = loan.getLoanAmount();
        double interestRate = loan.getInterestRate();
        double loanDuration = loan.getLoanDuration();
        double monthlyInterest = interestRate / 100 / 12;
        double emi = (loanAmount * monthlyInterest * Math.pow(1 + monthlyInterest, loanDuration))
                / (Math.pow(1 + monthlyInterest, loanDuration) - 1);
        double totalPay=emi*loanDuration;
        LoanResult ln=new LoanResult();
        ln.setEmi(emi);
        ln.setInterestRate(interestRate);
        ln.setTotalPay(totalPay);
        return ln;

    }
}
