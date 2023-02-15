package application;

import model.Contrato;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Contrato contrato1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o numero do contrato:");
        int numero = scanner.nextInt();

        System.out.println("Informe a data do contrato no formato dd/MM/yyyy:");
        String data = scanner.next();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(data, dateTimeFormatter);

        System.out.println("Informe o valor total do contrato: ");
        String valor = scanner.next();
        valor.replace(',','.');

        contrato1 = new Contrato(numero, localDate,Double.parseDouble(valor));

        System.out.println("Quantas parcelas");
        int par = scanner.nextInt();
        contrato1.geradorParcelas(par);
    }
}
