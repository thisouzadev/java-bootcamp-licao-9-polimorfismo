package com.betrybe.core;

public class ContaCorrente extends Conta {

  @Override
  public void sacar(double valor) {
    // TODO Auto-generated method stub
    super.saldo -= valor + (valor * 0.05);
  }

}
