package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;;



public class MainController {
	@FXML
	private Label result;
	public TextField textDaysUntil;
	
	@FXML
	public void processHolidays(ActionEvent event) {
		var selectedHoliday = ((Button)event.getSource()).getText();
		result.setText(selectedHoliday);
		
		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
		String textToday = today.format(formatter);
		System.out.print("Today's date is: " + textToday);
		
		int nyMonth = 1;
		int nyDay = 1;
		int nyYear = 2021;
		
		int vMonth = 2;
		int vDay = 14;
		int vYear = 2021;
		
		int eMonth = 4;
		int eDay = 4;
		int eYear = 2021;
		
		int j4Month = 7;
		int j4Day = 4;
		int j4Year = 2021;
		
		int hMonth = 10;
		int hDay = 31;
		int hYear = 2020;
		
		int thMonth = 11;
		int thDay = 26;
		int thYear = 2020;
		
		int chMonth = 12;
		int chDay = 25;
		int chYear = 2020;
		
		
		int thisMonth = today.getMonthValue();
		
		LocalDate newyearsDate = LocalDate.of(nyYear, nyMonth, nyDay);
		if (newyearsDate.isBefore(today)) {
			newyearsDate = newyearsDate.plusYears(1);
		}
		
		long daystoNewYears = today.until(newyearsDate, ChronoUnit.DAYS);		
		
		LocalDate valentinesDate = LocalDate.of(vYear, vMonth, vDay);
		if (valentinesDate.isBefore(today)) {
			valentinesDate = valentinesDate.plusYears(1);
		}
		
		long daystoValentines = today.until(valentinesDate, ChronoUnit.DAYS);
		
		LocalDate easterDate = LocalDate.of(eYear, eMonth, eDay);
		if (easterDate.isBefore(today)) {
			easterDate = easterDate.plusYears(1);
		}
		
		long daystoEaster = today.until(easterDate, ChronoUnit.DAYS);
		
		LocalDate july4Date = LocalDate.of(j4Year, j4Month, j4Day);
		if (july4Date.isBefore(today)) {
			july4Date = july4Date.plusYears(1);
		}
		
		long daystoJuly4 = today.until(july4Date, ChronoUnit.DAYS);
		
		LocalDate halloweenDate = LocalDate.of(hYear, hMonth, hDay);
		if (halloweenDate.isBefore(today)) {
			halloweenDate = halloweenDate.plusYears(1);
		}
		
		long daystoHalloween = today.until(halloweenDate, ChronoUnit.DAYS);
		
		LocalDate thanksgivingDate = LocalDate.of(thYear, thMonth, thDay);
		if (thanksgivingDate.isBefore(today)) {
			thanksgivingDate = thanksgivingDate.plusYears(1);
		}
		
		long daystoThanksgiving = today.until(thanksgivingDate, ChronoUnit.DAYS);
		
		LocalDate christmasDate = LocalDate.of(chYear, chMonth, chDay);
		if (christmasDate.isBefore(today)) {
			christmasDate = christmasDate.plusYears(1);
		}
		
		long daystoChristmas = today.until(christmasDate, ChronoUnit.DAYS);
		
		if (selectedHoliday.equals("New Years")) {
			textDaysUntil.setText(daystoNewYears + " days");
		   }
		else if (selectedHoliday.equals("Valentine's Day")) {
			textDaysUntil.setText(daystoValentines + " days");
		   }
		else if (selectedHoliday.equals("Easter")) {
			textDaysUntil.setText(daystoEaster + " days");
		   }
		else if (selectedHoliday.equals("4th of July")) {
			textDaysUntil.setText(daystoJuly4 + " days");
		   }
		else if (selectedHoliday.equals("Halloween")) {
			textDaysUntil.setText(daystoHalloween + " days");
		   }
		else if (selectedHoliday.equals("Thanksgiving")) {
			textDaysUntil.setText(daystoThanksgiving + " days");
		   }
		else if (selectedHoliday.equals("Christmas")) {
			textDaysUntil.setText(daystoChristmas + " days");
		   }
		
	}
}