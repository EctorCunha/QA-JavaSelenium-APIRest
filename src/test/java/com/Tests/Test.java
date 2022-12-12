package com.Tests;

import static org.junit.jupiter.api.Assertions.*;

import com.Pages.Page01;
import org.junit.jupiter.api.BeforeEach;

class Test {

	private static Page01 page;

	@BeforeEach
	public void setUp(){
		page = new Page01();
		page.openApp();
	}

	@org.junit.jupiter.api.Test
	public void registerFlowTest() throws InterruptedException{

		// Registro
		page.AccountRegister();
		Thread.sleep(2000);
		page.sessaoRegistro("Neymar", "Junior", "neymarjr@gmail.com", "Paris", "Alagoas", "55666000", "40028922", "987654321", "gNeymarJr", "12345678", "12345678");
		Thread.sleep(2000);
		page.getClickRegister();
		Thread.sleep(2000);
        String registrado = page.getVerifyTextSuccess();
        assertTrue(registrado.contains("Your account was created successfully. You are now logged in."));
        System.out.println("Usuario registrado: " + registrado);

		// Conta
		page.openAccount();
		Thread.sleep(2000);
		page.getClickType();
		Thread.sleep(2000);
		page.getClickSavings();
		Thread.sleep(2000);
		page.getClickButtonAccount();
		Thread.sleep(2000);
		String criada = page.getVerifyText();
		assertTrue(criada.contains("Congratulations, your account is now open."));
		System.out.println("Conta aberta: " + criada);

		// Visão Geral
		page.getClickOverview();
		Thread.sleep(2000);
		String visualizado = page.getVerifyOverviewText();
		assertTrue(visualizado.contains("*Balance includes deposits that may be subject to holds"));
		System.out.println("Overview: " + visualizado);

		// Tranferir fundos
		page.getClickTransferFunds();
		Thread.sleep(2000);
		String textoTranferirFundos = page.getVerifyTransferFunds();
		assertTrue(textoTranferirFundos.contains("Transfer Funds"));
		System.out.println("Título: " + textoTranferirFundos);
		Thread.sleep(2000);
		page.getClickAmount("1000");
		Thread.sleep(2000);
		page.getClickToAccount();
		Thread.sleep(2000);
		page.getClickChangeAccount();
		Thread.sleep(2000);
		page.getClickTranfer();
		Thread.sleep(2000);
		String textoTranferenciaCompleta = page.getVerifyTextTransferComplete();
		assertTrue(textoTranferenciaCompleta.contains("Transfer Complete!"));
		System.out.println("Conclusão: " + textoTranferenciaCompleta);

		// Atividades da conta




	}

}
