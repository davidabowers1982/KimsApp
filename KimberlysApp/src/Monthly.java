import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Monthly 
{
	boolean Occurrence;
	LocalDate Current =  LocalDate.now();
	DateTimeFormatter CurrentFormatted = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	String FormattedDate = Current.format(CurrentFormatted);
}
