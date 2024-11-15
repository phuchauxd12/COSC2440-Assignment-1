package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class DateHandler {
    public static Date  parseDate(String input) {
        SimpleDateFormat inputFormatter = new SimpleDateFormat("dd/MM/yyyy");

        try {
            return inputFormatter.parse(input);
        } catch (ParseException e) {
            return null;
        }
    }

    public static String formatDate(Date date) {
        SimpleDateFormat outputFormatter = new SimpleDateFormat("dd MMMM yyyy");
        return outputFormatter.format(date);
    }
}
