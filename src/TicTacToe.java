public class TicTacToe {
    public static void main(String... args){
      
        char[][] chars = {{'X', 'O', 'X'}, {'X', 'X', 'O'},{'O', 'X', 'X'}};

        for (char[] row: chars){
            for(char c: row){
                if ( c == 'X'){
                    System.out.printf("%d ", 1);
                 } else if (c == 'O'){
                     System.out.printf("%d ", 0);
                 }
                }
            System.out.println();
            }
        }
}

