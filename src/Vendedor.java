package br.senai.sp.jandira.ds1m.comissoes.model;


import java.util.Scanner;

public class Vendedor {
    String nomeVendedor;
    double TotaldeVendas;
    double percentualDeComissao;
    double ValorDaComissaoEmReais;

    public void ObterDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual é o nome do Vendedor: ");
        nomeVendedor = scanner.nextLine();
        System.out.print("Qual o total de vendas: R$");
        TotaldeVendas = scanner.nextDouble();

        comissao();

    }

    public void comissao() {

        if (TotaldeVendas > 20000) {
            percentualDeComissao = 10;
            ValorDaComissaoEmReais = (TotaldeVendas * percentualDeComissao) / 100;
        } else if (TotaldeVendas <= 20000) {
            percentualDeComissao = 5;
            ValorDaComissaoEmReais = (TotaldeVendas * percentualDeComissao) / 100;
        }
        resultado();

    }

    public void resultado() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("Aqui está seu resultado:");
        System.out.println("----------------------------------");
        System.out.println("Nome: " + nomeVendedor);
        System.out.println("Seu Total de Vendas: R$" + TotaldeVendas);
        System.out.println("Seu percentual de comissão: " + percentualDeComissao + "%");
        System.out.println("Valor da sua comissão em reais: R$" + ValorDaComissaoEmReais);

        System.out.println("Quer calcular novamente? ");
        System.out.println("1 - Sim - 2 - Não");
        int resposta = scanner.nextInt();

    if (resposta == 1){
        ObterDados();
    } else {
        System.out.print("Encerrando Sistema...");
    }
    }
}
