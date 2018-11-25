package fr.epsi.POEI.PapoteCar.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import fr.epsi.POEI.PapoteCar.domain.Utilisateur;

public class DateManipulations {
	
	/**
	 * Obtient les deux dates bornes des personnes ayant le même âge que celui renseigné.
	 * @param age
	 * @return
	 */
	public static List<Date> getBeginAndEndDatesByAge(int age){
		Calendar curCal = Calendar.getInstance();
		curCal.add(Calendar.YEAR, -age);
		
		Date highDate = curCal.getTime();
		
		curCal.add(Calendar.YEAR, -1);
		Date lowDate = curCal.getTime();
		
		return Arrays.asList(highDate, lowDate);
	}
	
	public static int getUserAge(Utilisateur user) {
		LocalDate today = LocalDate.now();
		LocalDate birthday = DateManipulations.convertToLocalDateTimeViaInstant(user.getDateDeNaissance());
		 
		Period p = Period.between(birthday, today);
		
		return p.getYears();
	}
	
	public static LocalDate convertToLocalDateTimeViaInstant(Date dateToConvert) {
	    return dateToConvert.toInstant()
	      .atZone(ZoneId.systemDefault()).toLocalDate();
	}
	
	public static String convertDateToSQLString(Date date) {		 
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		String text = df.format(date);
		 
		return text;
	}
}
