import java.io.*;
class Book {
 public static void main(String[] args) throws IOException {
 String name, line;
 int ch, tcost = 0;

 BufferedReader br = new BufferedReader(new
InputStreamReader(System.in));
 File f = new File("book.dat");
 try (RandomAccessFile rf = new RandomAccessFile(f, "rw")) {
 do {
 System.out.println("MENU");
 System.out.println("1. Search\n2. Display books and total cost\nEnter your choice: ");
 ch = Integer.parseInt(br.readLine());
 switch (ch) {
case 1:
rf.seek(0);
System.out.println("Enter book name to search: ");
name = br.readLine();
boolean found = false;
while (rf.getFilePointer() != f.length()) {
line = rf.readLine();
String[] a = line.split(" ");
if (a[1].equalsIgnoreCase(name)) {
System.out.println("Book available");
found = true;
break;
}
}
if (!found) System.out.println("Book Unavailable");
break;
case 2:
rf.seek(0);
tcost = 0;
while (rf.getFilePointer() != f.length()) {
line = rf.readLine();
String[] a = line.split(" ");
int cost = Integer.parseInt(a[2]) * Integer.parseInt(a[3]);
System.out.println(a[1] + "\t" + cost);
tcost += cost;
}
System.out.println("Total cost: " + tcost);
break;
}
} while (ch != 2);
}
}
}
