public class Interfaces {
    public static void main(String[] args) {
        
        // Queen q1 = new Queen();
        // q1.moves();

        Bear b1 = new Bear();
        b1.eatGrass();
        b1.eatMeat();

        Bear b2 = new Bear();
        b2.eatMeat();
    }
}

interface ChessPlayer{
    void moves();       // Function here is public and abstract by default
}

class Queen implements ChessPlayer{
    public void moves(){        // Here we have to define public before function
        System.out.println("Queen moves in right, left, up, down, diagonal(in all direction)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){        // Here we have to define public before function
        System.out.println("Rook moves in right, left, up, down)");
    }
}

class King implements ChessPlayer{
    public void moves(){        // Here we have to define public before function
        System.out.println("King moves in right, left, up, down, diagonal(in all direction by 1 step)");
    }
}

interface Herbivore{
    void eatGrass();
}

interface Carnivore{
    void eatMeat();
}

class Bear implements Herbivore, Carnivore{
    public void eatGrass(){
        System.out.println("Bear can eat Grass");
    }

    public void eatMeat(){
        System.out.println("Bear can eat Meat");
    }
}
