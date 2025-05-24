enum weekday{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;



public boolean isweekend() {
    return this== SATURDAY|| this==SUNDAY;

}
}

public class enumdemo{
    public static void main(String[] args){
        for(weekday day : weekday.values()){
            if(day.isweekend()){
                System.out.println(day+"is weekend.");
            }
            else{
                System.out.println(day+"is weekday.");
            }
        }
        weekday today=weekday.valueOf("SATURDAY");
        System.out.println("\nTODAY IS "+today);

    }
    
}