package com.loan.calculator.loan_calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = {"com.loan.calculator"})
//
//@SpringBootApplication(scanBasePackages = {"com.loan.calculator"})
@SpringBootApplication
public class LoanCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanCalculatorApplication.class, args);
	}

}
