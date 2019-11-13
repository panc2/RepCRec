package cs.nyu.edu.adb;

import java.util.ArrayList;
import java.util.List;

public class Transaction {

  private Integer timeStamp;
  private String name;
  private Operation currentOperation;
  private TransactionStatus transactionStatus;
  private boolean isReadOnly;
  public List<Operation> waitingOperatons;


  // TODO: Initialize the timeStamp, which will be used for abort transactions in deadlock cycle
  public Transaction(String name, boolean isReadOnly) {
    transactionStatus = TransactionStatus.ACTIVE;
    this.name = name;
    this.isReadOnly = isReadOnly;
    waitingOperatons = new ArrayList<>();
  }

  public void setTimeStamp(Integer timeStamp) {
    this.timeStamp = timeStamp;
  }

  public Integer getTimeStamp() {
    return timeStamp;
  }

  public boolean isReadOnly() {
    return isReadOnly;
  }

  public String getName() {
    return name;
  }

  public TransactionStatus getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(TransactionStatus transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  public Operation getCurrentOperation() {
    return currentOperation;
  }

  public void setCurrentOperation(Operation currentOperation) {
    this.currentOperation = currentOperation;
  }
}
