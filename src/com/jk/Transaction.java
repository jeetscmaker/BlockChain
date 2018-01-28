package com.jk;

public class Transaction {
    private String senderAddress;
    private String recipientAddress;
    private int amount;

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transaction that = (Transaction) o;

        if (amount != that.amount) return false;
        if (!senderAddress.equals(that.senderAddress)) return false;
        return recipientAddress.equals(that.recipientAddress);
    }

    @Override
    public int hashCode() {
        int result = senderAddress.hashCode();
        result = 31 * result + recipientAddress.hashCode();
        result = 31 * result + amount;
        return result;
    }

    public int getAmount() {

        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Transaction(String senderAddress, String recipientAddress, int amount) {

        this.senderAddress = senderAddress;
        this.recipientAddress = recipientAddress;
        this.amount = amount;
    }
}
