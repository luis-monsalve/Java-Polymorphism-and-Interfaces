


public class PieceWorker extends Employee {

    private double wage;  //wage per piece
    private double pieces;  //number of pieces produced

    //constructor
    public PieceWorker (String firstName, String lastName, String socialSecurityNumber,
                        double wage, double pieces){
        super(firstName, lastName, socialSecurityNumber);

        if(wage < 0.0) //validate wage
            throw new IllegalArgumentException("Wage per piece must be > 0.0");

        if(pieces < 0.0) //validate pieces
            throw new IllegalArgumentException("Pieces produced must be > 0.0");

        this.wage = wage;
        this.pieces = pieces;

    }
    //set wage per piece
    public void setWage(double wage){
        if(wage < 0.0) //validate wage
            throw new IllegalArgumentException("Wage per piece must be > 0.0");
        this.wage= wage;
    }
    //return wage
    public double getWage(){return wage;}

    //set number of pieces
    public void setPieces(double pieces){
        if(pieces < 0.0) //validate number of pieces
            throw new IllegalArgumentException("Pieces produced must be > 0.0");
        this.pieces = pieces;
    }

    //return number of pieces
    public double getPieces(){return pieces;}

    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings(){

        return getWage() * getPieces();

    }

    // return String representation of PieceWorker object
    @Override
    public String toString(){

        return String.format("piece employee: %s%n%s: $%,.2f;  %s: %,.2f",
                super.toString(), "wage per piece", getWage(),"piece produced",getPieces());

    }

}// end class PieceWorker
