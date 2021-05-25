package entidades;

import java.util.Scanner;

public class Conta {
	Scanner tc = new Scanner(System.in);

	protected String nomeCliente;
	protected int numeroConta;
	protected double saldo;

	public Conta() {
		System.out.println("Conta Criada com sucesso!");
	}

	public Conta(String nomeCliente, int numeroConta, double saldo) {
		System.out.println("Conta Criada com sucesso!");
		this.nomeCliente = nomeCliente;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean verificaSaldo(double valor) {
		if (saldo < 0 || saldo < valor) {
			return true;
		} else {
			return false;
		}

	}

	public void sacar(double valor) {
		while (verificaSaldo(valor)==true) {
			System.out.print("Não foi possivel completar sua transação ... digite novamente o valor:");
			valor = tc.nextDouble();
			}
		saldo -= valor;
	}
	public void depositar(double valor) {
		saldo+=valor;
	}
	

	@Override
	public String toString() {
		return "Nome do Cliente: " + nomeCliente + ", numero da conta: " + numeroConta + ", saldo: R$" + saldo;
	}

}
