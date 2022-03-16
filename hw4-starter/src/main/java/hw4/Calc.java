package hw4;


import java.util.Scanner;

/**
 * A program for an RPN calculator that uses a stack.
 */
public final class Calc {
  /**
   * The main function.
   *
   * @param args Not used.
   */
  private static LinkedStack<Integer> stack;
  private static int count;

  public static int getCount() {
    return count;
  }

  public static void calculate(String operation) {
    if (getCount() >= 2) {
      boolean revert = false;
      //checks to make sure there are enough arguments
      int newval = stack.top();
      stack.pop();
      count--;

      switch(operation) {
        case "+":
          newval = stack.top() + newval;
          break;
        case "-":
          newval = stack.top() - newval;
          break;
        case "*":
          newval = stack.top() * newval;
          break;
        case "/":
          if (newval != 0) {
            newval = stack.top() / newval;
          }  else {
            System.out.println("ERROR: Division by 0");
            revert = true;
            stack.push(newval);
            count++;
          }
          break;
        case "%":
          newval = stack.top() % newval;
          break;
      }
      if (!revert) {
        stack.pop();
        stack.push(newval);
      }
    } else {
      System.out.println("ERROR: Not enough arguments");
    }
  }

  public static void getHead() {
    if(getCount() > 0) {
      System.out.println(stack.top());
    } else {
      System.out.println("ERROR: Stack is empty");
    }
  }

  public static void operate(String operation) {
    switch (operation) {
      case "?":
        System.out.println(stack.toString());
        break;
      case ".":
        getHead();
        break;
      case "!":
        break;
      case "+": case "-": case "/": case "*": case "%":
        calculate(operation);
        break;
      default:
        System.out.println("ERROR: Bad token");
    }
  }

  public static void main(String[] args) {
    //creates the scanner for command line
    Scanner sc = new Scanner(System.in);
    stack = new LinkedStack<Integer>();
    count = 0;
    while (sc.hasNext()) {
      if (sc.hasNextInt()) {
        stack.push(sc.nextInt());
        count++;
      } else if(sc.hasNextFloat()) {
        System.out.println("ERROR: Input must be an integer");
        sc.next();
      } else {
        String operation = sc.next();
        if ("!".equals(operation)) {
          return;
        }
        operate(operation);
      }
    }
  }
}
