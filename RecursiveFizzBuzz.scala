object Main extends App{
    def FizzBuzz(current: Int, max: Int) {
        if (current <= max) {
            if ( current % 3 == 0 && current % 5 == 0) {
                print("FizzBuzz, ")
            } else if ( current % 3 == 0 ) {
                print("Fizz, ")
            } else if ( current % 5 == 0 ) {
                print("buzz, ")
            } else {
                print(current + ", ")
            }
            FizzBuzz(current + 1, max)
        } else {
            return
        }
    }
    
    FizzBuzz(1,100);
}
