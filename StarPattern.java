public class StarPattern {
    public static void main(String[] args) {
        
        // //Print Star
        // for(int line = 1; line <= 4; line++){
        //     for(int star = 1; star <= line; star++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // //Print Inverted Star
        // int n = 4;
        // for(int line=1; line<=n; line++ ){
        //     for(int star=1; star <= n - line + 1; star++ ){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // //Number Pyramid
        // int n = 7;
        // for(int line=1; line<=n; line++){
        //     for(int number=1; number<=line; number++){
        //         System.out.print(number + " ");
        //     }
        //     System.out.println();
        // }

        //Print Character pattern 
        int n = 7;
        char ch = 'A';

        for(int line=1; line<=n; line++){
            for(int chars=1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
