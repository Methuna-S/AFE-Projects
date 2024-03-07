package player;

public class Player1 {
    private String name;
    private char symbol;
    private String address;
    private String contactNumber;
    private String email;
    private int age;
    public void setPlayerDetails(String name,char symbol,String address,String contactNumber,String email,int age)
    {
        this.name=name;
        this.symbol=symbol;
        this.address=address;
        this.contactNumber=contactNumber;
        this.email=email;
        this.age=age;
    }
    public void setPlayerNameAndAge(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void setPlayerNameSymbolEmailAge(String name,char symbol,String email,int age)
    {
        this.name=name;
        this.age=age;
        this.email=email;
        this.symbol=symbol;
    }
    public void setPlayerNameAndSymbol(String name,char symbol)
    {
        this.name=name;
        this.symbol=symbol;
    }
    public String getPlayeName()
    {
        return this.name;
    }
    public char getPlayeSymbol()
    {
        return this.symbol;
    }
    public void getPlayerDetail()
    {
        System.out.println("Player Name: "+this.name);
        System.out.println("Player Symbol: "+this.symbol);
        System.out.println("Player EmailID "+this.email);
        System.out.println("Player Age: "+this.age);
        System.out.println("Player Contact Number: "+this.contactNumber);
        System.out.println("Player Address: "+this.address);
    }
    public void changeSymbol(char symbol)
    {
        this.symbol=symbol;
    }
    public void getPlayerNameAndSymbol()
    {
        System.out.println("Player Name: "+this.name);
        System.out.println("Player Symbol: "+this.symbol);
        // this.name=x;
        // this.symbol=c;
    }
    public String getPlayerName()
    {
        return this.name;
    }
}
