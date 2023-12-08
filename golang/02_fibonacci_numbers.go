package main

import "fmt"

func main() {
    sum := 0
    prev, curr := 0, 1

    for curr <= 4000000 {
        next := prev + curr
        if next%2 == 0 {
            sum += next
        }
        prev = curr
        curr = next
    }

    fmt.Println(sum)
}
