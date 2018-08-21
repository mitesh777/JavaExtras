package com.pratian.amadeusTraining.interfaceDemo.client;

public interface Account {
void open();
void close();
double withdraw(double amount);
double deposit(double amount);
double getBalance();
double getMinBalance();
}
