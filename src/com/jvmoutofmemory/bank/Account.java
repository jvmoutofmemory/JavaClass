package com.jvmoutofmemory.bank;

/**
 *
 * 银行账号类
 *
 */
public class Account {

    public static final double RATE = 3.5 / 100;

    /**
     * 卡号
     */
    private String accountNo;
    /**
     * 户名
     */
    private String accountName;
    /**
     * 余额
     */
    private double balance;

    public Account(String accountNo, String accountName, double balance) {
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.balance = balance;
    }

    public Account() {}


    /**
     * 加减账户余额
     *
     * @param amount  增量
     */
    public void addBalance(double amount) {
        balance = balance + amount;
    }

    /**
     * 转账
     * @param amount 转账金额
     * @param fee 手续费
     */
    public void transfer(double amount, double fee) {
        balance = balance - amount - fee;
    }

    /**
     * 计算利息
     */
    public void addInterest() {
        double interest;
        interest = balance * RATE;
        balance = balance + interest;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getAccountName() {
        return accountName;
    }


    public double getBalance() {
        return balance;
    }


    public String toString() {
        return accountNo + ", " + accountName + ", " + balance;
    }

}
