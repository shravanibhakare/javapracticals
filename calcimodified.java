import java.util.Scanner;
import java.lang.Math;

class Calculator {
    static Scanner sc = new Scanner(System.in);

    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mult(double a, double b) {
     if (b == 0) {
            throw new ArithmeticException("Multiplied by zero");
        }
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    public static double mod(double a, double b) {
     if (b == 0) {
            throw new ArithmeticException("b cannot be 0 ");
        }
        return a % b;
    }

    public static double power(double a, double b) {
    if (b == 0) {
        throw new ArithmeticException("Exponent b cannot be 0");
    }
    double result = 1.0;
   
    double exponent = Math.abs(b);  //takes negative value of exponants to handle negative value of exponants properly
    for (int i = 0; i < exponent; i++) {
        result *= a;
    }
    if (b < 0) {
        result = 1.0 / result;
    }
    return result;
    }

    public static double logarithm(double num, double base) {
        if (num > 0 && base > 1) {
            return Math.log(num) / Math.log(base);
        } else {
            return -1;
        }
    }

    public static double square(double a) {
        return a * a;
    }

    public static double cube(double a) {
        return a * a * a;
    }

    public static double cubeRoot(double a) {
       /* if (a == 0 || a == 1) {
            return a;
        } else {
            double result = 1;
            double i = a / 2;
            while (i != 0) {
                if (a == i * i * i) {
                    return i;
                }
                i--;
            }
            return result; 
        }*/
        if (a < 0) {
        throw new IllegalArgumentException("Cannot compute cuberoot of a negative number");
    }

      return Math.cbrt(a);
    }

    public static double squareRoot(double a) {
    if (a < 0) {
        throw new IllegalArgumentException("Cannot compute squareroot of a negative number");
    }
       if (a == 0 || a == 1) {
            return a;
        } else {
            double result = 1;
            double i = a / 2.0;
            while (i != 0) {
                if (a == i * i) {
                    return i;
                }
                i--;
            }
            return result; 
        }
       /* if (a < 0) {
        throw new IllegalArgumentException("Cannot compute cuberoot of a negative number");
    }
          return Math.sqrt(a);*/
        
    }

    public static double inverse(double a) {
        if (a == 0) {
            throw new ArithmeticException("Inverse of zero is undefined");
        }
        return 1 / a;
    }

    public static double sineAngle(double theta) {
        return Math.sin(theta);
    }

    public static double cosAngle(double theta) {
        return Math.cos(theta);
    }

    public static double tanAngle(double theta) {
        return Math.tan(theta);
    }

    public static double cotAngle(double theta) {
        return 1 / Math.tan(theta);
    }

    public static double secAngle(double theta) {
        return 1 / Math.cos(theta);
    }

    public static double cosecAngle(double theta) {
        return 1 / Math.sin(theta);
    }

    private static double factorial(double n) {
        if (n == 0) {
            return 1;
        }
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static double permutation(double n, double r) {
        return factorial(n) / factorial(n - r);
    }

    public static double combination(double n, double r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static double nthRoot(double number, int root) {
        return Math.pow(number, 1.0 / root);
    }

    public static void quadraticEquation(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Root 1: " + root1 + "\nRoot 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        } else {
            System.out.println("No real roots");
        }
    }

    public static double exp(double x) {
        return Math.exp(x);
    }

    public static String decimalToBinary(double decimalNumber) {
        StringBuilder binaryDigits = new StringBuilder();
        int precisionLimit = 32;

        // Multiply fractional part by 2 until it becomes zero or until precision limit
        while (decimalNumber > 0 && binaryDigits.length() < precisionLimit) {
            decimalNumber *= 2;
            if (decimalNumber >= 1) {
                binaryDigits.append('1');
                decimalNumber -= 1;
            } else {
                binaryDigits.append('0');
            }
        }
        return binaryDigits.toString();
    }

    public static double degreeToRadian(double degree) {
        return Math.toRadians(degree);
    }

    public static double calculateMean(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public static double calculateVariance(double[] numbers, double mean) {
        double sumOfSquaredDifferences = 0;
        for (double num : numbers) {
            sumOfSquaredDifferences += Math.pow(num - mean, 2);
        }
        return sumOfSquaredDifferences / numbers.length;
    }

    public static double calculateStdDev(double[] numbers) {
        double mean = calculateMean(numbers);
        double variance = calculateVariance(numbers, mean);
        return Math.sqrt(variance);
    }
    
    public static String decimalToHex(int decimal) {
    StringBuilder hex = new StringBuilder();
    if (decimal == 0) {
        return "0";
    }
    while (decimal != 0) {
        int remainder = decimal % 16;
        if (remainder < 10) {
            hex.insert(0, (char) ('0' + remainder)); // Convert remainder to character
        } else {
            hex.insert(0, (char) ('A' + remainder - 10)); // Convert remainder to character
        }
        decimal /= 16; // Update decimal by dividing by 16
    }
    return hex.toString();
  }


    public static void main(String[] args) {
        boolean exit = false;
        double result = 0;
        while (!exit) {
            System.out.println();
            System.out.println("Enter operation (+, -, *, /, %, log, square, cube, sqroot, cuberoot, power, inverse, sine, cos, tan, cot, sec, cosec, factorial, permutation, combination, nthroot, quadequn, epowx, dectobin, degToRadians, mean, variance, standarddev, , exit):");
            System.out.println("Enter the first number followed by the operation:");

            double number1 = sc.nextDouble();
            double number2;

            try {
                String option = sc.next();

                switch (option) {
  /*1*/            case "+":
                        number2 = sc.nextDouble();
                        result = add(number1, number2);
                        break;
 /*2*/              case "-":
                        number2 = sc.nextDouble();
                        result = sub(number1, number2);
                        break;
 /*3*/              case "*":
                        number2 = sc.nextDouble();
                        result = mult(number1, number2);
                        break;
/*4*/               case "/":
                        number2 = sc.nextDouble();
                        result = divide(number1, number2);
                        break;
/*5*/               case "%":
                        number2 = sc.nextDouble();
                        result = mod(number1, number2);
                        break;
/*6*/                case "power":
                        number2 = sc.nextDouble();
                        result = power(number1, number2);
                        break;
 /*7*/              case "log":
                        number2 = sc.nextDouble();
                        result = logarithm(number1, number2);
                        break;
/*8*/               case "square":
                        result = square(number1);
                        break;
/*9*/              case "cube":
                        result = cube(number1);
                        break;
/*10*/             case "sqroot":
                        result = squareRoot(number1);
                        break;
 /*11*/           case "cuberoot":
                        result = cubeRoot(number1);
                        break;
 /*12*/            case "inverse":
                        result = inverse(number1);
                        break;
 /*13*/             case "sine":
                        result = sineAngle(number1);
                        break;
/*14*/             case "cos":
                        result = cosAngle(number1);
                        break;
/*15*/              case "tan":
                        result = tanAngle(number1);
                        break;
/*16*/               case "cot":
                        result = cotAngle(number1);
                        break;
/*17*/             case "sec":
                        result = secAngle(number1);
                        break;
/*18*/             case "cosec":
                        result = cosecAngle(number1);
                        break;
/*19*/          case "factorial":
                        result = factorial(number1);
                        break;
/*20*/          case "permutation":
                        number2 = sc.nextDouble();
                        result = permutation(number1, number2);
                        break;
/*21*/         case "combination":
                        number2 = sc.nextDouble();
                        result = combination(number1, number2);
                        break;
/*22*/          case "nthroot":
                        number2 = sc.nextDouble();
                        result = nthRoot(number1, (int) number2);
                        break;
/*23*/           case "quadequn":
                        number2 = sc.nextDouble();
                        double number3 = sc.nextDouble();
                        quadraticEquation(number1, number2, number3);
                        break;
/*24*/         case "epowx":
                        result = exp(number1);
                        break;
/*25*/      case "dectobin":
                        String binary = decimalToBinary(number1);
                        System.out.println("Result: " + binary + "  //ignore second result");
                        break;
/*26*/         case "degToRadians":
                        result = degreeToRadian(number1);
                        break;
/*27*/         case "mean":
                        double[] numsMean = takeArrayInputOfNumbers();
                        result = calculateMean(numsMean);
                        break;
/*28*/         case "variance":
                        double[] numsVariance = takeArrayInputOfNumbers();
                        result = calculateVariance(numsVariance, calculateMean(numsVariance));
                        break;
/*29*/     case "standarddev":
                        double[] numsStdDev = takeArrayInputOfNumbers();
                        result = calculateStdDev(numsStdDev);
                        break;
/*30*/      case "dectohex":
                        int intNumber = (int) number1;
                        String hexadecimal = decimalToHex(intNumber);
                        System.out.println("Result: " + hexadecimal + "  //ignore second result");
                        break;               
                    case "exit":
                        exit = true;
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
                if (!exit) {
                    System.out.println("Result: " + result);
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                sc.nextLine(); // clear input buffer
            }
        }
        sc.close();
    }

    public static double[] takeArrayInputOfNumbers() {
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        double[] numbers = new double[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextDouble();
        }
        return numbers;
    }
}

