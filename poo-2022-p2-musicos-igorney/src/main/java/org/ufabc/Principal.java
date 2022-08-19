package org.ufabc;

import org.ufabc.musico.Musico;
import org.ufabc.musico.instrumento.corda.Guitarra;
import org.ufabc.musico.instrumento.corda.Violao;
import org.ufabc.musico.instrumento.piano.Armario;
import org.ufabc.musico.instrumento.piano.EfeitoSonoro;
import org.ufabc.musico.instrumento.piano.Piano;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    private static final ArrayList<Musico> musicos = new ArrayList<Musico>();

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = -1;
        while (opcao != 0) {

            opcao = menu();

            switch (opcao) {
                case 1: {
                    adicionarMusico();
                    break;
                }
                case 2: {
                    adicionarInstrumento();
                    break;
                }
                case 3: {
                    tocarInstrumento();
                    break;
                }
                case 4: {
                    mostrarInformacoes();
                    break;
                }
                case 5: {
                    listarTodosMusicos();
                    break;
                }
                case 0: {
                    System.out.println("Obrigado por usar a Agenda.");
                    System.exit(opcao);
                    break;
                }
                default: {
                    System.out.println("Opção " + opcao + " inválida.");
                    break;
                }
            }
        }
        scan.close();
    }

    private static void mostrarInformacoes() {
        System.out.println("Nome do musico");
        String nome = scan.nextLine();
        Musico musico = buscarMusico(nome);
        try {
            System.out.println(musico.toString());
        } catch (NullPointerException e) {
            System.out.println("Musico não encontrado");
        }
    }

    private static void listarTodosMusicos() {
        for (Musico musico : musicos) {
            System.out.println(musico.toString());
        }
    }

    private static void tocarInstrumento() {
        System.out.println("Nome do musico");
        String nome = scan.nextLine();
        Musico musico = buscarMusico(nome);
        try {
            System.out.println(musico.tocarInstrumento());
        } catch (NullPointerException e) {
            System.out.println("Musico não encontrado");
        }
    }

    private static void adicionarInstrumento() {
        System.out.println("Nome do musico");
        String nome = scan.nextLine();
        Musico musico = buscarMusico(nome);
        try {
            switch (menuInstrumentos()) {
                case 1: {
                    System.out.println("Numero de cordas do Violao");
                    int cordas = scan.nextInt();
                    Violao violao = new Violao(cordas);
                    musico.adicionarInstrumento(violao);
                    break;
                }
                case 2: {
                    System.out.println("Numero de cordas da Guitarra");
                    int cordas = scan.nextInt();
                    Guitarra guitarra = new Guitarra(cordas);
                    musico.adicionarInstrumento(guitarra);
                    break;
                }
                case 3: {
                    System.out.println("Piano digital? (true/false)");
                    Boolean digital = scan.nextBoolean();
                    System.out.println("Numero de pedais do Piano");
                    int pedais = scan.nextInt();
                    System.out.println("Numero de teclas do Piano");
                    int teclas = scan.nextInt();
                    System.out.println("------ Dados registrados ------");
                    System.out.println("Madeira do armario do Piano");
                    String madeira = scan.nextLine();
                    System.out.println("Efeito sonoro do Piano");
                    String efeito = scan.nextLine();
                    Armario armario = new Armario(madeira);
                    Piano piano = new Piano(digital, pedais, teclas, armario);
                    EfeitoSonoro efeitoSonoro = new EfeitoSonoro(efeito);
                    piano.adicionarEfeitoSonoro(efeitoSonoro);
                    musico.adicionarInstrumento(piano);
                    break;
                }
                default: {
                    System.out.println("Opção inválida.");
                    break;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Musico não encontrado");
        }

    }

    private static Musico buscarMusico(String nome) {
        for (Musico musico : musicos) {
            if (nome.equals(musico.getNome())) {
                return musico;
            }
        }
        return null;
    }

    private static void adicionarMusico() {
        System.out.println("Digite o nome:");
        String nome = scan.nextLine();
        Musico musico = new Musico(nome);
        musicos.add(musico);
        System.out.println("----------------");
        System.out.println("Musico Cadastrado com Sucesso");
        System.out.println(musico);
        System.out.println(musicos);
    }

    private static int menu() {
        try {
            System.out.println("\n");
            System.out.println("Digite uma opção:");
            System.out.println("1- Adicionar musico");
            System.out.println("2- Adicionar Instrumento a um musico");
            System.out.println("3- Tocar instrumento");
            System.out.println("4- Mostrar informacoes musico");
            System.out.println("5- Listar todos os musicos");
            System.out.println("0- Sair");
            System.out.println("----------------");
            return Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Escreva um número dentro do intervalo;");
            return -1;
        }
    }

    private static int menuInstrumentos() {
        try {
            System.out.println("\n");
            System.out.println("Digite uma opção:");
            System.out.println("1- Adicionar Violao");
            System.out.println("2- Adicionar Guitarra");
            System.out.println("3- Adicionar Piano");
            System.out.println("0- Sair");
            System.out.println("----------------");
            return Integer.parseInt(scan.nextLine());
        } catch (NullPointerException e) {
            System.out.println("Escreva um número dentro do intervalo;");
            return -1;
        }
    }
}