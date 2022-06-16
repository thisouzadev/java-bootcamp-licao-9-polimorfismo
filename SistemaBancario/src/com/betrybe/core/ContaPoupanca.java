package com.betrybe.core;

public class ContaPoupanca extends Conta {

  @Override
  public void sacar(double valor) {
    // TODO Auto-generated method stub
    super.saldo -= valor + 2;
  }

  public void simularRendimentoTaxaFixa() {
    saldo *= 0.05;
  }

  public void simularRendimentoTaxaVariavel(double taxa) {
    saldo *= taxa;
  }
}
