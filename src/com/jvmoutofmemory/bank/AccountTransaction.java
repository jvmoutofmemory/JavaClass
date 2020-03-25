package com.jvmoutofmemory.bank;

/**
 * 操作银行账号
 */
public class AccountTransaction {

    public static void main(String[] args) {

        Account from = new Account("001", "鲁班", 5000);
        Account to = new Account("002", "花木兰", 10);

        from.transfer(1000, 2);//从鲁班账户扣除转账余额以及手续费
        to.addBalance(1000);//花木兰账户 + 转账余额

        System.out.println("鲁班余额: " + from.getBalance());
        System.out.println("花木兰余额: " + to.getBalance());

        from.addInterest();
        to.addInterest();

        System.out.println("鲁班余额(带利息): " + from.getBalance());
        System.out.println("花木兰余额(带利息): " + to.getBalance());

        System.out.println(from);

    }

}
