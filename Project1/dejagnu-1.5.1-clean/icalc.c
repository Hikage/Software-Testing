#include <stdio.h>
#include <stdlib.h>
#include <string.h>

long int get_operand(char *operand, int *success) {
  char* end;
  long int res = strtol(operand, &end, 10);
  *success = (!*end);
  return res;
}

int main (int argc, char *argv[]) {
  char op;
  long int num1, num2;
  int success;

  if (argc != 4) {
    printf("Error! expect exactly 3 arguments\n");
    return 1;
  } else {
    if(strlen(argv[1]) == 1) {
      op = argv[1][0];
    } else {
      printf("Error! unsupported operator\n");
      return 1;
    }

    num1 = get_operand(argv[2], &success);
    if(!success) {
      printf("Error! wrong operand\n");
      return 1;
    }
    num2 = get_operand(argv[3], &success);
    if(!success) {
      printf("Error! wrong operand\n");
      return 1;
    }
  }

  /* printf("num1: %ld, %ld\n", num1, num2); */
  switch(op) {
  case '+':
    printf("RESULT: %ld\n", num1+num2);
    break;
  case '-':
    printf("RESULT: %ld\n", num1-num2);
    break;
  case '*':
    printf("RESULT: %ld\n", num1*num2);
    break;
  case '/':
    if (num2 == 0) {
      printf("Error! divide by zero\n");
      return 1;
    }
    printf("RESULT: %ld\n", num1/num2);
    break;
  default:
    printf("Error! unsupported operator\n");
    return 1;
  }
  return 0;
}
