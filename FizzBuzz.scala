object Main extends App{
    for(i <- 1 to 100) {
        if ( i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        } else if ( i % 3 == 0 ) {
            println("Fizz")
        } else if ( i % 5 == 0 ) {
            println("buzz")
        } else {
            println(i);
        }
    }
}
