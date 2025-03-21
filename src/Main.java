import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitorTexto = new Scanner(System.in);
        Scanner leitorNumerico = new Scanner(System.in);
        String marca = "",
                modelo = "",
                placa = "",
                horarioEntrada = "",
                horarioSaida = "-",
                preco = "-";
        int opcao;

        do {
            System.out.println("\n************ MENU *************");
            System.out.println("(1) - Listar dados do carro");
            System.out.println("(2) - Cadastrar carro");
            System.out.println("(3) - Atualizar vaga de carro (saída)");
            System.out.println("(4) - Sair");
            System.out.println("*");
            System.out.print("Selecione uma opção: ");
            opcao = leitorNumerico.nextInt();
            System.out.println("*");

            switch (opcao) {
                case 1:
                    if (!placa.isEmpty()) {
                        System.out.println("Marca: " + marca);
                        System.out.println("Placa: " + placa);
                        System.out.println("Modelo: " + modelo);
                        System.out.println("Horário de entrada: " + horarioEntrada);
                        System.out.println("Horário de saída: " + horarioSaida);

                        if (!preco.equals("-")) {
                            System.out.println("Valor pago: R$" + preco);
                        }

                    } else {
                        System.out.println("Nenhum carro cadastrado.");
                    }
                    break;
                case 2:
                    if (!placa.isEmpty()) {
                        System.out.println("Nenhuma vaga disponível no momento.");
                    } else {
                        System.out.print("Digite a marca do carro: ");
                        marca = leitorTexto.nextLine();

                        System.out.print("Digite a placa do carro: ");
                        placa = leitorTexto.nextLine();

                        System.out.print("Digite o modelo do carro: ");
                        modelo = leitorTexto.nextLine();

                        System.out.print("Digite o horário de entrada (HH:mm): ");
                        horarioEntrada = leitorTexto.nextLine();

                        horarioSaida = "-";
                        preco = "-";

                        System.out.println("Carro cadastrado com sucesso!");
                    }
                    break;
                case 3:
                    if (placa.isEmpty()) {
                        System.out.println("Nenhum carro para dar saída.");
                    } else {
                        System.out.print("Digite a placa do carro que deseja dar saída: ");
                        String placaPesquisa = leitorTexto.nextLine();

                        if (placaPesquisa.equals(placa)) {
                            System.out.print("Digite o horário de saída: ");
                            horarioSaida = leitorTexto.nextLine();

                            System.out.println("\nHorário de entrada: " + horarioEntrada +
                                    "\nHorário de saída: " + horarioSaida);

                            System.out.print("\nDigite o valor a ser pago: R$ ");
                            preco = leitorTexto.nextLine();

                            System.out.println("Total pago: R$" + preco);

                            marca = "";
                            modelo = "";
                            placa = "";
                            horarioEntrada = "";
                            horarioSaida = "-";
                            preco = "-";

                            System.out.println("Vaga liberada com sucesso!");
                        } else {
                            System.out.println("Carro não encontrado.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Sistema finalizado com sucesso!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
    }
}