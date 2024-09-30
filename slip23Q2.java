class InvalidDateException extends Exception {
InvalidDateException() {
System.out.println("The given date is invalid");
}
}
class InvalidMonthException extends Exception {
InvalidMonthException() {
System.out.println("The given month is invalid");
}
}
class Date{
public static void main(String args[]) {
int dd = Integer.parseInt(args[0]);
int mm = Integer.parseInt(args[1]);
long yy = Long.parseLong(args[2]);
try {
if (mm < 1 || mm > 12) throw new InvalidMonthException();
boolean leapYear = (yy % 4 == 0 && yy % 100 != 0) || (yy % 400 == 0);
int maxDays = switch (mm) {
case 4, 6, 9, 11 -> 30;
case 2 -> (leapYear) ? 29 : 28;
default -> 31;
};
if (dd < 1 || dd > maxDays) throw new InvalidDateException();
System.out.println("The given date is valid" + (mm == 2 &&
leapYear ? " and it is a leap year" : ""));
} catch (InvalidMonthException | InvalidDateException e) {
}
}
}
