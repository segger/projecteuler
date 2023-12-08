#include <stdio.h>

int main(void) {
    int sum = 0;
    int prev = 0, curr = 1, next = 0;

    while (next <= 4000000) {
        next = prev + curr;
        if (next % 2 == 0) {
            sum += next;
        }
        prev = curr;
        curr = next;
    }

    printf("Sum: %d\n", sum);
    return 0;
}
