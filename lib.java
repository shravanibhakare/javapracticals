import java.util.Scanner;

class Student {
    String[] name = new String[1000];
  String[] regno = new String[1000];
      
    int studentCount = 0;

    public void addStudent(String studname, String rollnum) {
        name[studentCount] = studname;
        regno[studentCount] = rollnum;
        studentCount++;
    }

    public void handleStudentFunctionalities(String name, Scanner scanner) {
        while (true) {
            System.out.println("1 Issue New Book,\n 2 for renew book,\n 3 for return book,\n 4 for exit");
            System.out.println("What do you want to select :" + name);
            int choice = scanner.nextInt();
           
           
            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
               
                     System.out.println("book issued successfully"); 
                    break;
                    
                    
                case 2:
                    System.out.println("Enter the title of the book you want to renew");
                    String renewTitle = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String renbauthor = scanner.nextLine();
                   
                    System.out.println("book issued successfully"); 
                    break;
                    
                    
                case 3:
                    System.out.println("Enter the title of the book you want to return");
                    String returnTitle = scanner.nextLine();
                    System.out.println("The book " + returnTitle + " is returned to the library");
                    break;
                    
                    
                case 4:
                    return;
                    
                    
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    
                    
            }
        }
    }
}



class Faculty {
    String[] name = new String[100];
    int facultyCount = 0;

    public void addFaculty(String name) {
        this.name[facultyCount] = name;
        facultyCount++;
    }



    public void handleFacultyFunctionalities(String name, Scanner scanner) {
        while (true) {
            System.out.println("1 Issue New Book,\n 2 for return book,\n 3 for exit");
            System.out.println("What do you want to select :" + name);
            int choice = scanner.nextInt();
             
            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                   
                    System.out.println("book issued successfully"); 
                    break;
                    
                    
                case 2:
                    System.out.println("Enter the title of the book you want to return");
                    String returnTitle = scanner.nextLine();
                    System.out.println("The book " + returnTitle + " is returned to the library");
                    break;
                    
                    
                case 3:
                    return;
                    
                    
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }
    }
}

class LibraryStaff {
    public void LiabstaffFunctionalities(String name, Scanner scanner) {
        while (true) {
            System.out.println("1 Add New Book,\n 2 Remove book,\n 3 check availability of book,\n 4 exit ");
            System.out.println("What do you want to select :" + name);
            int choice = scanner.nextInt();
            
            
           
            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    Book book = new Book();
                    book.addBook(title, author);
                    break;
                    
                    
                case 2:
                    System.out.println("Enter the title of the book you want to remove");
                    String removeTitle = scanner.nextLine();
                    Book b = new Book();
                    boolean isAvailable = b.removeBook(removeTitle);
                    if (isAvailable) {
                        System.out.println("The book " + removeTitle + " is removed from the library");
                    } else {
                        System.out.println("This book is not available in the library");
                    }
                    break;
                    
                    
                case 3:
                    System.out.print("Enter book title: ");
                    String avltitle = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String avlbookauthor = scanner.nextLine();
                    Book avlbook = new Book();
                    isAvailable = avlbook.checkAvailableBook(avltitle, avlbookauthor);
                    if (isAvailable == true) {
                        System.out.println("The book " + avltitle + " is available in library");
                    } else {
                        System.out.println("Sorry! The book " + avltitle + " is not available.");
                    }
                    break;
                    
                    
                case 4:
                    return;
                    
                    
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}



class Book {
    String[] bookNames = new String[1000];
    String[] authorNames = new String[1000];
    int bookCount = 0;
    
    

    public Book() {}
    
    

    public void addBook(String title, String author) {
        if (bookCount < 1000) {
            bookNames[bookCount] = title;
            authorNames[bookCount] = author;
            bookCount++;
            System.out.println("The book " + title + " by " + author + " is added successfully");
        } else {
            System.out.println("Cannot add more books. Maximum capacity reached.");
        }
    }



    public boolean checkAvailableBook(String bookName, String authorName) {
        for (int i = 0; i < bookCount; i++) {
            if (bookNames[i].equalsIgnoreCase(bookName) && authorNames[i].equalsIgnoreCase(authorName)) {
                return true;
            }
        }
        return false;
    }
    
    

    public boolean removeBook(String bookName) {
        for (int i = 0; i < bookCount; i++) {
            if (bookNames[i] != null && bookNames[i].equalsIgnoreCase(bookName)) {
                bookNames[i] = null;
                authorNames[i] = null;
                return true;
            }
        }
        return false;
    }
}



class LibraryManagementSystem {
    String[] staffNames = {"Ram Bhirad", "Shaym shelar", "Shashank Udake", "Sakshi Chopde", "Nisha Dane", "Aarav Patel", "Riya Sharma", "Rohan Gupta", "Ayesha Singh", "Advik Desai", "Ishita Chauhan", "Vihaan Mehta", "Saanvi Shah", "Arjun Joshi", "Zara Malhotra", "Kabir Kumar", "Myra Khanna", "Aryan Verma", "Ananya Reddy", "Aadi Bhatia"};
    int staffCount = staffNames.length;
    
    

    public boolean isValidStaff(String name) {
        for (int i = 0; i < staffCount; i++) {
            if (staffNames[i].equals(name)) {
                return true;
            }
        }
        return false;
    }
    
    

    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Press 1 if you are a student;\n 2 if you are faculty;\n 3 for Library staff;\n 4 to exit");
            int choice = sc.nextInt();
            
            
          
            switch (choice) {
                case 1:
                    System.out.println("You selected student login");
                    System.out.println("Enter your name:");
                    Scanner se = new Scanner (System.in);
                    String studName = se.nextLine();
                    System.out.println("Enter your college ID:");
                    
                    String regNo = se.nextLine();
                    Student s = new Student();
                    s.addStudent(studName, regNo);
                    s.handleStudentFunctionalities(studName, sc);
                    break;
                    
                    
                case 2:
                    System.out.println("You selected faculty login");
                    System.out.println("Enter the name of the respective faculty:");
                    Scanner fe = new Scanner (System.in);
                    String facultyName = fe.nextLine();
                    Faculty f = new Faculty();
                    f.addFaculty(facultyName);
                    f.handleFacultyFunctionalities(facultyName, sc);
                    break;
                    
                    
                case 3:
                     System.out.println("You selected Library Staff login");
                    System.out.println("Please enter your name (with the first letter of the first name and last name capitalized):");
                    Scanner e = new Scanner (System.in);
                    String staffName = e.nextLine();
                    if (lms.isValidStaff(staffName)) {
                        LibraryStaff ls = new LibraryStaff();
                        ls.LiabstaffFunctionalities(staffName, sc);
                    } else {
                        System.out.println("Sorry! Your name is invalid as Library Staff");
                    }
                    
                case 4:
                    sc.close();
                    System.exit(0);
                    
                    
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}

