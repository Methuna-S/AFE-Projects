package player;

public class Player {
       String name;
       String contactNo;
       String email;
       String address;
       int age;
       public void setPlayerDetails(String name,String address,String contactNo,String email,int age)
       {
        this.name=name;
        this.contactNo=contactNo;
        this.email=email;
        this.address=address;
        this.age=age;
       } 
       public void setPlayerName(String name)
       {
           this.name=name;
       }
       public String getPlayerName()
       {
          return this.name;
       }
       public void setPlayercontact(String contactNo)
       {
           this.contactNo=contactNo;
       }
       public void getPlayerDetails()
       {
           System.out.println("Name: "+this.name);
           System.out.println("ContactNo: "+this.contactNo);
           System.out.println("Email: "+this.email);
           System.out.println("Address: "+this.address);
           System.out.println("Age: "+this.age);
       }

}
