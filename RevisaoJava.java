package cursoIntensivoJava;
import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;


public class RevisaoJava {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String nome = scanner.next();
		
		LocalDate dataHoje = LocalDate.now();

		Locale brasil = new Locale("PT", "BR");
		
		String diaDaSemana = dataHoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
		
		String saudacao;
		
		LocalDateTime horaAgora = LocalDateTime.now();
		
		if (horaAgora.getHour() >= 0 && horaAgora.getHour() < 12 ) {
			saudacao = "Bom Dia!";
		} else if (horaAgora.getHour() >= 12 && horaAgora.getHour() < 18) {
			saudacao ="Boa Tarde!";
		} else if (horaAgora.getHour() >= 18 && horaAgora.getHour() < 24) {
			saudacao = "Boa Noite!";
		} else {
			saudacao =" ";
		}
		
		System.out.printf("Olá, %s! Hoje é %s, %s %n " , nome , diaDaSemana, saudacao.toUpperCase());
	}
	
} 
