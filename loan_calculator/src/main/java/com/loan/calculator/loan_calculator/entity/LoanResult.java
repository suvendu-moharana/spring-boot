package com.loan.calculator.loan_calculator.entity;

public class LoanResult {

        double emi;
        double interestRate;
        double totalPay;

        public double getInterestRate() {
            return interestRate;
        }

        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }

        public double getEmi() {
            return emi;
        }

        public void setEmi(double emi) {
            this.emi = emi;
        }

        public double getTotalPay() {
            return totalPay;
        }

        public void setTotalPay(double totalPay) {
            this.totalPay = totalPay;
        }
    }


